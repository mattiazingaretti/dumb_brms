package org.dummy.brms.dummy_brms.mybatis.handlers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.*;

public class JsonTypeHandler<T> extends BaseTypeHandler<T> {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    private final Class<T> type;

    public JsonTypeHandler(Class<T> type) {
        if (type == null) throw new IllegalArgumentException("Type argument cannot be null");
        this.type = type;
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType) throws SQLException {
        ps.setObject(i, toJson(parameter), Types.OTHER);
    }

    @Override
    public T getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return toObject(rs.getString(columnName));
    }

    @Override
    public T getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return toObject(rs.getString(columnIndex));
    }

    @Override
    public T getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return toObject(cs.getString(columnIndex));
    }

    private String toJson(T object) throws SQLException {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            throw new SQLException("Failed to convert object to JSON string: " + e.getMessage(), e);
        }
    }

    private T toObject(String content) throws SQLException {
        if (content == null || content.trim().isEmpty()) {
            return null;
        }
        try {
            return objectMapper.readValue(content, type);
        } catch (Exception e) {
            throw new SQLException("Failed to convert JSON string to object: " + e.getMessage(), e);
        }
    }
}