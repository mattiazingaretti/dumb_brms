package org.dummy.brms.dummy_brms.models.input.expressions;

public class BooleanLiteral extends BooleanExpression {
    private final boolean value;

    public BooleanLiteral(boolean value) {
        this.value = value;
    }

    @Override
    public boolean evaluate() {
        return value;
    }
}

