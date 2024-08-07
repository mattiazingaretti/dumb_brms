package org.dummy.brms.dummy_brms.model;

import java.util.UUID;

import lombok.Data;

@Data
public class FactField<T> {
    private UUID factFieldId;
    private T value;
    private String fieldName;
}
