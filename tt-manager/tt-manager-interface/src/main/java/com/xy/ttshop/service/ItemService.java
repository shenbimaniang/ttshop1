package com.xy.ttshop.service;

import com.xy.common.dto.Order;
import com.xy.common.dto.Page;
import com.xy.common.dto.Result;
import com.xy.ttshop.pojo.po.TbItem;
import com.xy.ttshop.pojo.vo.TbItemCustom;
import com.xy.ttshop.pojo.vo.TbItemQuery;

import java.util.List;

public interface ItemService {
    TbItem getById(Long itemId);

    List<TbItem> listItems();

    Result<TbItem> listItemsByPage(Page page);

    Result<TbItemCustom> listItemsByPage1(Page page, Order order, TbItemQuery query);

    int modifyByIds(List<Long> ids);

    int modifyByIds2(List<Long> ids);

    int modifyByIds3(List<Long> ids);

    int saveItem(TbItem tbItem,String content);
}
