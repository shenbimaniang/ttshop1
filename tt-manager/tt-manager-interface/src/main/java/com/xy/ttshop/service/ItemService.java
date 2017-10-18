package com.xy.ttshop.service;

import com.xy.common.dto.Page;
import com.xy.common.dto.Result;
import com.xy.ttshop.pojo.po.TbItem;

import java.util.List;

public interface ItemService {
    TbItem getById(Long itemId);
    List<TbItem> listItems();
    Result<TbItem> listItemsByPage(Page page);
}
