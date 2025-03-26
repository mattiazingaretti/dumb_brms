package org.dummy.brms.dummy_brms.model.dto;


import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class RuleDataResponseDTO {
    private List<RuleInputResponseDTO> inputData;
    private List<RuleOutputResponseDTO> outputData;
}
