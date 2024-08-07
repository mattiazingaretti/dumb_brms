package org.dummy.brms.dummy_brms.model.operands;

import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

import org.dummy.brms.dummy_brms.model.DumbFact;
import org.dummy.brms.dummy_brms.services.UtilityFunctions;

import lombok.Data;

@Data
public class FixedValueOperand<T> extends Operand{
    

    private T value;
    
    
    @Override
    public OperandType getType() {
        return OperandType.FIXED_VALUE;
    }


    @Override
    public OperandValueType getValueType(Map<UUID, DumbFact> facts) {
        return UtilityFunctions.getValueType(value);
    }


   

}
