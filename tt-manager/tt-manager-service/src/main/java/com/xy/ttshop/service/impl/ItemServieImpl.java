package com.xy.ttshop.service.impl;

import com.xy.common.dto.Page;
import com.xy.common.dto.Result;
import com.xy.ttshop.dao.TbItemMapper;
import com.xy.ttshop.dao.TbItemCustomMapper;
import com.xy.ttshop.pojo.po.TbItem;
import com.xy.ttshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServieImpl implements ItemService {

    @Autowired
    private TbItemMapper itemDao;

    @Autowired
    private TbItemCustomMapper tbItemCustomMapper;
    @Override
    public TbItem getById(Long itemId) {
        return itemDao.selectByPrimaryKey(itemId);
    }

    @Override
    public List<TbItem> listItems() {
        return itemDao.selectByExample(null);
    }

    @Override
    public Result<TbItem> listItemsByPage(Page page) {
        List<TbItem> list = tbItemCustomMapper.listItemsByPage(page);
        long counts = tbItemCustomMapper.countItems();
        Result<TbItem> rs = new Result<TbItem>();
        rs.setRows(list);
        rs.setTotal(counts);
        return rs;
    }



}
