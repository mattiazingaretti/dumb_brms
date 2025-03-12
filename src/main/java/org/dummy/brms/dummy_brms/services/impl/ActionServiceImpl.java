package org.dummy.brms.dummy_brms.services.impl;

import org.dummy.brms.dummy_brms.model.ActionParamDirection;
import org.dummy.brms.dummy_brms.model.dto.ActionResponseDTO;
import org.dummy.brms.dummy_brms.model.dto.ActionWithParamsResponseDTO;
import org.dummy.brms.dummy_brms.mybatis.mappers.ActionParamsMapper;
import org.dummy.brms.dummy_brms.mybatis.mappers.ActionsMapper;
import org.dummy.brms.dummy_brms.services.ActionService;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionServiceImpl implements ActionService {

    //TODO add cache for Actions and ActionParams

    @Autowired
    ActionsMapper actionsMapper;

    @Autowired
    ActionParamsMapper actionParamsMapper;



    @Override
    public List<ActionResponseDTO> getActions() {
        return actionsMapper.select(SelectDSLCompleter.allRows()).stream()
                .map(action -> new ActionResponseDTO(action.getActionName()))
                .toList();
    }

    @Override
    public List<ActionWithParamsResponseDTO> getActionsWithParams() {
        return actionParamsMapper.select(SelectDSLCompleter.allRows()).stream()
                .map(action -> ActionWithParamsResponseDTO.builder()
                        .actionName(action.getAction())
                        .paramName(action.getParamName())
                        .paramType(action.getParamType())
                        .paramDirection(ActionParamDirection.valueOf(action.getParamDirection()))
                        .build())
                .toList();
    }

}
