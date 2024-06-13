package org.dummy.brms.dummy_brms.models.input;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class Rule {
    
    private String name;
    private List<Condition> when;
    private Action then;

}
