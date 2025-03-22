package org.dummy.brms.dummy_brms.model.dto;


import lombok.Data;

import java.util.Date;

@Data
public class WorkflowDTO {
    private Long idWorkflow;
    private Date lastModified;
    private String name;
}
