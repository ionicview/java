package com.youranxue.domain.mapper;

import com.youranxue.domain.model.ChapterMst;
import com.youranxue.domain.model.ChapterMstExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ChapterMstMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table youranxue.chapter_mst
	 * 
	 * @mbg.generated Sun Mar 18 16:04:02 JST 2018
	 */
	long countByExample(ChapterMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table youranxue.chapter_mst
	 * 
	 * @mbg.generated Sun Mar 18 16:04:02 JST 2018
	 */
	int deleteByExample(ChapterMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table youranxue.chapter_mst
	 * 
	 * @mbg.generated Sun Mar 18 16:04:02 JST 2018
	 */
	int deleteByPrimaryKey(Integer chapterId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table youranxue.chapter_mst
	 * 
	 * @mbg.generated Sun Mar 18 16:04:02 JST 2018
	 */
	int insert(ChapterMst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table youranxue.chapter_mst
	 * 
	 * @mbg.generated Sun Mar 18 16:04:02 JST 2018
	 */
	int insertSelective(ChapterMst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table youranxue.chapter_mst
	 * 
	 * @mbg.generated Sun Mar 18 16:04:02 JST 2018
	 */
	List<ChapterMst> selectByExample(ChapterMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table youranxue.chapter_mst
	 * 
	 * @mbg.generated Sun Mar 18 16:04:02 JST 2018
	 */
	ChapterMst selectByPrimaryKey(Integer chapterId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table youranxue.chapter_mst
	 * 
	 * @mbg.generated Sun Mar 18 16:04:02 JST 2018
	 */
	int updateByExampleSelective(@Param("record") ChapterMst record, @Param("example") ChapterMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table youranxue.chapter_mst
	 * 
	 * @mbg.generated Sun Mar 18 16:04:02 JST 2018
	 */
	int updateByExample(@Param("record") ChapterMst record, @Param("example") ChapterMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table youranxue.chapter_mst
	 * 
	 * @mbg.generated Sun Mar 18 16:04:02 JST 2018
	 */
	int updateByPrimaryKeySelective(ChapterMst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table youranxue.chapter_mst
	 * 
	 * @mbg.generated Sun Mar 18 16:04:02 JST 2018
	 */
	int updateByPrimaryKey(ChapterMst record);
}