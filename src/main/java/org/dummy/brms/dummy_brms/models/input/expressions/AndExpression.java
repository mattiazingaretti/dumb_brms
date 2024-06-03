package org.dummy.brms.dummy_brms.models.input.expressions;

public class AndExpression extends BooleanExpression {
    private final BooleanExpression left;
    private final BooleanExpression right;

    public AndExpression(BooleanExpression left, BooleanExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean evaluate() {
        return left.evaluate() && right.evaluate();
    }
}

