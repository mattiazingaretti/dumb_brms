package org.dummy.brms.dummy_brms.model.operands;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import org.dummy.brms.dummy_brms.exception.DummyGenericException;
import org.dummy.brms.dummy_brms.exception.ErrorCode;
import org.dummy.brms.dummy_brms.model.DumbFact;
import org.dummy.brms.dummy_brms.model.factfields.FactField;
import org.dummy.brms.dummy_brms.services.UtilityFunctions;


import lombok.Data;

@Data
public class FactFieldOperand extends Operand{

    
    private UUID factFieldId;

    @Override
    public OperandType getType() {
        return OperandType.FACT_FIELD;
    }

    public List<Object> getValue(Map<UUID, DumbFact> facts) throws DummyGenericException{
        
        List<Object> toRet = new LinkedList<>();
        
        facts.values().forEach(fact->{
            List<FactField> mactchingFields = Arrays.stream(fact.getFields()).filter(field -> field.getFactFieldId().equals(this.factFieldId)).collect(Collectors.toList());
            if(mactchingFields == null || mactchingFields.size() != 1){
                try {
                    throw new DummyGenericException(ErrorCode.FACT_FIELD_NOT_FOUND);
                } catch (DummyGenericException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            toRet.add(mactchingFields.get(0).getValue());
        });
        
        return toRet;    
    }

    @Override
    public OperandValueType getValueType(Map<UUID, DumbFact> facts) throws DummyGenericException {
        List<Object> factValues = this.getValue(facts);
        if(factValues == null){
            throw new DummyGenericException(ErrorCode.FACT_FIELD_NOT_FOUND);
        }
        OperandValueType type = UtilityFunctions.getValueType(factValues.get(0));
        if(! factValues.stream().allMatch(fv -> {
            try {
                return UtilityFunctions.getValueType(fv).equals(type);
            } catch (DummyGenericException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return false;
        })){
            throw new DummyGenericException(ErrorCode.FAILED_TO_GET_FACT_FIELD_TYPE);
        }
        return type;
    }
}
