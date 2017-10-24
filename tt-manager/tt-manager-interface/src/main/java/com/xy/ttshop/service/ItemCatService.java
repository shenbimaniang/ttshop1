package com.xy.ttshop.service;

import com.xy.common.dto.TreeNode;

import java.util.List;

/**
 * User: 。。。
 * Date: 2017/10/24
 * Time: 11:12
 * Version:V1.0
 */
public interface ItemCatService {
    List<TreeNode> listItemCats(Long parentId);
}
