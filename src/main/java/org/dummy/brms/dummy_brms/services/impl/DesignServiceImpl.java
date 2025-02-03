package org.dummy.brms.dummy_brms.services.impl;


import lombok.extern.slf4j.Slf4j;
import org.dummy.brms.dummy_brms.model.dto.*;
import org.dummy.brms.dummy_brms.mybatis.mappers.RuleInputDataDynamicSqlSupport;
import org.dummy.brms.dummy_brms.mybatis.mappers.RuleInputDataFieldsMapper;
import org.dummy.brms.dummy_brms.mybatis.mappers.RuleInputDataMapper;
import org.dummy.brms.dummy_brms.mybatis.pojo.RuleInputData;
import org.dummy.brms.dummy_brms.mybatis.pojo.RuleInputDataFields;
import org.dummy.brms.dummy_brms.services.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Slf4j
@Service
public class DesignServiceImpl implements DesignService {

    @Autowired
    RuleInputDataMapper ruleInputDataMapper;

    @Autowired
    RuleInputDataFieldsMapper ruleInputDataFieldsMapper;

    @Override
    public PostedResourceDTO postRuleInput(List<RuleInputRequestDTO> rinput, UserDTO principal) {

        if(rinput == null || rinput.isEmpty()) {
            return PostedResourceDTO.builder()
                    .success(false)
                    .msg("No data to process")
                    .build();
        }

        //Delete if already exist
        rinput.forEach(ridInput->{

            if(ridInput.getFields() != null && !ridInput.getFields().isEmpty()) {
                ridInput.getFields().forEach(rinputField ->{
                    ruleInputDataFieldsMapper.delete(dsl ->
                                    dsl.where(RuleInputDataDynamicSqlSupport.projectId, isEqualTo(ridInput.getProjectId())));
                });
            }
            ruleInputDataMapper.delete(deleteModelQueryExpressionDSL ->
                    deleteModelQueryExpressionDSL
                            .where(RuleInputDataDynamicSqlSupport.projectId, isEqualTo(ridInput.getProjectId()))
                            .and(RuleInputDataDynamicSqlSupport.userId, isEqualTo(principal.getId())));
        });

        //Insert new data
        rinput.forEach(ruleInputRequestDTO -> {
            RuleInputData ruleInputData = new RuleInputData();
            ruleInputData.setProjectId(ruleInputRequestDTO.getProjectId());
            ruleInputData.setRidClass(ruleInputRequestDTO.getClassName());
            ruleInputData.setRidDescription(ruleInputRequestDTO.getClassDescription());
            ruleInputData.setUserId(principal.getId());
            ruleInputDataMapper.insert(ruleInputData);
            ruleInputRequestDTO.getFields().stream().forEach(f->{
                RuleInputDataFields ruleInputDataFields = new RuleInputDataFields();
                ruleInputDataFields.setProjectId(ruleInputRequestDTO.getProjectId());
                ruleInputDataFields.setRidClass(ruleInputRequestDTO.getClassName());
                ruleInputDataFields.setRidFieldName(f.getFieldName());
                ruleInputDataFields.setRidFieldType(f.getFieldType());
                ruleInputDataFieldsMapper.insert(ruleInputDataFields);
            });
        });

        return PostedResourceDTO.builder()
                .success(true)
                .build();
    }

    @Override
    public List<RuleInputResponseDTO> getRuleInput(Long projectId, UserDTO principal) {

        List<RuleInputResponseDTO> toRet = new LinkedList<>();

        List<RuleInputData> ridFound = ruleInputDataMapper.select(selectModelQueryExpressionDSL ->
                selectModelQueryExpressionDSL
                .where(RuleInputDataDynamicSqlSupport.projectId, isEqualTo(projectId))
                        .and(RuleInputDataDynamicSqlSupport.userId, isEqualTo(principal.getId())));
        ridFound.forEach(ridFound1 -> {
            RuleInputResponseDTO ruleInputResponseDTO = new RuleInputResponseDTO();
            ruleInputResponseDTO.setClassName(ridFound1.getRidClass());
            ruleInputResponseDTO.setClassDescription(ridFound1.getRidDescription());
            ruleInputResponseDTO.setProjectId(ridFound1.getProjectId());
            ruleInputResponseDTO.setFields(new LinkedList<>());
            List<RuleInputDataFields> ridFields = ruleInputDataFieldsMapper.select(selectModelQueryExpressionDSL ->
                    selectModelQueryExpressionDSL
                            .where(RuleInputDataDynamicSqlSupport.ridClass, isEqualTo(ridFound1.getRidClass()))
                            .and(RuleInputDataDynamicSqlSupport.projectId, isEqualTo(ridFound1.getProjectId())));
            ridFields.forEach(ruleInputDataFields ->{
                RuleInputFieldResponseDTO f = new RuleInputFieldResponseDTO();
                f.setFieldName(ruleInputDataFields.getRidFieldName());
                f.setFieldType(ruleInputDataFields.getRidFieldType());
                ruleInputResponseDTO.getFields().add(f);
            });


            toRet.add(ruleInputResponseDTO);
        });

        return toRet;
    }
}
