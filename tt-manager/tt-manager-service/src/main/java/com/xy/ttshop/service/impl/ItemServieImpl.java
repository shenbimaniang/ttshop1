package com.xy.ttshop.service.impl;

import com.xy.common.dto.Order;
import com.xy.common.dto.Page;
import com.xy.common.dto.Result;
import com.xy.ttshop.dao.TbItemMapper;
import com.xy.ttshop.dao.TbItemCustomMapper;
import com.xy.ttshop.pojo.po.TbItem;
import com.xy.ttshop.pojo.po.TbItemExample;
import com.xy.ttshop.pojo.vo.TbItemCustom;
import com.xy.ttshop.pojo.vo.TbItemQuery;
import com.xy.ttshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
//        long counts = tbItemCustomMapper.countItems();
        Result<TbItem> rs = new Result<TbItem>();
        rs.setRows(list);
//        rs.setTotal(counts);
        return rs;
    }

    @Override
    public Result<TbItemCustom> listItemsByPage1(Page page, Order order, TbItemQuery query) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("page",page);
        map.put("order",order);
        map.put("query",query);
        List<TbItemCustom> list = tbItemCustomMapper.listItemsByPage1(map);
        long counts = tbItemCustomMapper.countItems(map);
        Result<TbItemCustom> rs = new Result<TbItemCustom>();
        rs.setRows(list);
        rs.setTotal(counts);
        return rs;
    }

    @Override
    public int modifyByIds(List<Long> ids) {
        TbItem record = new TbItem();
        record.setStatus((byte) 3);
        TbItemExample example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);
        return itemDao.updateByExampleSelective(record,example);
    }

    @Override
    public int modifyByIds2(List<Long> ids) {
        TbItem record = new TbItem();
        record.setStatus((byte) 1);
        TbItemExample example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);
        return itemDao.updateByExampleSelective(record,example);
    }

    @Override
    public int modifyByIds3(List<Long> ids) {
        TbItem record = new TbItem();
        record.setStatus((byte) 2);
        TbItemExample example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);
        return itemDao.updateByExampleSelective(record,example);
    }
}
