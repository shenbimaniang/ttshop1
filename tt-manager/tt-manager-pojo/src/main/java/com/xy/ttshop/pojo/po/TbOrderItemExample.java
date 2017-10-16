package com.xy.ttshop.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class TbOrderItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected java.util.List<com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria> oredCriteria;

    public TbOrderItemExample() {
        oredCriteria = new java.util.ArrayList<com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria>();
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

    public java.util.List<com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria or() {
        com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria createCriteria() {
        com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria createCriteriaInternal() {
        com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria criteria = new com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.xy.ttshop.pojo.po.TbOrderItemExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.xy.ttshop.pojo.po.TbOrderItemExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.xy.ttshop.pojo.po.TbOrderItemExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.xy.ttshop.pojo.po.TbOrderItemExample.Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbOrderItemExample.Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbOrderItemExample.Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbOrderItemExample.Criterion(condition, value1, value2));
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andIdIsNull() {
            addCriterion("id is null");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andIdIn(java.util.List<String> values) {
            addCriterion("id in", values, "id");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andIdNotIn(java.util.List<String> values) {
            addCriterion("id not in", values, "id");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andItemIdEqualTo(String value) {
            addCriterion("item_id =", value, "itemId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andItemIdNotEqualTo(String value) {
            addCriterion("item_id <>", value, "itemId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andItemIdGreaterThan(String value) {
            addCriterion("item_id >", value, "itemId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("item_id >=", value, "itemId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andItemIdLessThan(String value) {
            addCriterion("item_id <", value, "itemId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andItemIdLessThanOrEqualTo(String value) {
            addCriterion("item_id <=", value, "itemId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andItemIdLike(String value) {
            addCriterion("item_id like", value, "itemId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andItemIdNotLike(String value) {
            addCriterion("item_id not like", value, "itemId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andItemIdIn(java.util.List<String> values) {
            addCriterion("item_id in", values, "itemId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andItemIdNotIn(java.util.List<String> values) {
            addCriterion("item_id not in", values, "itemId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andItemIdBetween(String value1, String value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andItemIdNotBetween(String value1, String value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andOrderIdIn(java.util.List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andOrderIdNotIn(java.util.List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andNumIsNull() {
            addCriterion("num is null");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andNumIn(java.util.List<Integer> values) {
            addCriterion("num in", values, "num");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andNumNotIn(java.util.List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTitleIn(java.util.List<String> values) {
            addCriterion("title in", values, "title");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTitleNotIn(java.util.List<String> values) {
            addCriterion("title not in", values, "title");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPriceIn(java.util.List<Long> values) {
            addCriterion("price in", values, "price");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPriceNotIn(java.util.List<Long> values) {
            addCriterion("price not in", values, "price");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTotalFeeIsNull() {
            addCriterion("total_fee is null");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTotalFeeIsNotNull() {
            addCriterion("total_fee is not null");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTotalFeeEqualTo(Long value) {
            addCriterion("total_fee =", value, "totalFee");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTotalFeeNotEqualTo(Long value) {
            addCriterion("total_fee <>", value, "totalFee");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTotalFeeGreaterThan(Long value) {
            addCriterion("total_fee >", value, "totalFee");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTotalFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("total_fee >=", value, "totalFee");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTotalFeeLessThan(Long value) {
            addCriterion("total_fee <", value, "totalFee");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTotalFeeLessThanOrEqualTo(Long value) {
            addCriterion("total_fee <=", value, "totalFee");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTotalFeeIn(java.util.List<Long> values) {
            addCriterion("total_fee in", values, "totalFee");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTotalFeeNotIn(java.util.List<Long> values) {
            addCriterion("total_fee not in", values, "totalFee");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTotalFeeBetween(Long value1, Long value2) {
            addCriterion("total_fee between", value1, value2, "totalFee");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andTotalFeeNotBetween(Long value1, Long value2) {
            addCriterion("total_fee not between", value1, value2, "totalFee");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPicPathIsNull() {
            addCriterion("pic_path is null");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPicPathIsNotNull() {
            addCriterion("pic_path is not null");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPicPathEqualTo(String value) {
            addCriterion("pic_path =", value, "picPath");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPicPathNotEqualTo(String value) {
            addCriterion("pic_path <>", value, "picPath");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPicPathGreaterThan(String value) {
            addCriterion("pic_path >", value, "picPath");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPicPathGreaterThanOrEqualTo(String value) {
            addCriterion("pic_path >=", value, "picPath");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPicPathLessThan(String value) {
            addCriterion("pic_path <", value, "picPath");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPicPathLessThanOrEqualTo(String value) {
            addCriterion("pic_path <=", value, "picPath");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPicPathLike(String value) {
            addCriterion("pic_path like", value, "picPath");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPicPathNotLike(String value) {
            addCriterion("pic_path not like", value, "picPath");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPicPathIn(java.util.List<String> values) {
            addCriterion("pic_path in", values, "picPath");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPicPathNotIn(java.util.List<String> values) {
            addCriterion("pic_path not in", values, "picPath");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPicPathBetween(String value1, String value2) {
            addCriterion("pic_path between", value1, value2, "picPath");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria andPicPathNotBetween(String value1, String value2) {
            addCriterion("pic_path not between", value1, value2, "picPath");
            return (com.xy.ttshop.pojo.po.TbOrderItemExample.Criteria) this;
        }
    }

    public static class Criteria extends com.xy.ttshop.pojo.po.TbOrderItemExample.GeneratedCriteria {

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