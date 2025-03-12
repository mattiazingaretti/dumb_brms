package org.dummy.brms.dummy_brms.services;

import org.dummy.brms.dummy_brms.model.dto.ActionResponseDTO;
import org.dummy.brms.dummy_brms.model.dto.ActionWithParamsResponseDTO;

import java.util.List;

public interface ActionService {

    List<ActionResponseDTO> getActions();

    List<ActionWithParamsResponseDTO> getActionsWithParams();
}
