package com.xy.ttshop.dao;

import com.xy.ttshop.pojo.po.TbOrderShipping;
import com.xy.ttshop.pojo.po.TbOrderShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderShippingMapper {
    int countByExample(TbOrderShippingExample example);

    int deleteByExample(TbOrderShippingExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(TbOrderShipping record);

    int insertSelective(TbOrderShipping record);

    java.util.List<TbOrderShipping> selectByExample(TbOrderShippingExample example);

    TbOrderShipping selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@org.apache.ibatis.annotations.Param("record") TbOrderShipping record, @org.apache.ibatis.annotations.Param("example") TbOrderShippingExample example);

    int updateByExample(@org.apache.ibatis.annotations.Param("record") TbOrderShipping record, @org.apache.ibatis.annotations.Param("example") TbOrderShippingExample example);

    int updateByPrimaryKeySelective(TbOrderShipping record);

    int updateByPrimaryKey(TbOrderShipping record);
}