package org.dummy.brms.dummy_brms.services;

import java.math.BigDecimal;

import org.dummy.brms.dummy_brms.exception.DummyGenericException;
import org.dummy.brms.dummy_brms.exception.ErrorCode;
import org.dummy.brms.dummy_brms.model.operands.Operand;
import org.dummy.brms.dummy_brms.model.operands.OperandType;
import org.dummy.brms.dummy_brms.model.operands.OperandValueType;
import org.dummy.brms.dummy_brms.model.operations.BinaryOperationType;

public class UtilityFunctions {

    public static <T> OperandValueType getValueType(T object) throws DummyGenericException{
        if(object instanceof Boolean){
            return OperandValueType.BOOLEAN;
        }
        if(object instanceof String){
            return OperandValueType.STRING;
        }
        if(object instanceof BigDecimal){
            return OperandValueType.NUMERIC;
        }
        throw new DummyGenericException(ErrorCode.FAILED_TO_GET_VALUE_TYPE);
        
    }


    public static <T> boolean isNumeric(T object){
        return object instanceof BigDecimal;
    }

    public static <T> boolean isString(T object){
        return object instanceof String;
    }

    public static <T> boolean isBoolean(T object){
        return object instanceof Boolean;
    }

    public static <T> boolean checkGenricCondition(T left, T right , BinaryOperationType operator) throws DummyGenericException{
        OperandValueType leftType = getValueType(left);
        OperandValueType rightType = getValueType(right);
        if (leftType != rightType){
            throw new DummyGenericException(ErrorCode.TYPE_MISMATCH_IN_BINARY_CONSTRAINT);
        }
        switch (operator) {
            case EQUAL:
                return left.equals(right);
            case NOT_EQUAL:
                return !left.equals(right);
            case GREATER:
                if (! (isNumeric(right) && isNumeric(left))){
                    throw new DummyGenericException(ErrorCode.TYPE_MISMATCH_IN_BINARY_CONSTRAINT);
                }
                return ((BigDecimal )left).compareTo((BigDecimal)right) > 0;
            case GREATER_EQUAL:
                if (! (isNumeric(right) && isNumeric(left))){
                    throw new DummyGenericException(ErrorCode.TYPE_MISMATCH_IN_BINARY_CONSTRAINT);
                }
            return ((BigDecimal )left).compareTo((BigDecimal)right) >= 0;
            case LOWER_EQUAL:
                if (! (isNumeric(right) && isNumeric(left)))
                    throw new DummyGenericException(ErrorCode.TYPE_MISMATCH_IN_BINARY_CONSTRAINT);
                return ((BigDecimal )left).compareTo((BigDecimal)right) <= 0;
            case LOWER:
                if (! (isNumeric(right) && isNumeric(left)))
                    throw new DummyGenericException(ErrorCode.TYPE_MISMATCH_IN_BINARY_CONSTRAINT);
                return ((BigDecimal )left).compareTo((BigDecimal)right) < 0;
            default:
                return false;
        }
    }

    public static boolean isFactField(Operand left){
        return left.getType() == OperandType.FACT_FIELD; 
    }
    
    public static boolean isFixedValue(Operand left){
        return left.getType() == OperandType.FIXED_VALUE; 
    }
    
    
}
