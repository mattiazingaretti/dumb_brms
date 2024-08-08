package org.dummy.brms.dummy_brms.model.deserializers;

import java.io.IOException;
import java.util.UUID;

import org.dummy.brms.dummy_brms.model.factfields.FactField;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class FactFieldDeserializer extends JsonDeserializer<FactField<?>> {


    @Override
    public FactField<?> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
        JsonNode node = p.getCodec().readTree(p);

        UUID factFieldId = UUID.fromString(node.get("factFieldId").asText());
        String fieldName = node.get("fieldName").asText();
        JsonNode valueNode = node.get("value");

        Object value;
        if (valueNode.isNumber()) {
            value = valueNode.decimalValue(); // Convert any numeric value to BigDecimal
        } else if (valueNode.isTextual()) {
            value = valueNode.asText(); // Keep String values as String
        } else {
            // Handle other types as needed
            throw new IllegalArgumentException("Unsupported value type");
        }

        FactField<Object> factField = new FactField<>();
        factField.setFactFieldId(factFieldId);
        factField.setFieldName(fieldName);
        factField.setValue(value);

        return factField;
    }

}
