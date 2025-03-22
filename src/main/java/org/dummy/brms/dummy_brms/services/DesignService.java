package org.dummy.brms.dummy_brms.services;


import org.dummy.brms.dummy_brms.exception.DummyBadRequestException;
import org.dummy.brms.dummy_brms.exception.DummyGenericException;
import org.dummy.brms.dummy_brms.model.dto.*;

import java.util.List;

public interface DesignService {

    PostedResourceDTO postRuleInput(List<RuleInputRequestDTO> rinput, UserDTO principal);

    PostedResourceDTO postRuleOutPut(List<RuleOutputRequestDTO> rinput, UserDTO principal);

    List<RuleInputResponseDTO> getRuleInput(Long projectId, UserDTO principal);
    List<RuleOutputResponseDTO> getRuleOutput(Long projectId, UserDTO principal);


    List<RuleDataTypesDTO> getDataTypes(UserDTO principal);

    RuleDataResponseDTO getRuleData(Long projectId, UserDTO principal);

    List<RuleDTO> getAllRulesInProject(Long projectId, UserDTO principal) throws DummyBadRequestException;

    //Single Rule CRUD Methods
    RuleDTO postSingleRuleFull(RuleDTO rule, Long projectId, UserDTO principal) throws DummyBadRequestException, DummyGenericException;

    void deleteRuleFull(RuleDTO rule, Long projectId, UserDTO principal) throws DummyBadRequestException, DummyGenericException;

    RuleDTO updateSingleRuleFull(RuleDTO rule, Long projectId, UserDTO principal) throws DummyGenericException, DummyBadRequestException;

    List<RuleDTO> updateRulesFull(List<RuleDTO> rules, Long projectId, UserDTO principal) throws DummyGenericException, DummyBadRequestException;

    void deleteRulesFull(List<RuleDTO> rules, Long projectId, UserDTO principal) throws DummyGenericException, DummyBadRequestException;
}
