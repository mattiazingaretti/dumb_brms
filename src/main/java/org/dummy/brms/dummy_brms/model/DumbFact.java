package org.dummy.brms.dummy_brms.model;

import java.util.UUID;

import lombok.Data;

@Data
public class DumbFact {

    private FactField<?>[] fields;
    private String factName;
    private UUID factId;
}
