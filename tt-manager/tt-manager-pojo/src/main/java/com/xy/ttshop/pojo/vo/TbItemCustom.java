package com.xy.ttshop.pojo.vo;

import com.xy.ttshop.pojo.po.TbItem;

/**
 * User: 。。。
 * Date: 2017/10/19
 * Time: 10:36
 * Version:V1.0
 */
public class TbItemCustom extends TbItem {
    private String catName;
    private String priceView;

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getPriceView() {
        return priceView;
    }

    public void setPriceView(String priceView) {
        this.priceView = priceView;
    }
}
