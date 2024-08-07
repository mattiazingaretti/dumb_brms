package org.dummy.brms.dummy_brms.model.operands;

import java.util.Arrays;
import java.util.Map;
import java.util.UUID;

import org.dummy.brms.dummy_brms.exception.DummyGenericException;
import org.dummy.brms.dummy_brms.exception.ErrorCode;
import org.dummy.brms.dummy_brms.model.DumbFact;
import org.dummy.brms.dummy_brms.services.UtilityFunctions;

import lombok.Data;

@Data
public class FactFieldOperand extends Operand{

    
    private UUID factFieldId;

    @Override
    public OperandType getType() {
        return OperandType.FACT_FIELD;
    }

    public Object getValue(Map<UUID, DumbFact> facts){
        return facts.values().stream()
            .filter(f -> Arrays.stream(f.getFields())
                    .filter(filter -> filter.getFactFieldId().equals(this.factFieldId))
                    .findFirst()
                    .orElse(null)
        ).findFirst().orElse(null);
    }

    @Override
    public OperandValueType getValueType(Map<UUID, DumbFact> facts) {
        Object factValue = this.getValue(facts);
        return UtilityFunctions.getValueType(factValue);
    }
}
