package org.dummy.brms.dummy_brms.models.input.expressions;

import java.util.Map;

public class BooleanVariable extends BooleanExpression {
    private final String name;
    private final Map<String, Boolean> context;

    public BooleanVariable(String name, Map<String, Boolean> context) {
        this.name = name;
        this.context = context;
    }

    @Override
    public boolean evaluate() {
        if (context.containsKey(name)) {
            return context.get(name);
        } else {
            throw new IllegalArgumentException("Variable not defined: " + name);
        }
    }
}
