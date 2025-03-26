package org.dummy.brms.dummy_brms.model.dto;


import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Builder
@Getter
public class ProjectResponseDTO {
    private String name;
    private Long id;
    private Date creationDate;
    private Date lastUpdate;
}
