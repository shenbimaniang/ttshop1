package com.xy.ttshop.web;

import com.xy.common.dto.TreeNode;
import com.xy.ttshop.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * User: 。。。
 * Date: 2017/10/24
 * Time: 11:07
 * Version:V1.0
 */
@Controller
@Scope("prototype")
public class ItemCatsAction {

    @Autowired
    private ItemCatService icservice;

    @ResponseBody
    @RequestMapping("itemCats")
    public List<TreeNode> listItemCats(@RequestParam("parentId") Long parentId){
        return icservice.listItemCats(parentId);
    }
}
