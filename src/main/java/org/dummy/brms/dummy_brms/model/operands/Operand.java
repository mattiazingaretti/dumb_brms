package org.dummy.brms.dummy_brms.model.operands;

import java.util.Map;
import java.util.UUID;

import org.dummy.brms.dummy_brms.exception.DummyGenericException;
import org.dummy.brms.dummy_brms.model.DumbFact;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = FixedValueOperand.class, name = "FIXED_VALUE"),
    @JsonSubTypes.Type(value = FactFieldOperand.class, name = "FACT_FIELD")
})
public abstract class Operand {

    public abstract OperandValueType getValueType(Map<UUID, DumbFact> facts) throws DummyGenericException;
    public abstract OperandType getType();

}
