package org.dummy.brms.dummy_brms.services.impl;


import lombok.extern.slf4j.Slf4j;
import org.dummy.brms.dummy_brms.model.dto.*;
import org.dummy.brms.dummy_brms.mybatis.mappers.*;
import org.dummy.brms.dummy_brms.mybatis.pojo.RuleInputData;
import org.dummy.brms.dummy_brms.mybatis.pojo.RuleInputDataFields;
import org.dummy.brms.dummy_brms.mybatis.pojo.RuleOutputData;
import org.dummy.brms.dummy_brms.mybatis.pojo.RuleOutputDataFields;
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
    RuleOutputDataMapper ruleOutputDataMapper;

    @Autowired
    RuleInputDataFieldsMapper ruleInputDataFieldsMapper;

    @Autowired
    RuleOutputDataFieldsMapper ruleOutputDataFieldsMapper;

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
    public PostedResourceDTO postRuleOutPut(List<RuleOutputRequestDTO> routput, UserDTO principal) {
        if(routput == null || routput.isEmpty()) {
            return PostedResourceDTO.builder()
                    .success(false)
                    .msg("No data to process")
                    .build();
        }

        //Delete if already exist
        routput.forEach(rodOutput->{

            if(rodOutput.getFields() != null && !rodOutput.getFields().isEmpty()) {
                rodOutput.getFields().forEach(rinputField ->{
                    ruleOutputDataFieldsMapper.delete(dsl ->
                            dsl.where(RuleInputDataDynamicSqlSupport.projectId, isEqualTo(rodOutput.getProjectId())));
                });
            }
            ruleOutputDataMapper.delete(deleteModelQueryExpressionDSL ->
                    deleteModelQueryExpressionDSL
                            .where(RuleInputDataDynamicSqlSupport.projectId, isEqualTo(rodOutput.getProjectId()))
                            .and(RuleInputDataDynamicSqlSupport.userId, isEqualTo(principal.getId())));
        });

        //Insert new data
        routput.forEach(ruleInputRequestDTO -> {
            RuleOutputData ruleInputData = new RuleOutputData();
            ruleInputData.setProjectId(ruleInputRequestDTO.getProjectId());
            ruleInputData.setRodClass(ruleInputRequestDTO.getClassName());
            ruleInputData.setRodDescription(ruleInputRequestDTO.getClassDescription());
            ruleInputData.setUserId(principal.getId());
            ruleOutputDataMapper.insert(ruleInputData);
            ruleInputRequestDTO.getFields().stream().forEach(f->{
                RuleOutputDataFields ruleInputDataFields = new RuleOutputDataFields();
                ruleInputDataFields.setProjectId(ruleInputRequestDTO.getProjectId());
                ruleInputDataFields.setRodClass(ruleInputRequestDTO.getClassName());
                ruleInputDataFields.setRodFieldName(f.getFieldName());
                ruleInputDataFields.setRodFieldType(f.getFieldType());
                ruleOutputDataFieldsMapper.insert(ruleInputDataFields);
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

    @Override
    public List<RuleOutputResponseDTO> getRuleOutput(Long projectId, UserDTO principal) {
        List<RuleOutputResponseDTO> toRet = new LinkedList<>();

        List<RuleOutputData> rodFound = ruleOutputDataMapper.select(selectModelQueryExpressionDSL ->
                selectModelQueryExpressionDSL
                        .where(RuleInputDataDynamicSqlSupport.projectId, isEqualTo(projectId))
                        .and(RuleInputDataDynamicSqlSupport.userId, isEqualTo(principal.getId())));
        rodFound.forEach(rodFound1 -> {
            RuleOutputResponseDTO ruleInputResponseDTO = new RuleOutputResponseDTO();
            ruleInputResponseDTO.setClassName(rodFound1.getRodClass());
            ruleInputResponseDTO.setClassDescription(rodFound1.getRodDescription());
            ruleInputResponseDTO.setProjectId(rodFound1.getProjectId());
            ruleInputResponseDTO.setFields(new LinkedList<>());
            List<RuleOutputDataFields> rodFields = ruleOutputDataFieldsMapper.select(selectModelQueryExpressionDSL ->
                    selectModelQueryExpressionDSL
                            .where(RuleInputDataDynamicSqlSupport.ridClass, isEqualTo(rodFound1.getRodClass()))
                            .and(RuleInputDataDynamicSqlSupport.projectId, isEqualTo(rodFound1.getProjectId())));
            rodFields.forEach(ruleInputDataFields ->{
                RuleInputFieldResponseDTO f = new RuleInputFieldResponseDTO();
                f.setFieldName(ruleInputDataFields.getRodFieldName());
                f.setFieldType(ruleInputDataFields.getRodFieldType());
                ruleInputResponseDTO.getFields().add(f);
            });
            toRet.add(ruleInputResponseDTO);
        });

        return toRet;
    }
}
