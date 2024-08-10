package org.dummy.brms.dummy_brms.model.conditions;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.drools.compiler.rule.builder.dialect.java.parser.JavaParser.type_return;
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
    public List<UUID> evaluate(Map<UUID, DumbFact> facts, String factClassName) throws DummyGenericException {
        List<UUID> toRet = new LinkedList<>();
        switch (operand.getType()) {
            case FACT_FIELD:
                Map<UUID, Object> operandValues = ((FactFieldOperand)operand).getValue(facts, factClassName);
                boolean check = false;
                for( Object o : operandValues){
                    if(! (o instanceof Boolean)){
                        throw new DummyGenericException(ErrorCode.UNARY_FIXED_FIELD_IS_NOT_BOOL);
                    }
                    check = check || (this.operation.equals( UnaryOperationTypes.IS) ?  (Boolean)o : !(Boolean)o) ;
                    if(check){return true;}
                }
                return check; 
            case FIXED_VALUE:
                FixedValueOperand<?> fixedOperand = (FixedValueOperand<?>) operand;
                if(! (fixedOperand.getValue() instanceof Boolean)){
                    throw new DummyGenericException(ErrorCode.UNARY_FIXED_FIELD_IS_NOT_BOOL);
                }
                Boolean val = (Boolean)fixedOperand.getValue();
                return this.operation.equals( UnaryOperationTypes.IS) ?  val : !val ;
            default:
                break;
     
       }
       return toRet;
    }


}
