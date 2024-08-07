package org.dummy.brms.dummy_brms.model.operands;

import java.util.Map;
import java.util.UUID;

import org.dummy.brms.dummy_brms.model.DumbFact;

public abstract class Operand {

    public abstract OperandValueType getValueType(Map<UUID, DumbFact> facts);
    public abstract OperandType getType();

}
