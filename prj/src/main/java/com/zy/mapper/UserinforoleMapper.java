package com.zy.mapper;

import com.zy.entity.UserinforoleExample;
import com.zy.entity.UserinforoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserinforoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    int countByExample(UserinforoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    int deleteByExample(UserinforoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    int deleteByPrimaryKey(UserinforoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    int insert(UserinforoleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    int insertSelective(UserinforoleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    List<UserinforoleKey> selectByExample(UserinforoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserinforoleKey record, @Param("example") UserinforoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    int updateByExample(@Param("record") UserinforoleKey record, @Param("example") UserinforoleExample example);
}