package org.dummy.brms.dummy_brms.model;


import org.dummy.brms.dummy_brms.model.conditions.Conditions;

import lombok.Data;

@Data
public class DumbRule {
    private String name;
    private int salience;
    private Conditions[] conditions;
}
