package org.dummy.brms.dummy_brms.model.dto;


import lombok.Data;

import java.util.List;

@Data
public class RuleOutputResponseDTO {
    private Long projectId;
    private String className;
    private String classDescription;
    private List<RuleOutputFieldResponseDTO> fields;
}
