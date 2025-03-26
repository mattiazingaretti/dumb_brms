package org.dummy.brms.dummy_brms.model.factfields;

import java.util.UUID;

import org.dummy.brms.dummy_brms.model.deserializers.FactFieldDeserializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Data;

@Data
@JsonDeserialize(using = FactFieldDeserializer.class)
public  class FactField<T> {
    private UUID factFieldId;
    private String fieldName;    
    private T value;
}
