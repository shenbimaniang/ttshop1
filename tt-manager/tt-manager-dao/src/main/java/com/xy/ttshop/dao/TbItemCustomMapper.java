package com.xy.ttshop.dao;

import com.xy.common.dto.Page;
import com.xy.ttshop.pojo.po.TbItem;

import java.util.List;

/**
 * User: 。。。
 * Date: 2017/10/18
 * Time: 19:44
 * Version:V1.0
 */
public interface TbItemCustomMapper {
    List<TbItem> listItemsByPage(Page page);
    long countItems();
}
