package org.dummy.brms.dummy_brms.mybatis.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.dummy.brms.dummy_brms.mybatis.pojo.dumb_brms.Projects;
import org.dummy.brms.dummy_brms.mybatis.pojo.dumb_brms.ProjectsExample;
import org.dummy.brms.dummy_brms.mybatis.pojo.dumb_brms.ProjectsKey;

public interface ProjectsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dumb_brms.projects
     *
     * @mbg.generated Thu Jan 30 20:11:38 CET 2025
     */
    long countByExample(ProjectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dumb_brms.projects
     *
     * @mbg.generated Thu Jan 30 20:11:38 CET 2025
     */
    int deleteByExample(ProjectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dumb_brms.projects
     *
     * @mbg.generated Thu Jan 30 20:11:38 CET 2025
     */
    int deleteByPrimaryKey(ProjectsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dumb_brms.projects
     *
     * @mbg.generated Thu Jan 30 20:11:38 CET 2025
     */
    int insert(Projects row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dumb_brms.projects
     *
     * @mbg.generated Thu Jan 30 20:11:38 CET 2025
     */
    int insertSelective(Projects row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dumb_brms.projects
     *
     * @mbg.generated Thu Jan 30 20:11:38 CET 2025
     */
    List<Projects> selectByExample(ProjectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dumb_brms.projects
     *
     * @mbg.generated Thu Jan 30 20:11:38 CET 2025
     */
    Projects selectByPrimaryKey(ProjectsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dumb_brms.projects
     *
     * @mbg.generated Thu Jan 30 20:11:38 CET 2025
     */
    int updateByExampleSelective(@Param("row") Projects row, @Param("example") ProjectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dumb_brms.projects
     *
     * @mbg.generated Thu Jan 30 20:11:38 CET 2025
     */
    int updateByExample(@Param("row") Projects row, @Param("example") ProjectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dumb_brms.projects
     *
     * @mbg.generated Thu Jan 30 20:11:38 CET 2025
     */
    int updateByPrimaryKeySelective(Projects row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dumb_brms.projects
     *
     * @mbg.generated Thu Jan 30 20:11:38 CET 2025
     */
    int updateByPrimaryKey(Projects row);
}