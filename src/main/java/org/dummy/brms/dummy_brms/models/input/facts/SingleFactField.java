package org.dummy.brms.dummy_brms.models.input.facts;

import org.dummy.brms.dummy_brms.models.input.facts.FactField;
import org.dummy.brms.dummy_brms.models.input.facts.FactFieldType;
import lombok.Data;

@Data
public class SingleFactField<T> extends FactField {
    private FactFieldType fieldType;
    private T fieldValue;
}
