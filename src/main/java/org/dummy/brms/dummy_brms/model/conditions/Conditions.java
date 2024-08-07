package org.dummy.brms.dummy_brms.model.conditions;

import java.util.Map;
import java.util.UUID;

import org.dummy.brms.dummy_brms.exception.DummyGenericException;
import org.dummy.brms.dummy_brms.model.DumbFact;

public abstract class Conditions {

    public abstract boolean evaluate( Map<UUID, DumbFact> facts) throws DummyGenericException;
}
