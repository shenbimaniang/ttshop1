package com.xy.ttshop.dao;

import com.xy.common.dto.Page;
import com.xy.ttshop.pojo.po.TbItem;
import com.xy.ttshop.pojo.vo.TbItemCustom;

import java.util.List;
import java.util.Map;

/**
 * User: 。。。
 * Date: 2017/10/18
 * Time: 19:44
 * Version:V1.0
 */
public interface TbItemCustomMapper {
    List<TbItem> listItemsByPage(Page page);
    long countItems(Map<String,Object> map);
    List<TbItemCustom> listItemsByPage1(Map<String,Object> map);
}
