package com.xy.ttshop.web;

import com.xy.common.dto.Order;
import com.xy.common.dto.Page;
import com.xy.common.dto.Result;
import com.xy.ttshop.pojo.po.TbItem;
import com.xy.ttshop.pojo.vo.TbItemCustom;
import com.xy.ttshop.pojo.vo.TbItemQuery;
import com.xy.ttshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Scope("prototype")
public class ItemAction {
    @Autowired
    private ItemService itemService;

    @ResponseBody
    @RequestMapping(value = "/item/{itemId}",method = RequestMethod.GET)
    public TbItem getById(@PathVariable Long itemId){
        return itemService.getById(itemId);
    }

    /*@ResponseBody
    @RequestMapping("/items")
    public List<TbItem> listTbItems(){
        return itemService.listItems();
    }

    @RequestMapping(value = "/items",method = RequestMethod.POST)
    @ResponseBody
    public Result<TbItem> listItemsByPage(Page page){
        return itemService.listItemsByPage(page);
    }*/


    @ResponseBody
    @RequestMapping("/items")
    public Result<TbItemCustom> listItemsByPage1(Page page, Order order, TbItemQuery query){
        return itemService.listItemsByPage1(page,order,query);
    }

    @ResponseBody
    @RequestMapping("/item/batch")
    public int modifyByIds(@RequestParam("ids[]") List<Long> ids){
        return itemService.modifyByIds(ids);
    }

    @ResponseBody
    @RequestMapping("/item/up")
    public int modifyByIds2(@RequestParam("ids[]") List<Long> ids){
        return itemService.modifyByIds2(ids);
    }

    @ResponseBody
    @RequestMapping("/item/down")
    public int modifyByIds3(@RequestParam("ids[]") List<Long> ids){
        return itemService.modifyByIds3(ids);
    }

    @ResponseBody
    @RequestMapping("/item")
    public int saveItem(TbItem tbItem,String content){
        return itemService.saveItem(tbItem,content);
    }
}
