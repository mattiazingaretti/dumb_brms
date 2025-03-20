package org.dummy.brms.dummy_brms.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ConditionDTO {
    private String className;
    private String field;
    private String operator;
    private String idCondition;
    private Object value; //TO be JSON serialized
    private boolean flgUseIdCondition;
}
