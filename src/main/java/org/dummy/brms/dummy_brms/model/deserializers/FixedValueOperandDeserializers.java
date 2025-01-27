package org.dummy.brms.dummy_brms.model.deserializers;

import java.io.IOException;
import java.util.UUID;

import org.dummy.brms.dummy_brms.model.operands.FixedValueOperand;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class FixedValueOperandDeserializers extends JsonDeserializer<FixedValueOperand<?>>{




    @Override
    public FixedValueOperand<?> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException{

        JsonNode node = p.getCodec().readTree(p);

        JsonNode valueNode = node.get("value");

        Object value;
        if (valueNode.isNumber()) {
            value = valueNode.decimalValue(); // Convert any numeric value to BigDecimal
        } else if (valueNode.isTextual()) {
            value = valueNode.asText(); // Keep String values as String
        } else {
            // Handle other types as needed
            throw new IllegalArgumentException("Unsupported value type");
        }

        FixedValueOperand<Object> factField = new FixedValueOperand<>();
        factField.setValue(value);

        return factField;
    }

}
