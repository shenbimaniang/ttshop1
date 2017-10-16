package com.xy.ttshop.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected java.util.List<com.xy.ttshop.pojo.po.TbItemExample.Criteria> oredCriteria;

    public TbItemExample() {
        oredCriteria = new java.util.ArrayList<com.xy.ttshop.pojo.po.TbItemExample.Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public java.util.List<com.xy.ttshop.pojo.po.TbItemExample.Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(com.xy.ttshop.pojo.po.TbItemExample.Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public com.xy.ttshop.pojo.po.TbItemExample.Criteria or() {
        com.xy.ttshop.pojo.po.TbItemExample.Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public com.xy.ttshop.pojo.po.TbItemExample.Criteria createCriteria() {
        com.xy.ttshop.pojo.po.TbItemExample.Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected com.xy.ttshop.pojo.po.TbItemExample.Criteria createCriteriaInternal() {
        com.xy.ttshop.pojo.po.TbItemExample.Criteria criteria = new com.xy.ttshop.pojo.po.TbItemExample.Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.xy.ttshop.pojo.po.TbItemExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.xy.ttshop.pojo.po.TbItemExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.xy.ttshop.pojo.po.TbItemExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.xy.ttshop.pojo.po.TbItemExample.Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbItemExample.Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbItemExample.Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbItemExample.Criterion(condition, value1, value2));
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andIdIsNull() {
            addCriterion("id is null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andIdIn(java.util.List<Long> values) {
            addCriterion("id in", values, "id");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andIdNotIn(java.util.List<Long> values) {
            addCriterion("id not in", values, "id");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andTitleIn(java.util.List<String> values) {
            addCriterion("title in", values, "title");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andTitleNotIn(java.util.List<String> values) {
            addCriterion("title not in", values, "title");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andSellPointIsNull() {
            addCriterion("sell_point is null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andSellPointIsNotNull() {
            addCriterion("sell_point is not null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andSellPointEqualTo(String value) {
            addCriterion("sell_point =", value, "sellPoint");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andSellPointNotEqualTo(String value) {
            addCriterion("sell_point <>", value, "sellPoint");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andSellPointGreaterThan(String value) {
            addCriterion("sell_point >", value, "sellPoint");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andSellPointGreaterThanOrEqualTo(String value) {
            addCriterion("sell_point >=", value, "sellPoint");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andSellPointLessThan(String value) {
            addCriterion("sell_point <", value, "sellPoint");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andSellPointLessThanOrEqualTo(String value) {
            addCriterion("sell_point <=", value, "sellPoint");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andSellPointLike(String value) {
            addCriterion("sell_point like", value, "sellPoint");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andSellPointNotLike(String value) {
            addCriterion("sell_point not like", value, "sellPoint");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andSellPointIn(java.util.List<String> values) {
            addCriterion("sell_point in", values, "sellPoint");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andSellPointNotIn(java.util.List<String> values) {
            addCriterion("sell_point not in", values, "sellPoint");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andSellPointBetween(String value1, String value2) {
            addCriterion("sell_point between", value1, value2, "sellPoint");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andSellPointNotBetween(String value1, String value2) {
            addCriterion("sell_point not between", value1, value2, "sellPoint");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andPriceIn(java.util.List<Long> values) {
            addCriterion("price in", values, "price");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andPriceNotIn(java.util.List<Long> values) {
            addCriterion("price not in", values, "price");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andNumIsNull() {
            addCriterion("num is null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andNumIn(java.util.List<Integer> values) {
            addCriterion("num in", values, "num");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andNumNotIn(java.util.List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andBarcodeIsNull() {
            addCriterion("barcode is null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andBarcodeIsNotNull() {
            addCriterion("barcode is not null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andBarcodeEqualTo(String value) {
            addCriterion("barcode =", value, "barcode");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("barcode <>", value, "barcode");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andBarcodeGreaterThan(String value) {
            addCriterion("barcode >", value, "barcode");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("barcode >=", value, "barcode");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andBarcodeLessThan(String value) {
            addCriterion("barcode <", value, "barcode");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("barcode <=", value, "barcode");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andBarcodeLike(String value) {
            addCriterion("barcode like", value, "barcode");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andBarcodeNotLike(String value) {
            addCriterion("barcode not like", value, "barcode");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andBarcodeIn(java.util.List<String> values) {
            addCriterion("barcode in", values, "barcode");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andBarcodeNotIn(java.util.List<String> values) {
            addCriterion("barcode not in", values, "barcode");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("barcode between", value1, value2, "barcode");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("barcode not between", value1, value2, "barcode");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andImageIsNull() {
            addCriterion("image is null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andImageIn(java.util.List<String> values) {
            addCriterion("image in", values, "image");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andImageNotIn(java.util.List<String> values) {
            addCriterion("image not in", values, "image");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCidEqualTo(Long value) {
            addCriterion("cid =", value, "cid");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCidNotEqualTo(Long value) {
            addCriterion("cid <>", value, "cid");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCidGreaterThan(Long value) {
            addCriterion("cid >", value, "cid");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCidGreaterThanOrEqualTo(Long value) {
            addCriterion("cid >=", value, "cid");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCidLessThan(Long value) {
            addCriterion("cid <", value, "cid");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCidLessThanOrEqualTo(Long value) {
            addCriterion("cid <=", value, "cid");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCidIn(java.util.List<Long> values) {
            addCriterion("cid in", values, "cid");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCidNotIn(java.util.List<Long> values) {
            addCriterion("cid not in", values, "cid");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCidBetween(Long value1, Long value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCidNotBetween(Long value1, Long value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andStatusIn(java.util.List<Byte> values) {
            addCriterion("status in", values, "status");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andStatusNotIn(java.util.List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCreatedEqualTo(java.util.Date value) {
            addCriterion("created =", value, "created");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCreatedNotEqualTo(java.util.Date value) {
            addCriterion("created <>", value, "created");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCreatedGreaterThan(java.util.Date value) {
            addCriterion("created >", value, "created");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCreatedGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("created >=", value, "created");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCreatedLessThan(java.util.Date value) {
            addCriterion("created <", value, "created");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCreatedLessThanOrEqualTo(java.util.Date value) {
            addCriterion("created <=", value, "created");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCreatedIn(java.util.List<java.util.Date> values) {
            addCriterion("created in", values, "created");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCreatedNotIn(java.util.List<java.util.Date> values) {
            addCriterion("created not in", values, "created");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCreatedBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andCreatedNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andUpdatedEqualTo(java.util.Date value) {
            addCriterion("updated =", value, "updated");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andUpdatedNotEqualTo(java.util.Date value) {
            addCriterion("updated <>", value, "updated");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andUpdatedGreaterThan(java.util.Date value) {
            addCriterion("updated >", value, "updated");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andUpdatedGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("updated >=", value, "updated");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andUpdatedLessThan(java.util.Date value) {
            addCriterion("updated <", value, "updated");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andUpdatedLessThanOrEqualTo(java.util.Date value) {
            addCriterion("updated <=", value, "updated");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andUpdatedIn(java.util.List<java.util.Date> values) {
            addCriterion("updated in", values, "updated");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andUpdatedNotIn(java.util.List<java.util.Date> values) {
            addCriterion("updated not in", values, "updated");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andUpdatedBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemExample.Criteria andUpdatedNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (com.xy.ttshop.pojo.po.TbItemExample.Criteria) this;
        }
    }

    public static class Criteria extends com.xy.ttshop.pojo.po.TbItemExample.GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof java.util.List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}