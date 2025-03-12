package org.dummy.brms.dummy_brms.model.dto;


import lombok.Builder;
import lombok.Data;
import org.dummy.brms.dummy_brms.model.ActionParamDirection;

@Builder
@Data
public class ActionWithParamsResponseDTO {
    private String actionName;
    private String paramName;
    private String paramType;
    private ActionParamDirection paramDirection;
}
