package com.youranxue.domain.mapper;

import com.youranxue.domain.model.Question;
import com.youranxue.domain.model.QuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.question
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	long countByExample(QuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.question
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	int deleteByExample(QuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.question
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	int deleteByPrimaryKey(Integer questionId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.question
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	int insert(Question record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.question
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	int insertSelective(Question record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.question
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	List<Question> selectByExample(QuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.question
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	Question selectByPrimaryKey(Integer questionId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.question
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	int updateByExampleSelective(@Param("record") Question record, @Param("example") QuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.question
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	int updateByExample(@Param("record") Question record, @Param("example") QuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.question
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	int updateByPrimaryKeySelective(Question record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.question
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	int updateByPrimaryKey(Question record);
}