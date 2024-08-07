package org.dummy.brms.dummy_brms.model.conditions;


import java.util.Map;
import java.util.UUID;

import org.dummy.brms.dummy_brms.exception.DummyGenericException;
import org.dummy.brms.dummy_brms.exception.ErrorCode;
import org.dummy.brms.dummy_brms.model.DumbFact;
import org.dummy.brms.dummy_brms.model.operands.FactFieldOperand;
import org.dummy.brms.dummy_brms.model.operands.FixedValueOperand;
import org.dummy.brms.dummy_brms.model.operands.Operand;
import org.dummy.brms.dummy_brms.model.operands.OperandType;
import org.dummy.brms.dummy_brms.model.operands.OperandValueType;
import org.dummy.brms.dummy_brms.model.operations.BinaryOperationType;
import org.dummy.brms.dummy_brms.services.UtilityFunctions;

import lombok.Data;

@Data
public class BinaryCondition extends Conditions{

    private Operand left;
    private BinaryOperationType operator;
    private Operand right;


    @Override
    public boolean evaluate(Map<UUID, DumbFact> facts) throws DummyGenericException {
        
        Object leftObject = left.getType() == OperandType.FACT_FIELD ? ((FixedValueOperand<?>)left).getValue() : ((FactFieldOperand)left).getValue(facts);
        Object rightObject = right.getType() == OperandType.FACT_FIELD ? ((FixedValueOperand<?>)right).getValue() : ((FactFieldOperand)right).getValue(facts);
        OperandValueType leftValueType = left.getType() == OperandType.FACT_FIELD ? ((FixedValueOperand<?>)left).getValueType(facts) : ((FactFieldOperand)left).getValueType(facts);
        OperandValueType rightValueType = right.getType() == OperandType.FACT_FIELD ? ((FixedValueOperand<?>)right).getValueType(facts) : ((FactFieldOperand)right).getValueType(facts);

        if(rightValueType != leftValueType){
            throw new DummyGenericException(ErrorCode.TYPE_MISMATCH_IN_BINARY_CONSTRAINT);
        }
        return UtilityFunctions.checkGenricCondition(leftObject, rightObject, operator);
    }

   

}
