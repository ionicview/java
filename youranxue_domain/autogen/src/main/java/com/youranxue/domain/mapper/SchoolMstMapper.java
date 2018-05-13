package com.youranxue.domain.mapper;

import com.youranxue.domain.model.SchoolMst;
import com.youranxue.domain.model.SchoolMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchoolMstMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.school_mst
     *
     * @mbg.generated Mon Dec 04 06:12:14 JST 2017
     */
    long countByExample(SchoolMstExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.school_mst
     *
     * @mbg.generated Mon Dec 04 06:12:14 JST 2017
     */
    int deleteByExample(SchoolMstExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.school_mst
     *
     * @mbg.generated Mon Dec 04 06:12:14 JST 2017
     */
    int deleteByPrimaryKey(Long schoolId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.school_mst
     *
     * @mbg.generated Mon Dec 04 06:12:14 JST 2017
     */
    int insert(SchoolMst record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.school_mst
     *
     * @mbg.generated Mon Dec 04 06:12:14 JST 2017
     */
    int insertSelective(SchoolMst record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.school_mst
     *
     * @mbg.generated Mon Dec 04 06:12:14 JST 2017
     */
    List<SchoolMst> selectByExample(SchoolMstExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.school_mst
     *
     * @mbg.generated Mon Dec 04 06:12:14 JST 2017
     */
    SchoolMst selectByPrimaryKey(Long schoolId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.school_mst
     *
     * @mbg.generated Mon Dec 04 06:12:14 JST 2017
     */
    int updateByExampleSelective(@Param("record") SchoolMst record, @Param("example") SchoolMstExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.school_mst
     *
     * @mbg.generated Mon Dec 04 06:12:14 JST 2017
     */
    int updateByExample(@Param("record") SchoolMst record, @Param("example") SchoolMstExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.school_mst
     *
     * @mbg.generated Mon Dec 04 06:12:14 JST 2017
     */
    int updateByPrimaryKeySelective(SchoolMst record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.school_mst
     *
     * @mbg.generated Mon Dec 04 06:12:14 JST 2017
     */
    int updateByPrimaryKey(SchoolMst record);
}