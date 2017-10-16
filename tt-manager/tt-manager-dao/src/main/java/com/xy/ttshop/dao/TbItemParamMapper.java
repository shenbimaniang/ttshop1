package com.xy.ttshop.dao;

import com.xy.ttshop.pojo.po.TbItemParam;
import com.xy.ttshop.pojo.po.TbItemParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemParamMapper {
    int countByExample(TbItemParamExample example);

    int deleteByExample(TbItemParamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbItemParam record);

    int insertSelective(TbItemParam record);

    java.util.List<TbItemParam> selectByExampleWithBLOBs(TbItemParamExample example);

    java.util.List<TbItemParam> selectByExample(TbItemParamExample example);

    TbItemParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@org.apache.ibatis.annotations.Param("record") TbItemParam record, @org.apache.ibatis.annotations.Param("example") TbItemParamExample example);

    int updateByExampleWithBLOBs(@org.apache.ibatis.annotations.Param("record") TbItemParam record, @org.apache.ibatis.annotations.Param("example") TbItemParamExample example);

    int updateByExample(@org.apache.ibatis.annotations.Param("record") TbItemParam record, @org.apache.ibatis.annotations.Param("example") TbItemParamExample example);

    int updateByPrimaryKeySelective(TbItemParam record);

    int updateByPrimaryKeyWithBLOBs(TbItemParam record);

    int updateByPrimaryKey(TbItemParam record);
}