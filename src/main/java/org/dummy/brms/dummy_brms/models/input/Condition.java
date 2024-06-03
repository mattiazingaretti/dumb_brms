package org.dummy.brms.dummy_brms.models.input;

import org.dummy.brms.dummy_brms.models.input.expressions.BooleanExpression;
import lombok.Data;


@Data
public class Condition {

    private String factClass; //Name of the Fact to which the Rule Condition is Related  ex Person class
    
    private BooleanExpression expression; 
    
    public boolean evaluateCondition(){
        return this.expression.evaluate();
    }
}
