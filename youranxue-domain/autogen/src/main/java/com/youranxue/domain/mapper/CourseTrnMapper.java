package com.youranxue.domain.mapper;

import com.youranxue.domain.model.CourseTrn;
import com.youranxue.domain.model.CourseTrnExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CourseTrnMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.course_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	long countByExample(CourseTrnExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.course_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	int deleteByExample(CourseTrnExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.course_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	int deleteByPrimaryKey(String courseId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.course_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	int insert(CourseTrn record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.course_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	int insertSelective(CourseTrn record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.course_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	List<CourseTrn> selectByExample(CourseTrnExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.course_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	CourseTrn selectByPrimaryKey(String courseId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.course_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	int updateByExampleSelective(@Param("record") CourseTrn record, @Param("example") CourseTrnExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.course_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	int updateByExample(@Param("record") CourseTrn record, @Param("example") CourseTrnExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.course_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	int updateByPrimaryKeySelective(CourseTrn record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.course_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	int updateByPrimaryKey(CourseTrn record);
}