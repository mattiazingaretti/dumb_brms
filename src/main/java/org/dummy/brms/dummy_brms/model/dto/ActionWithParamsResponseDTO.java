package org.dummy.brms.dummy_brms.model.dto;


import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ActionWithParamsResponseDTO {
    private String actionName;
    private List<ActionParamResponseDTO> actionParams;

}
