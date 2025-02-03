package org.dummy.brms.dummy_brms.model.dto;


import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class RuleOutputRequestDTO {
    @NotNull
    private Long projectId;
    @NotNull
    private String className;
    @NotNull
    private String classDescription;
    private List<RuleOutputFieldRequestDTO> fields;
}
