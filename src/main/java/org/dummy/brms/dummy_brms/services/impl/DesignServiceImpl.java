package org.dummy.brms.dummy_brms.services.impl;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javaparser.utils.Utils;
import lombok.extern.slf4j.Slf4j;
import org.dummy.brms.dummy_brms.exception.DummyGenericException;
import org.dummy.brms.dummy_brms.exception.ErrorCode;
import org.dummy.brms.dummy_brms.model.dto.*;
import org.dummy.brms.dummy_brms.mybatis.ext.RuleDataTypesMapperExt;
import org.dummy.brms.dummy_brms.mybatis.ext.RulesExtMapper;
import org.dummy.brms.dummy_brms.mybatis.mappers.*;
import org.dummy.brms.dummy_brms.mybatis.pojo.*;
import org.dummy.brms.dummy_brms.services.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
import static com.fasterxml.jackson.databind.MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Slf4j
@Service
public class DesignServiceImpl implements DesignService {

    @Autowired
    RuleDataTypesMapperExt ruleDataTypesMapperExt;

    @Autowired
    RuleInputDataMapper ruleInputDataMapper;

    @Autowired
    RuleOutputDataMapper ruleOutputDataMapper;

    @Autowired
    RuleInputDataFieldsMapper ruleInputDataFieldsMapper;

    @Autowired
    RuleOutputDataFieldsMapper ruleOutputDataFieldsMapper;

    @Autowired
    RulesExtMapper rulesExtMapper;

    @Autowired
    RulesMapper rulesMapper;

    @Autowired
    ProjectsMapper projectsMapper;

    @Autowired
    RuleConditionsMapper ruleConditionsMapper;
    @Autowired
    RuleWorkflowMapper ruleWorkflowMapper;

