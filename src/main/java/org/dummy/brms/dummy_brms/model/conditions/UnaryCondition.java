package org.dummy.brms.dummy_brms.model.conditions;

import java.util.Map;
import java.util.UUID;

import org.dummy.brms.dummy_brms.exception.DummyGenericException;
import org.dummy.brms.dummy_brms.exception.ErrorCode;
import org.dummy.brms.dummy_brms.model.DumbFact;
import org.dummy.brms.dummy_brms.model.operands.FactFieldOperand;
import org.dummy.brms.dummy_brms.model.operands.FixedValueOperand;
import org.dummy.brms.dummy_brms.model.operands.Operand;
import org.dummy.brms.dummy_brms.model.operations.UnaryOperationTypes;

public class UnaryCondition extends Conditions{

    private Operand operand;
    private UnaryOperationTypes operation;


    @Override
    public boolean evaluate(Map<UUID, DumbFact> facts) throws DummyGenericException {
            
        switch (operand.getType()) {
            case FACT_FIELD:
                Object operandValue = ((FactFieldOperand)operand).getValue(facts);
                if(! (operandValue instanceof Boolean)){
                    throw new DummyGenericException(ErrorCode.UNARY_FIXED_FIELD_IS_NOT_BOOL);
                }
                return this.operation.equals( UnaryOperationTypes.IS) ?  (Boolean)operandValue : !(Boolean)operandValue ;
            case FIXED_VALUE:
                FixedValueOperand<?> fixedOperand = (FixedValueOperand<?>) operand;
                if(! (fixedOperand.getValue() instanceof Boolean)){
                    throw new DummyGenericException(ErrorCode.UNARY_FIXED_FIELD_IS_NOT_BOOL);
                }
                Boolean val = (Boolean)fixedOperand.getValue();
                return this.operation.equals( UnaryOperationTypes.IS) ?  val : !val ;
            default:
                return false;
        }
    }


}
