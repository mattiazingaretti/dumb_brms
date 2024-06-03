package org.dummy.brms.dummy_brms.models.input;

import java.util.List;

import lombok.Data;

@Data
public class Rule {
    
    private String name;
    private List<Condition> when; //each element is logically and related
    private Action then;

}
