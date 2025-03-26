package org.dummy.brms.dummy_brms.model.dto;


import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RuleDTO {
    private Long idRule;
    private int salience;
    private String ruleName;
    private List<ConditionDTO> conditions;
    private  WorkflowDTO workflow;
}
