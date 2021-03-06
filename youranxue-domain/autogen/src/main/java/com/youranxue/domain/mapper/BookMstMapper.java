package com.youranxue.domain.mapper;

import com.youranxue.domain.model.BookMst;
import com.youranxue.domain.model.BookMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookMstMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.book_mst
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	long countByExample(BookMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.book_mst
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	int deleteByExample(BookMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.book_mst
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	int deleteByPrimaryKey(Integer bookId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.book_mst
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	int insert(BookMst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.book_mst
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	int insertSelective(BookMst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.book_mst
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	List<BookMst> selectByExample(BookMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.book_mst
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	BookMst selectByPrimaryKey(Integer bookId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.book_mst
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	int updateByExampleSelective(@Param("record") BookMst record, @Param("example") BookMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.book_mst
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	int updateByExample(@Param("record") BookMst record, @Param("example") BookMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.book_mst
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	int updateByPrimaryKeySelective(BookMst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.book_mst
	 * @mbg.generated  Sun Mar 18 16:04:02 JST 2018
	 */
	int updateByPrimaryKey(BookMst record);
}