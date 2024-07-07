package org.dummy.brms.dummy_brms.model;


import org.drools.model.Index.ConstraintType;

import lombok.Data;

@Data
public class DummyConstraints<T> {

    private String name;
    private String key;
    private ConstraintType operator;
    private T value;


}
