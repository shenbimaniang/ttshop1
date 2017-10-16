package com.xy.ttshop.dao;

import com.xy.ttshop.pojo.po.TbUser;
import com.xy.ttshop.pojo.po.TbUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbUserMapper {
    int countByExample(TbUserExample example);

    int deleteByExample(TbUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    java.util.List<TbUser> selectByExample(TbUserExample example);

    TbUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@org.apache.ibatis.annotations.Param("record") TbUser record, @org.apache.ibatis.annotations.Param("example") TbUserExample example);

    int updateByExample(@org.apache.ibatis.annotations.Param("record") TbUser record, @org.apache.ibatis.annotations.Param("example") TbUserExample example);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}