    @Autowired
    VRuleFullMapper vRuleFullMapper;

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
                        .where(RuleOutputDataDynamicSqlSupport.projectId, isEqualTo(projectId))
                        .and(RuleOutputDataDynamicSqlSupport.userId, isEqualTo(principal.getId())));
        rodFound.forEach(rodFound1 -> {
            RuleOutputResponseDTO ruleInputResponseDTO = new RuleOutputResponseDTO();
            ruleInputResponseDTO.setClassName(rodFound1.getRodClass());
            ruleInputResponseDTO.setClassDescription(rodFound1.getRodDescription());
            ruleInputResponseDTO.setProjectId(rodFound1.getProjectId());
            ruleInputResponseDTO.setFields(new LinkedList<>());
            List<RuleOutputDataFields> rodFields = ruleOutputDataFieldsMapper.select(selectModelQueryExpressionDSL ->
                    selectModelQueryExpressionDSL
                            .where(RuleOutputDataFieldsDynamicSqlSupport.rodClass, isEqualTo(rodFound1.getRodClass()))
                            .and(RuleOutputDataFieldsDynamicSqlSupport.projectId, isEqualTo(rodFound1.getProjectId())));
            rodFields.forEach(ruleInputDataFields ->{
                RuleOutputFieldResponseDTO f = new RuleOutputFieldResponseDTO();
                f.setFieldName(ruleInputDataFields.getRodFieldName());
                f.setFieldType(ruleInputDataFields.getRodFieldType());
                ruleInputResponseDTO.getFields().add(f);
            });
            toRet.add(ruleInputResponseDTO);
        });

        return toRet;
    }

    @Override
    public List<RuleDataTypesDTO> getDataTypes(UserDTO principal) {
        List<RuleDataTypesDTO> toRet = new LinkedList<>();
        List<RuleDataTypes> all = ruleDataTypesMapperExt.selectAll();
        if(all != null && !all.isEmpty()){
            all.forEach(rdt-> {
                RuleDataTypesDTO rdtDTO = new RuleDataTypesDTO();
                rdtDTO.setDataType(rdt.getDataType());
                toRet.add(rdtDTO);
            });
        }
        return toRet;
    }

    @Override
    public RuleDataResponseDTO getRuleData(Long projectId, UserDTO principal) {
        return RuleDataResponseDTO.builder()
                .inputData(this.getRuleInput(projectId, principal))
                .outputData(this.getRuleOutput(projectId, principal))
                .build();
    }


    @Override
    public List<RuleDTO> getRules(Long projectId, UserDTO principal) throws DummyGenericException {
        projectsMapper.selectOne(selectModelQueryExpressionDSL -> selectModelQueryExpressionDSL
                .where(ProjectsDynamicSqlSupport.id, isEqualTo(projectId))
                .and(ProjectsDynamicSqlSupport.userId, isEqualTo(principal.getId()))).orElseThrow(()-> new DummyGenericException(ErrorCode.INTERNAL_SERVER_ERRROR)); //TODO add unauth exception handelr.

        List<RuleDTO> toRet = new LinkedList<>();
        ObjectMapper objectMapper = new ObjectMapper()
                .enable(ACCEPT_CASE_INSENSITIVE_PROPERTIES)
                .disable(FAIL_ON_UNKNOWN_PROPERTIES);

        vRuleFullMapper.select(selectModelQueryExpressionDSL ->
                selectModelQueryExpressionDSL
                        .where(VRuleFullDynamicSqlSupport.projectId, isEqualTo(projectId))
        ).forEach(vRuleFull -> {
            try {
                List<ConditionDTO> conditions = new ArrayList<>();
                if (vRuleFull.getConditions() != null) {
                    String conditionsPgObj = (String) vRuleFull.getConditions();
                    conditions = objectMapper.readValue(
                            conditionsPgObj,
                            new TypeReference<List<ConditionDTO>>() {}
                    );
                }

                WorkflowDTO workflow = null;
                if (vRuleFull.getWorkflow() != null) {
                    String workflowPgObj = (String) vRuleFull.getWorkflow();
                    workflow = objectMapper.readValue(
                            workflowPgObj,
                            WorkflowDTO.class
                    );
                }

                RuleDTO ruleDTO = RuleDTO.builder()
                        .idRule(vRuleFull.getRuleId())
                        .ruleName(vRuleFull.getRulename())
                        .salience(vRuleFull.getSalience())
                        .conditions(conditions)
                        .workflow(workflow)
                        .build();

                toRet.add(ruleDTO);
            } catch (JsonProcessingException e) {
                throw new RuntimeException("Failed to parse JSON for rule: "
                        + vRuleFull.getRuleIdName(), e);
            }
        });

        return toRet;
    }

    @Override
    public PostedResourceDTO postRules(List<RuleDTO> ruleDto, Long projectId, UserDTO principal) throws DummyGenericException {
        if(Utils.isNullOrEmpty(ruleDto)){
            throw new DummyGenericException(ErrorCode.INTERNAL_SERVER_ERRROR); //TODO ADD Custom exception handling.
        }
        for(RuleDTO r : ruleDto){
            projectsMapper.selectOne(selectModelQueryExpressionDSL -> selectModelQueryExpressionDSL
                    .where(ProjectsDynamicSqlSupport.id, isEqualTo(projectId))
                    .and(ProjectsDynamicSqlSupport.userId, isEqualTo(principal.getId()))).orElseThrow(() ->  new DummyGenericException(ErrorCode.INTERNAL_SERVER_ERRROR)); //TODO add unauth exception handelr.


            r.getConditions().stream().forEach(c-> {
                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(c.getValue() );
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);//TODO ADD custom exception
                }
                c.setValue(json);
            });
            Long postedRuleId = rulesExtMapper.customInsert(r, projectId);

            return PostedResourceDTO.builder()
                    .success(postedRuleId != null)
                    .build();
        }

        return PostedResourceDTO.builder()
                .success(false)
                .build();
    }
    private void checkIfRuleIsAccessible(Long projectId, UserDTO principal) throws DummyGenericException {
        projectsMapper.selectOne(selectModelQueryExpressionDSL -> selectModelQueryExpressionDSL
                .where(ProjectsDynamicSqlSupport.id, isEqualTo(projectId))
                .and(ProjectsDynamicSqlSupport.userId, isEqualTo(principal.getId()))).orElseThrow(() ->  new DummyGenericException(ErrorCode.INTERNAL_SERVER_ERRROR)); //TODO add unauth exception handelr.
    }


    @Override
    public PostedResourceDTO postRule(RuleDTO ruleDTO, Long projectId, UserDTO principal) throws DummyGenericException {
        this.checkIfRuleIsAccessible(projectId, principal);

        List<Rules> toBeInserted = new LinkedList<>();

        if(ruleDTO.getConditions() == null || ruleDTO.getConditions().isEmpty()){
            Rules r = new Rules();
            r.setRulename(ruleDTO.getRuleName());
            r.setSalience(ruleDTO.getSalience());
            if(ruleDTO.getWorkflow() != null && ruleDTO.getWorkflow().getIdWorkflow() != null)
                r.setIdWorkflow(ruleDTO.getWorkflow().getIdWorkflow());
            toBeInserted.add(r);
        }else{
            ruleDTO.getConditions().stream().forEach(c-> {
                Rules r = new Rules();
                r.setRulename(ruleDTO.getRuleName());
                r.setSalience(ruleDTO.getSalience());
                r.setIdCondition(c.getIdCondition());
                if(ruleDTO.getWorkflow() != null && ruleDTO.getWorkflow().getIdWorkflow() != null)
                    r.setIdWorkflow(ruleDTO.getWorkflow().getIdWorkflow());
                toBeInserted.add(r);
            });
        }
        toBeInserted.stream().forEach(r -> {
            rulesMapper.insertSelective(r);
        });

        return PostedResourceDTO.builder()
                .success(true)
                .build();
    }


    @Override
    public PostedResourceDTO updateRule(RuleDTO ruleDTO, Long projectId, UserDTO principal) throws DummyGenericException {
        this.checkIfRuleIsAccessible(projectId, principal);

        rulesMapper.deleteByPrimaryKey(ruleDTO.getIdRule());
        return this.postRule(ruleDTO, projectId, principal);

    }

    @Override
    public PostedResourceDTO updateRules(List<RuleDTO> ruleDTO, Long projectId, UserDTO principal) throws DummyGenericException {
        for(RuleDTO r : ruleDTO){
            this.updateRule(r, projectId, principal);
        }
        return PostedResourceDTO.builder()
                .success(true)
                .build();
    }



}
