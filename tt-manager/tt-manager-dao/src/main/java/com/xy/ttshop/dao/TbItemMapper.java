package com.xy.ttshop.dao;

import com.xy.ttshop.pojo.po.TbItem;
import com.xy.ttshop.pojo.po.TbItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemMapper {
    int countByExample(TbItemExample example);

    int deleteByExample(TbItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbItem record);

    int insertSelective(TbItem record);

    java.util.List<TbItem> selectByExample(TbItemExample example);

    TbItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@org.apache.ibatis.annotations.Param("record") TbItem record, @org.apache.ibatis.annotations.Param("example") TbItemExample example);

    int updateByExample(@org.apache.ibatis.annotations.Param("record") TbItem record, @org.apache.ibatis.annotations.Param("example") TbItemExample example);

    int updateByPrimaryKeySelective(TbItem record);

    int updateByPrimaryKey(TbItem record);
}