package org.dummy.brms.dummy_brms.model.operands;

import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

import org.dummy.brms.dummy_brms.exception.DummyGenericException;
import org.dummy.brms.dummy_brms.model.DumbFact;
import org.dummy.brms.dummy_brms.model.deserializers.FactFieldDeserializer;
import org.dummy.brms.dummy_brms.model.deserializers.FixedValueOperandDeserializers;
import org.dummy.brms.dummy_brms.services.UtilityFunctions;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Data;

@Data
@JsonDeserialize(using = FixedValueOperandDeserializers.class)
public class FixedValueOperand<T> extends Operand{
    

    private T value;
    
    
    @Override
    public OperandType getType() {
        return OperandType.FIXED_VALUE;
    }


    @Override
    public OperandValueType getValueType(Map<UUID, DumbFact> facts) throws DummyGenericException {
        return UtilityFunctions.getValueType(value);
    }


   

}
