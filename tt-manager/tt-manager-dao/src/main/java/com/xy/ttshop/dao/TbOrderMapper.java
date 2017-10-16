package com.xy.ttshop.dao;

import com.xy.ttshop.pojo.po.TbOrder;
import com.xy.ttshop.pojo.po.TbOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderMapper {
    int countByExample(TbOrderExample example);

    int deleteByExample(TbOrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(TbOrder record);

    int insertSelective(TbOrder record);

    java.util.List<TbOrder> selectByExample(TbOrderExample example);

    TbOrder selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@org.apache.ibatis.annotations.Param("record") TbOrder record, @org.apache.ibatis.annotations.Param("example") TbOrderExample example);

    int updateByExample(@org.apache.ibatis.annotations.Param("record") TbOrder record, @org.apache.ibatis.annotations.Param("example") TbOrderExample example);

    int updateByPrimaryKeySelective(TbOrder record);

    int updateByPrimaryKey(TbOrder record);
}