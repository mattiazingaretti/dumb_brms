package org.dummy.brms.dummy_brms.exception;


public enum ErrorCode {

    BAD_REQUEST(400_000, "Bad Request"),
    MISSING_RULES_TO_BE_POSTED(400_001, "Missing Rules to be posted"),
    MISSING_PROJECT_ID(400_002, "Missing Project ID"),

    UNAUTHORIZED(403_000, "Unauthorized"),
    UNAUTHORIZED_PROJECT_FOR_CURRENT_USER(403_001, "Unauthorized Project for current user"),
    NOT_FOUND(404_000, "Not Found"),
    FACT_FIELD_NOT_FOUND(404_001, "Fact field not found"),
    MISSING_PROJECT_NAME(404_002, "Project to be added does not have a name"),

    INTERNAL_SERVER_ERRROR(500_000, "Internal Server Error"),
    FAILED_TO_EVALUATE_CONDITION(500_001, "Failed To evaluate condition"),
    UNARY_FIXED_FIELD_IS_NOT_BOOL(500_002, "Expected Fixed field value in Unary Constraint to be a Boolean "),
    TYPE_MISMATCH_IN_BINARY_CONSTRAINT(500_003, "Type mismatch in left and right operands in binary constraint "),
    FAILED_TO_GET_FACT_FIELD_TYPE(500_004,"Expected all fact field to be the same type"),
    FAILED_TO_GET_VALUE_TYPE(500_005,"Failed To get value Type"),
    MEANINGLESS_CONSTRAINT(500_006,"Fixed values binary constraint is meaningless"),
    FAILED_TO_INSERT_RULE(500_007,"Failed to insert rule ");

    Integer code;
    String message;

    ErrorCode(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return "\"err_" + code + "\": \"" + message + "\"";
    }

    public Integer getCode() {
        return code;
    }

    public ErrorCode setMessage(String message){
        this.message = message;
        return this;
    }

    public String getMessage() {
        return message;
    }
}
