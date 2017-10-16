package com.xy.ttshop.dao;

import com.xy.ttshop.pojo.po.TbItemParamItem;
import com.xy.ttshop.pojo.po.TbItemParamItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemParamItemMapper {
    int countByExample(TbItemParamItemExample example);

    int deleteByExample(TbItemParamItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbItemParamItem record);

    int insertSelective(TbItemParamItem record);

    java.util.List<TbItemParamItem> selectByExampleWithBLOBs(TbItemParamItemExample example);

    java.util.List<TbItemParamItem> selectByExample(TbItemParamItemExample example);

    TbItemParamItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@org.apache.ibatis.annotations.Param("record") TbItemParamItem record, @org.apache.ibatis.annotations.Param("example") TbItemParamItemExample example);

    int updateByExampleWithBLOBs(@org.apache.ibatis.annotations.Param("record") TbItemParamItem record, @org.apache.ibatis.annotations.Param("example") TbItemParamItemExample example);

    int updateByExample(@org.apache.ibatis.annotations.Param("record") TbItemParamItem record, @org.apache.ibatis.annotations.Param("example") TbItemParamItemExample example);

    int updateByPrimaryKeySelective(TbItemParamItem record);

    int updateByPrimaryKeyWithBLOBs(TbItemParamItem record);

    int updateByPrimaryKey(TbItemParamItem record);
}