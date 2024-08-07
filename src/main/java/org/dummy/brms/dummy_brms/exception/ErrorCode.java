package org.dummy.brms.dummy_brms.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public enum ErrorCode {

    BAD_REQUEST(400_000, "Bad Request"),
    INTERNAL_SERVER_ERRROR(500_000, "Internal Server Error"),
    FAILED_TO_EVALUATE_CONDITION(500_001, "Failed To evaluate condition"),
    UNARY_FIXED_FIELD_IS_NOT_BOOL(500_002, "Expected Fixed field value in Unary Constraint to be a Boolean "),
    TYPE_MISMATCH_IN_BINARY_CONSTRAINT(500_003, "Type mismatch in left and right operands in binary constraint ")

    
}
