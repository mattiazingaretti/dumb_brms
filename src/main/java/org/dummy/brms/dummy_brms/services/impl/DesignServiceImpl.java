package org.dummy.brms.dummy_brms.services.impl;

import lombok.extern.slf4j.Slf4j;
import org.dummy.brms.dummy_brms.exception.DummyBadRequestException;
import org.dummy.brms.dummy_brms.exception.DummyGenericException;
import org.dummy.brms.dummy_brms.exception.ErrorCode;
import org.dummy.brms.dummy_brms.model.dto.*;
import org.dummy.brms.dummy_brms.mybatis.ext.RuleDataTypesMapperExt;
import org.dummy.brms.dummy_brms.mybatis.mappers.*;
import org.dummy.brms.dummy_brms.mybatis.pojo.*;
import org.dummy.brms.dummy_brms.services.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Slf4j
@Service
@Transactional
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
    RulesMapper rulesMapper;

    @Autowired
    ProjectsMapper projectsMapper;

    @Autowired
    RuleConditionsMapper ruleConditionsMapper;
    @Autowired
    RuleWorkflowMapper ruleWorkflowMapper;
    @Autowired
    RulesMappingMapper rulesMappingMapper;
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


    //TODO test this function
    @Override
    public List<RuleDTO> getAllRulesInProject(Long projectId, UserDTO principal) throws DummyBadRequestException {
        if(projectId == null ){
            throw new DummyBadRequestException(ErrorCode.MISSING_PROJECT_ID);
        }

        List<RuleDTO> toRet = new LinkedList<>();
        if(this.isProjectAccessibleByTheCurrentUser(projectId, principal)){
            List<VRuleFull> viewResults = vRuleFullMapper.select(selectModelQueryExpressionDSL ->
               selectModelQueryExpressionDSL
                       .where(VRuleFullDynamicSqlSupport.projectId, isEqualTo(projectId))
            );

            Map<Long, List<VRuleFull>> groupedByRuleId = viewResults.stream()
                    .collect(Collectors.groupingBy(VRuleFull::getRuleId));

            toRet = groupedByRuleId.entrySet().stream()
                    .map(entry -> {
                        Long ruleId = entry.getKey();
                        List<VRuleFull> group = entry.getValue();

                        RuleDTO ruleDTO = new RuleDTO();
                        ruleDTO.setIdRule(ruleId);
                        ruleDTO.setFlgActive(group.get(0).getIsActive());
                        ruleDTO.setSalience(group.get(0).getSalience());
                        ruleDTO.setRuleName(group.get(0).getRuleName());

                        List<ConditionDTO> conditions = group.stream()
                                .filter(vRuleFull -> vRuleFull.getClassname() != null) // Filter out null conditions
                                .map(this::toConditionDTO)
                                .collect(Collectors.toList());
                        ruleDTO.setConditions(conditions);

                        Optional<VRuleFull> workflowEntry = group.stream()
                                .filter(vRuleFull -> vRuleFull.getIdWorkflow() != null)
                                .findFirst();
                        workflowEntry.ifPresent(vRuleFull -> {
                            WorkflowDTO workflowDTO = new WorkflowDTO();
                            workflowDTO.setIdWorkflow(vRuleFull.getIdWorkflow());
                            workflowDTO.setName(vRuleFull.getWorkflowName());
                            workflowDTO.setLastModified(vRuleFull.getLastUpdateWorkflow());
                            ruleDTO.setWorkflow(workflowDTO);
                        });

                        return ruleDTO;
                    })
                    .collect(Collectors.toList());
        }
        return toRet;
    }
    private ConditionDTO toConditionDTO(VRuleFull vRuleFull) {
        ConditionDTO conditionDTO = new ConditionDTO();
        conditionDTO.setIdCondition(vRuleFull.getIdCondition());
        conditionDTO.setClassName(vRuleFull.getClassname());
        conditionDTO.setField(vRuleFull.getField());
        conditionDTO.setOperator(vRuleFull.getOperator());
        conditionDTO.setConditionNameId(vRuleFull.getConditionNameId());
        conditionDTO.setFlgUseIdCondition(Boolean.TRUE.equals(vRuleFull.getFlgUseIdConditions()));
        conditionDTO.setValue(vRuleFull.getValue());

        return conditionDTO;
    }


    //TODO Fix transactional in same class
    @Override
    public RuleDTO postSingleRuleFull(RuleDTO ruleDTO, Long projectId, UserDTO principal) throws DummyBadRequestException, DummyGenericException {
        if(ruleDTO == null ){
            throw new DummyBadRequestException(ErrorCode.MISSING_RULES_TO_BE_POSTED);
        }

        if(this.isProjectAccessibleByTheCurrentUser(projectId,  principal)){
            Rules r = new Rules();
            r.setRuleName(ruleDTO.getRuleName());
            r.setSalience(ruleDTO.getSalience());
            r.setProjectId(projectId);
            if(ruleDTO.getFlgActive() != null)
                r.setIsActive(ruleDTO.getFlgActive());
            rulesMapper.insertSelective(r);

            Long ruleId = r.getRuleId();
            if(ruleId == null){
                throw new DummyGenericException(ErrorCode.FAILED_TO_INSERT_RULE);
            }
            ruleDTO.setIdRule(ruleId);

            List<ConditionDTO> conditions = ruleDTO.getConditions();
            List<Long> conditionsIds = new LinkedList<>();
            if(conditions != null && !conditions.isEmpty()){
                conditions.forEach(c->{
                    RuleConditions rc = new RuleConditions();
                    rc.setRuleId(ruleId);
                    rc.setClassname(c.getClassName());
                    rc.setField(c.getField());
                    rc.setOperator(c.getOperator());
                    rc.setConditionNameId(c.getConditionNameId());
                    rc.setFlgUseIdConditions(c.getFlgUseIdCondition());
                    rc.setValue(c.getValue());
                    rc.setReferencedConditionNameId(c.getReferencedConditionNameId());
                    rc.setSelectedIdConditionField(c.getSelectedIdConditionField());
                    ruleConditionsMapper.insertSelective(rc);
                    c.setIdCondition(rc.getIdCondition());
                    conditionsIds.add(rc.getIdCondition());
                });
            }
            WorkflowDTO workflowDTO = ruleDTO.getWorkflow();
            Long workFlowId;
            if(workflowDTO != null && workflowDTO.getName() != null){
                RuleWorkflow pw = new RuleWorkflow();
                pw.setRuleId(ruleId);
                pw.setWorkflowName(workflowDTO.getName());
                pw.setLastUpdateWorkflow(workflowDTO.getLastModified());
                ruleWorkflowMapper.insertSelective(pw);
                workFlowId = pw.getIdWorkflow();
            } else {
                workFlowId = null;
            }
            if(conditionsIds != null && !conditionsIds.isEmpty() || workFlowId != null){
                conditionsIds.forEach(c->{
                    RulesMapping rulesMapping = new RulesMapping();
                    rulesMapping.setRuleId(ruleId);
                    rulesMapping.setIdCondition(c);
                    rulesMapping.setIdWorkflow(workFlowId);
                    rulesMappingMapper.insert(rulesMapping);
                });
            }

        }
        return ruleDTO;
    }

    @Override
    public void deleteRuleFull(RuleDTO rule, Long projectId, UserDTO principal) throws DummyBadRequestException, DummyGenericException {
        if(rule == null || rule.getIdRule() == null){
            throw new DummyBadRequestException(ErrorCode.MISSING_RULES_TO_BE_POSTED);
        }

        if(this.isProjectAccessibleByTheCurrentUser(projectId,  principal)){
            rulesMappingMapper.delete(deleteModelQueryExpressionDSL ->
                    deleteModelQueryExpressionDSL.where(RulesMappingDynamicSqlSupport.ruleId, isEqualTo(rule.getIdRule())));
            ruleConditionsMapper.delete(deleteModelQueryExpressionDSL ->
                    deleteModelQueryExpressionDSL
                            .where(RuleConditionsDynamicSqlSupport.ruleId, isEqualTo(rule.getIdRule())));
            rulesMapper.deleteByPrimaryKey(rule.getIdRule());
        }

    }

    @Override
    public RuleDTO updateSingleRuleFull(RuleDTO rule, Long projectId, UserDTO principal) throws DummyGenericException, DummyBadRequestException {
        this.deleteRuleFull(rule, projectId, principal);
        return this.postSingleRuleFull(rule, projectId, principal);
    }


    @Override
    public List<RuleDTO> updateRulesFull(List<RuleDTO> rules, Long projectId, UserDTO principal) throws DummyGenericException, DummyBadRequestException {
        List<RuleDTO> toRet = new LinkedList<>();
        for(RuleDTO rule: rules){
            toRet.add(this.updateSingleRuleFull(rule, projectId, principal));
        }
        return toRet;
    }

    @Override
    public void deleteRulesFull(List<RuleDTO> rules, Long projectId, UserDTO principal) throws DummyGenericException, DummyBadRequestException {
        for(RuleDTO rule: rules){
            this.deleteRuleFull(rule, projectId, principal);
        }
    }

    @Override
    public void activateRuleInProj(RuleDTO ruleDto, Long projectId, UserDTO principal) throws DummyBadRequestException {
        if(this.isProjectAccessibleByTheCurrentUser(projectId, principal)){
            Rules rule = new Rules();
            rule.setIsActive(ruleDto.getFlgActive());
            rule.setRuleId(ruleDto.getIdRule());
            rulesMapper.updateByPrimaryKeySelective(rule);
        }
    }


    private boolean isProjectAccessibleByTheCurrentUser(Long projectId, UserDTO principal) throws DummyBadRequestException {
        Projects proj = projectsMapper.selectOne(selectModelQueryExpressionDSL -> selectModelQueryExpressionDSL
                .where(ProjectsDynamicSqlSupport.id, isEqualTo(projectId))
                .and(ProjectsDynamicSqlSupport.userId, isEqualTo(principal.getId()))).orElseThrow(() ->  new DummyBadRequestException(ErrorCode.UNAUTHORIZED_PROJECT_FOR_CURRENT_USER));
        return proj != null;
    }




}
