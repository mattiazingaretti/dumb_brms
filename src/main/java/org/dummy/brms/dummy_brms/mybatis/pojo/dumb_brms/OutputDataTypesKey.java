package org.dummy.brms.dummy_brms.mybatis.pojo.dumb_brms;

public class OutputDataTypesKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dumb_brms.output_data_types.user_id
     *
     * @mbg.generated Thu Jan 30 20:11:38 CET 2025
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dumb_brms.output_data_types.project_id
     *
     * @mbg.generated Thu Jan 30 20:11:38 CET 2025
     */
    private Long projectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dumb_brms.output_data_types.data_type_name
     *
     * @mbg.generated Thu Jan 30 20:11:38 CET 2025
     */
    private String dataTypeName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dumb_brms.output_data_types.user_id
     *
     * @return the value of dumb_brms.output_data_types.user_id
     *
     * @mbg.generated Thu Jan 30 20:11:38 CET 2025
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dumb_brms.output_data_types.user_id
     *
     * @param userId the value for dumb_brms.output_data_types.user_id
     *
     * @mbg.generated Thu Jan 30 20:11:38 CET 2025
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dumb_brms.output_data_types.project_id
     *
     * @return the value of dumb_brms.output_data_types.project_id
     *
     * @mbg.generated Thu Jan 30 20:11:38 CET 2025
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dumb_brms.output_data_types.project_id
     *
     * @param projectId the value for dumb_brms.output_data_types.project_id
     *
     * @mbg.generated Thu Jan 30 20:11:38 CET 2025
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dumb_brms.output_data_types.data_type_name
     *
     * @return the value of dumb_brms.output_data_types.data_type_name
     *
     * @mbg.generated Thu Jan 30 20:11:38 CET 2025
     */
    public String getDataTypeName() {
        return dataTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dumb_brms.output_data_types.data_type_name
     *
     * @param dataTypeName the value for dumb_brms.output_data_types.data_type_name
     *
     * @mbg.generated Thu Jan 30 20:11:38 CET 2025
     */
    public void setDataTypeName(String dataTypeName) {
        this.dataTypeName = dataTypeName == null ? null : dataTypeName.trim();
    }
}