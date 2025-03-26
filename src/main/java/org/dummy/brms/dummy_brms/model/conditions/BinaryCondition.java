package org.dummy.brms.dummy_brms.model.conditions;


import java.util.HashMap;
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
    public List<UUID> evaluate(Map<UUID, DumbFact> facts, String factClassName) throws DummyGenericException {
        
        List<UUID> matchingFacts = new LinkedList<>();

        Map<UUID, Object> leftValues = new HashMap();
        Map<UUID, Object> rightValues = new HashMap();

        OperandValueType leftValueType = left.getValueType(facts);
        OperandValueType rightValueType = right.getValueType(facts);

        if(rightValueType != leftValueType){
            throw new DummyGenericException(ErrorCode.TYPE_MISMATCH_IN_BINARY_CONSTRAINT);
        }
        
        //TODO replace with bitmap enum
        if(UtilityFunctions.isFactField(left) && UtilityFunctions.isFactField(right) ){

            leftValues = ((FactFieldOperand)left).getValue(facts, factClassName);
            rightValues = ((FactFieldOperand)right).getValue(facts, factClassName);
            
            for (var leftEntry : leftValues.entrySet()) {
                for(var rightEntry: rightValues.entrySet()){
                    if (UtilityFunctions.checkGenricCondition(leftEntry.getValue(), rightEntry.getValue(), operator)){
                        matchingFacts.add(leftEntry.getKey());
                        matchingFacts.add(rightEntry.getKey());
                    }
                }
            }

        }else if(UtilityFunctions.isFactField(left) &&  !UtilityFunctions.isFactField(right) ){
            leftValues = ((FactFieldOperand)left).getValue(facts, factClassName);
            Object rightValue = ((FixedValueOperand<?>) right).getValue();
            
            for (var leftEntry : leftValues.entrySet()) {
                if(UtilityFunctions.checkGenricCondition(leftEntry.getValue(), rightValue, operator)){
                    matchingFacts.add(leftEntry.getKey());
                }
            }
            

        }else if( !UtilityFunctions.isFactField(left) &&  UtilityFunctions.isFactField(right) ){
            rightValues = ((FactFieldOperand)right).getValue(facts, factClassName);
            Object leftValue = ((FixedValueOperand<?>) left).getValue();


            for(var rightEntry: rightValues.entrySet()){
                if (UtilityFunctions.checkGenricCondition(leftValue, rightEntry.getValue(), operator)){
                    matchingFacts.add(rightEntry.getKey());
                }
            }

        }else {
            throw new DummyGenericException(ErrorCode.MEANINGLESS_CONSTRAINT);
        }

        return matchingFacts; 
    }

   

}
