package com.xy.ttshop.dao;

import com.xy.ttshop.pojo.po.TbContentCategory;
import com.xy.ttshop.pojo.po.TbContentCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbContentCategoryMapper {
    int countByExample(TbContentCategoryExample example);

    int deleteByExample(TbContentCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbContentCategory record);

    int insertSelective(TbContentCategory record);

    java.util.List<TbContentCategory> selectByExample(TbContentCategoryExample example);

    TbContentCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@org.apache.ibatis.annotations.Param("record") TbContentCategory record, @org.apache.ibatis.annotations.Param("example") TbContentCategoryExample example);

    int updateByExample(@org.apache.ibatis.annotations.Param("record") TbContentCategory record, @org.apache.ibatis.annotations.Param("example") TbContentCategoryExample example);

    int updateByPrimaryKeySelective(TbContentCategory record);

    int updateByPrimaryKey(TbContentCategory record);
}