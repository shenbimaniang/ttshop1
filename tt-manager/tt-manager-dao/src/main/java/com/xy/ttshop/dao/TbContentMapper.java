package com.xy.ttshop.dao;

import com.xy.ttshop.pojo.po.TbContent;
import com.xy.ttshop.pojo.po.TbContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbContentMapper {
    int countByExample(TbContentExample example);

    int deleteByExample(TbContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbContent record);

    int insertSelective(TbContent record);

    java.util.List<TbContent> selectByExampleWithBLOBs(TbContentExample example);

    java.util.List<TbContent> selectByExample(TbContentExample example);

    TbContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@org.apache.ibatis.annotations.Param("record") TbContent record, @org.apache.ibatis.annotations.Param("example") TbContentExample example);

    int updateByExampleWithBLOBs(@org.apache.ibatis.annotations.Param("record") TbContent record, @org.apache.ibatis.annotations.Param("example") TbContentExample example);

    int updateByExample(@org.apache.ibatis.annotations.Param("record") TbContent record, @org.apache.ibatis.annotations.Param("example") TbContentExample example);

    int updateByPrimaryKeySelective(TbContent record);

    int updateByPrimaryKeyWithBLOBs(TbContent record);

    int updateByPrimaryKey(TbContent record);
}