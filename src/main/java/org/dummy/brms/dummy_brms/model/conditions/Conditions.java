package org.dummy.brms.dummy_brms.model.conditions;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.dummy.brms.dummy_brms.exception.DummyGenericException;
import org.dummy.brms.dummy_brms.model.DumbFact;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.Getter;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = BinaryCondition.class, name = "BINARY"),
    @JsonSubTypes.Type(value = UnaryCondition.class, name = "UNARY")
})
public abstract class Conditions {
    
    @Getter    
    private String factClassName;
    
    public abstract List<UUID> evaluate(Map<UUID, DumbFact> facts, String factClassName) throws DummyGenericException;
}
