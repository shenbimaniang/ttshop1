package com.xy.ttshop.dao;

import com.xy.ttshop.pojo.po.TbItemCat;
import com.xy.ttshop.pojo.po.TbItemCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemCatMapper {
    int countByExample(TbItemCatExample example);

    int deleteByExample(TbItemCatExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbItemCat record);

    int insertSelective(TbItemCat record);

    java.util.List<TbItemCat> selectByExample(TbItemCatExample example);

    TbItemCat selectByPrimaryKey(Long id);

    int updateByExampleSelective(@org.apache.ibatis.annotations.Param("record") TbItemCat record, @org.apache.ibatis.annotations.Param("example") TbItemCatExample example);

    int updateByExample(@org.apache.ibatis.annotations.Param("record") TbItemCat record, @org.apache.ibatis.annotations.Param("example") TbItemCatExample example);

    int updateByPrimaryKeySelective(TbItemCat record);

    int updateByPrimaryKey(TbItemCat record);
}