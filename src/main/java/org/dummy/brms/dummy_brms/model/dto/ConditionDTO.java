package org.dummy.brms.dummy_brms.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ConditionDTO {
    private Long idCondition;
    private String className;
    private String field;
    private String operator;
    private String conditionNameId;
    private String referencedConditionNameId;
    private String selectedIdConditionField;
    private String value;
    private Boolean flgUseIdCondition;
}
