package com.xy.ttshop.dao;

import com.xy.ttshop.pojo.po.TbOrderItem;
import com.xy.ttshop.pojo.po.TbOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderItemMapper {
    int countByExample(TbOrderItemExample example);

    int deleteByExample(TbOrderItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbOrderItem record);

    int insertSelective(TbOrderItem record);

    java.util.List<TbOrderItem> selectByExample(TbOrderItemExample example);

    TbOrderItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@org.apache.ibatis.annotations.Param("record") TbOrderItem record, @org.apache.ibatis.annotations.Param("example") TbOrderItemExample example);

    int updateByExample(@org.apache.ibatis.annotations.Param("record") TbOrderItem record, @org.apache.ibatis.annotations.Param("example") TbOrderItemExample example);

    int updateByPrimaryKeySelective(TbOrderItem record);

    int updateByPrimaryKey(TbOrderItem record);
}