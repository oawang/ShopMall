package com.superman.superman.dao;

import com.superman.superman.model.Oder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oder
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oder
     *
     * @mbggenerated
     */
    int insert(Oder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oder
     *
     * @mbggenerated
     */
    int insertSelective(Oder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oder
     *
     * @mbggenerated
     */
    Oder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oder
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Oder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oder
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Oder record);
}