package org.dummy.brms.dummy_brms.model;

import java.util.UUID;

import org.dummy.brms.dummy_brms.model.factfields.FactField;

import lombok.Data;

@Data
public class DumbFact {

    private FactField[] fields;
    private String factClassName;
    private UUID factId;
}
