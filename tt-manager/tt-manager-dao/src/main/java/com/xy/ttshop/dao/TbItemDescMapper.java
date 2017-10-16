package com.xy.ttshop.dao;

import com.xy.ttshop.pojo.po.TbItemDesc;
import com.xy.ttshop.pojo.po.TbItemDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemDescMapper {
    int countByExample(TbItemDescExample example);

    int deleteByExample(TbItemDescExample example);

    int deleteByPrimaryKey(Long itemId);

    int insert(TbItemDesc record);

    int insertSelective(TbItemDesc record);

    java.util.List<TbItemDesc> selectByExampleWithBLOBs(TbItemDescExample example);

    java.util.List<TbItemDesc> selectByExample(TbItemDescExample example);

    TbItemDesc selectByPrimaryKey(Long itemId);

    int updateByExampleSelective(@org.apache.ibatis.annotations.Param("record") TbItemDesc record, @org.apache.ibatis.annotations.Param("example") TbItemDescExample example);

    int updateByExampleWithBLOBs(@org.apache.ibatis.annotations.Param("record") TbItemDesc record, @org.apache.ibatis.annotations.Param("example") TbItemDescExample example);

    int updateByExample(@org.apache.ibatis.annotations.Param("record") TbItemDesc record, @org.apache.ibatis.annotations.Param("example") TbItemDescExample example);

    int updateByPrimaryKeySelective(TbItemDesc record);

    int updateByPrimaryKeyWithBLOBs(TbItemDesc record);

    int updateByPrimaryKey(TbItemDesc record);
}