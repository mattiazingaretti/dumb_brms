package org.dummy.brms.dummy_brms.models.input.expressions;

public class OrExpression extends BooleanExpression {
    private final BooleanExpression left;
    private final BooleanExpression right;

    public OrExpression(BooleanExpression left, BooleanExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean evaluate() {
        return left.evaluate() || right.evaluate();
    }
}

