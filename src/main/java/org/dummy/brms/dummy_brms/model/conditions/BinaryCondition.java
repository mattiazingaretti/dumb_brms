package org.dummy.brms.dummy_brms.model.conditions;


import java.util.LinkedList;
import java.util.List;
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
        
        List<Object> leftValues = new LinkedList<>();
        List<Object> rightValues = new LinkedList<>();

        if(left.getType() == OperandType.FACT_FIELD){
            leftValues = ((FactFieldOperand)left).getValue(facts);
        }else{
            leftValues.add(((FixedValueOperand<?>)left).getValue());
        }

        if(right.getType() == OperandType.FACT_FIELD){
            rightValues = ((FactFieldOperand)right).getValue(facts);
        }else{
            rightValues.add(((FixedValueOperand<?>)right).getValue());
        }

        OperandValueType leftValueType = left.getType() == OperandType.FIXED_VALUE ? ((FixedValueOperand<?>)left).getValueType(facts) : ((FactFieldOperand)left).getValueType(facts);
        OperandValueType rightValueType = right.getType() == OperandType.FIXED_VALUE ? ((FixedValueOperand<?>)right).getValueType(facts) : ((FactFieldOperand)right).getValueType(facts);

        if(rightValueType != leftValueType){
            throw new DummyGenericException(ErrorCode.TYPE_MISMATCH_IN_BINARY_CONSTRAINT);
        }

        boolean check = false;
        for( Object l : leftValues){
            for(Object r : rightValues){
                check = check || UtilityFunctions.checkGenricCondition(l, r, operator);
                if(check)
                    return true;
            }
        }
        return check; 
    }

   

}
