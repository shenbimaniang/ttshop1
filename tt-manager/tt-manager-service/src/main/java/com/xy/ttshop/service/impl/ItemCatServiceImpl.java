package com.xy.ttshop.service.impl;

import com.xy.common.dto.TreeNode;
import com.xy.ttshop.dao.TbItemCatMapper;
import com.xy.ttshop.pojo.po.TbItemCat;
import com.xy.ttshop.pojo.po.TbItemCatExample;
import com.xy.ttshop.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * User: 。。。
 * Date: 2017/10/24
 * Time: 11:16
 * Version:V1.0
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {
    @Autowired
    private TbItemCatMapper itemCatDao;

    @Override
    public List<TreeNode> listItemCats(Long parentId) {
        //创建查询模板
        TbItemCatExample example = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);

        //执行查询
        List<TbItemCat> itemCatList = itemCatDao.selectByExample(example);
        List<TreeNode> treeNodeList = new ArrayList<TreeNode>();

        //遍历原有集合
        for (int i = 0; i <itemCatList.size() ; i++) {
            TreeNode treeNode = new TreeNode();
            treeNode.setId(itemCatList.get(i).getId());
            treeNode.setText(itemCatList.get(i).getName());
            treeNode.setState(itemCatList.get(i).getIsParent()?"closed":"open");
            treeNodeList.add(treeNode);
        }
        return treeNodeList;
    }
}
