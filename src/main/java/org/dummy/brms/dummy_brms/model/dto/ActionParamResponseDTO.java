package org.dummy.brms.dummy_brms.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.dummy.brms.dummy_brms.model.ActionParamDirection;

@Builder
@Getter
@Setter
public class ActionParamResponseDTO {
    private String paramName;
    private String paramType;
    private ActionParamDirection paramDirection;
}
