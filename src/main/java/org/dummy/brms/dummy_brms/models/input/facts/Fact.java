package org.dummy.brms.dummy_brms.models.input.facts;

import java.util.List;
import org.dummy.brms.dummy_brms.models.input.facts.FactField;
import lombok.Data;

@Data
public class Fact {

    private String className;
    
    private List<FactField> fields;
}
