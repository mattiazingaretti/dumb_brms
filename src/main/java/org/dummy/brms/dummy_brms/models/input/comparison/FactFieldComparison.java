package org.dummy.brms.dummy_brms.models.input.comparison;

import org.dummy.brms.dummy_brms.models.input.facts.FactField;

import lombok.Data;

@Data
public class FactFieldComparison extends Comparison{
    private FactField left;
    private FactField right;
    
    
    @Override
    public boolean evaluateComparison() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'evaluateComparison'");
    }
}
