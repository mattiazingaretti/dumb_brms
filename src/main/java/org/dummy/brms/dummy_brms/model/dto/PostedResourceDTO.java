package org.dummy.brms.dummy_brms.model.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PostedResourceDTO {
    private String msg;
    private Long idPostedResource;
    private boolean success;
}
