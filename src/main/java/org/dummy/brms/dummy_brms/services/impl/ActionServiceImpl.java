package org.dummy.brms.dummy_brms.services.impl;

import org.dummy.brms.dummy_brms.model.ActionParamDirection;
import org.dummy.brms.dummy_brms.model.dto.ActionParamResponseDTO;
import org.dummy.brms.dummy_brms.model.dto.ActionResponseDTO;
import org.dummy.brms.dummy_brms.model.dto.ActionWithParamsResponseDTO;
import org.dummy.brms.dummy_brms.mybatis.mappers.ActionParamsMapper;
import org.dummy.brms.dummy_brms.mybatis.mappers.ActionsMapper;
import org.dummy.brms.dummy_brms.mybatis.pojo.ActionParams;
import org.dummy.brms.dummy_brms.services.ActionService;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
                .collect(Collectors.groupingBy(ActionParams::getAction)).entrySet().stream().map(entry ->
                    ActionWithParamsResponseDTO.builder()
                            .actionName(entry.getKey())
                            .actionParams(entry.getValue().stream().map(actionParams ->
                                    ActionParamResponseDTO.builder()
                                            .paramName(actionParams.getParamName())
                                            .paramType(actionParams.getParamType())
                                            .paramDirection(ActionParamDirection.valueOf(actionParams.getParamDirection()))
                                            .build()
                            ).toList())
                            .build()
                ).collect(Collectors.toList());
    }

}
