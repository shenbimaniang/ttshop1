package com.xy.ttshop.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected java.util.List<com.xy.ttshop.pojo.po.TbOrderExample.Criteria> oredCriteria;

    public TbOrderExample() {
        oredCriteria = new java.util.ArrayList<com.xy.ttshop.pojo.po.TbOrderExample.Criteria>();
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

    public java.util.List<com.xy.ttshop.pojo.po.TbOrderExample.Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(com.xy.ttshop.pojo.po.TbOrderExample.Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public com.xy.ttshop.pojo.po.TbOrderExample.Criteria or() {
        com.xy.ttshop.pojo.po.TbOrderExample.Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public com.xy.ttshop.pojo.po.TbOrderExample.Criteria createCriteria() {
        com.xy.ttshop.pojo.po.TbOrderExample.Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected com.xy.ttshop.pojo.po.TbOrderExample.Criteria createCriteriaInternal() {
        com.xy.ttshop.pojo.po.TbOrderExample.Criteria criteria = new com.xy.ttshop.pojo.po.TbOrderExample.Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.xy.ttshop.pojo.po.TbOrderExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.xy.ttshop.pojo.po.TbOrderExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.xy.ttshop.pojo.po.TbOrderExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.xy.ttshop.pojo.po.TbOrderExample.Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbOrderExample.Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbOrderExample.Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbOrderExample.Criterion(condition, value1, value2));
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andOrderIdIn(java.util.List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andOrderIdNotIn(java.util.List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentEqualTo(String value) {
            addCriterion("payment =", value, "payment");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentNotEqualTo(String value) {
            addCriterion("payment <>", value, "payment");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentGreaterThan(String value) {
            addCriterion("payment >", value, "payment");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("payment >=", value, "payment");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentLessThan(String value) {
            addCriterion("payment <", value, "payment");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentLessThanOrEqualTo(String value) {
            addCriterion("payment <=", value, "payment");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentLike(String value) {
            addCriterion("payment like", value, "payment");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentNotLike(String value) {
            addCriterion("payment not like", value, "payment");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentIn(java.util.List<String> values) {
            addCriterion("payment in", values, "payment");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentNotIn(java.util.List<String> values) {
            addCriterion("payment not in", values, "payment");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentBetween(String value1, String value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentNotBetween(String value1, String value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTypeEqualTo(Integer value) {
            addCriterion("payment_type =", value, "paymentType");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTypeNotEqualTo(Integer value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTypeGreaterThan(Integer value) {
            addCriterion("payment_type >", value, "paymentType");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTypeLessThan(Integer value) {
            addCriterion("payment_type <", value, "paymentType");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTypeIn(java.util.List<Integer> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTypeNotIn(java.util.List<Integer> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTypeBetween(Integer value1, Integer value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPostFeeIsNull() {
            addCriterion("post_fee is null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPostFeeIsNotNull() {
            addCriterion("post_fee is not null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPostFeeEqualTo(String value) {
            addCriterion("post_fee =", value, "postFee");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPostFeeNotEqualTo(String value) {
            addCriterion("post_fee <>", value, "postFee");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPostFeeGreaterThan(String value) {
            addCriterion("post_fee >", value, "postFee");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPostFeeGreaterThanOrEqualTo(String value) {
            addCriterion("post_fee >=", value, "postFee");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPostFeeLessThan(String value) {
            addCriterion("post_fee <", value, "postFee");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPostFeeLessThanOrEqualTo(String value) {
            addCriterion("post_fee <=", value, "postFee");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPostFeeLike(String value) {
            addCriterion("post_fee like", value, "postFee");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPostFeeNotLike(String value) {
            addCriterion("post_fee not like", value, "postFee");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPostFeeIn(java.util.List<String> values) {
            addCriterion("post_fee in", values, "postFee");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPostFeeNotIn(java.util.List<String> values) {
            addCriterion("post_fee not in", values, "postFee");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPostFeeBetween(String value1, String value2) {
            addCriterion("post_fee between", value1, value2, "postFee");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPostFeeNotBetween(String value1, String value2) {
            addCriterion("post_fee not between", value1, value2, "postFee");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andStatusIn(java.util.List<Integer> values) {
            addCriterion("status in", values, "status");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andStatusNotIn(java.util.List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCreateTimeEqualTo(java.util.Date value) {
            addCriterion("create_time =", value, "createTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCreateTimeNotEqualTo(java.util.Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCreateTimeGreaterThan(java.util.Date value) {
            addCriterion("create_time >", value, "createTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCreateTimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCreateTimeLessThan(java.util.Date value) {
            addCriterion("create_time <", value, "createTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCreateTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCreateTimeIn(java.util.List<java.util.Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCreateTimeNotIn(java.util.List<java.util.Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCreateTimeBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCreateTimeNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUpdateTimeEqualTo(java.util.Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUpdateTimeNotEqualTo(java.util.Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUpdateTimeGreaterThan(java.util.Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUpdateTimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUpdateTimeLessThan(java.util.Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUpdateTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUpdateTimeIn(java.util.List<java.util.Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUpdateTimeNotIn(java.util.List<java.util.Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUpdateTimeBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUpdateTimeNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTimeIsNull() {
            addCriterion("payment_time is null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTimeIsNotNull() {
            addCriterion("payment_time is not null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTimeEqualTo(java.util.Date value) {
            addCriterion("payment_time =", value, "paymentTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTimeNotEqualTo(java.util.Date value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTimeGreaterThan(java.util.Date value) {
            addCriterion("payment_time >", value, "paymentTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("payment_time >=", value, "paymentTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTimeLessThan(java.util.Date value) {
            addCriterion("payment_time <", value, "paymentTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterion("payment_time <=", value, "paymentTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTimeIn(java.util.List<java.util.Date> values) {
            addCriterion("payment_time in", values, "paymentTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTimeNotIn(java.util.List<java.util.Date> values) {
            addCriterion("payment_time not in", values, "paymentTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTimeBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("payment_time between", value1, value2, "paymentTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andPaymentTimeNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("payment_time not between", value1, value2, "paymentTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andConsignTimeIsNull() {
            addCriterion("consign_time is null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andConsignTimeIsNotNull() {
            addCriterion("consign_time is not null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andConsignTimeEqualTo(java.util.Date value) {
            addCriterion("consign_time =", value, "consignTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andConsignTimeNotEqualTo(java.util.Date value) {
            addCriterion("consign_time <>", value, "consignTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andConsignTimeGreaterThan(java.util.Date value) {
            addCriterion("consign_time >", value, "consignTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andConsignTimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("consign_time >=", value, "consignTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andConsignTimeLessThan(java.util.Date value) {
            addCriterion("consign_time <", value, "consignTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andConsignTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterion("consign_time <=", value, "consignTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andConsignTimeIn(java.util.List<java.util.Date> values) {
            addCriterion("consign_time in", values, "consignTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andConsignTimeNotIn(java.util.List<java.util.Date> values) {
            addCriterion("consign_time not in", values, "consignTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andConsignTimeBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("consign_time between", value1, value2, "consignTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andConsignTimeNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("consign_time not between", value1, value2, "consignTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andEndTimeEqualTo(java.util.Date value) {
            addCriterion("end_time =", value, "endTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andEndTimeNotEqualTo(java.util.Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andEndTimeGreaterThan(java.util.Date value) {
            addCriterion("end_time >", value, "endTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andEndTimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andEndTimeLessThan(java.util.Date value) {
            addCriterion("end_time <", value, "endTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andEndTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andEndTimeIn(java.util.List<java.util.Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andEndTimeNotIn(java.util.List<java.util.Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andEndTimeBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andEndTimeNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCloseTimeIsNull() {
            addCriterion("close_time is null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCloseTimeIsNotNull() {
            addCriterion("close_time is not null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCloseTimeEqualTo(java.util.Date value) {
            addCriterion("close_time =", value, "closeTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCloseTimeNotEqualTo(java.util.Date value) {
            addCriterion("close_time <>", value, "closeTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCloseTimeGreaterThan(java.util.Date value) {
            addCriterion("close_time >", value, "closeTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCloseTimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("close_time >=", value, "closeTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCloseTimeLessThan(java.util.Date value) {
            addCriterion("close_time <", value, "closeTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCloseTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterion("close_time <=", value, "closeTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCloseTimeIn(java.util.List<java.util.Date> values) {
            addCriterion("close_time in", values, "closeTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCloseTimeNotIn(java.util.List<java.util.Date> values) {
            addCriterion("close_time not in", values, "closeTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCloseTimeBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("close_time between", value1, value2, "closeTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andCloseTimeNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("close_time not between", value1, value2, "closeTime");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingNameIsNull() {
            addCriterion("shipping_name is null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingNameIsNotNull() {
            addCriterion("shipping_name is not null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingNameEqualTo(String value) {
            addCriterion("shipping_name =", value, "shippingName");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingNameNotEqualTo(String value) {
            addCriterion("shipping_name <>", value, "shippingName");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingNameGreaterThan(String value) {
            addCriterion("shipping_name >", value, "shippingName");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingNameGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_name >=", value, "shippingName");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingNameLessThan(String value) {
            addCriterion("shipping_name <", value, "shippingName");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingNameLessThanOrEqualTo(String value) {
            addCriterion("shipping_name <=", value, "shippingName");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingNameLike(String value) {
            addCriterion("shipping_name like", value, "shippingName");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingNameNotLike(String value) {
            addCriterion("shipping_name not like", value, "shippingName");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingNameIn(java.util.List<String> values) {
            addCriterion("shipping_name in", values, "shippingName");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingNameNotIn(java.util.List<String> values) {
            addCriterion("shipping_name not in", values, "shippingName");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingNameBetween(String value1, String value2) {
            addCriterion("shipping_name between", value1, value2, "shippingName");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingNameNotBetween(String value1, String value2) {
            addCriterion("shipping_name not between", value1, value2, "shippingName");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingCodeIsNull() {
            addCriterion("shipping_code is null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingCodeIsNotNull() {
            addCriterion("shipping_code is not null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingCodeEqualTo(String value) {
            addCriterion("shipping_code =", value, "shippingCode");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingCodeNotEqualTo(String value) {
            addCriterion("shipping_code <>", value, "shippingCode");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingCodeGreaterThan(String value) {
            addCriterion("shipping_code >", value, "shippingCode");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_code >=", value, "shippingCode");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingCodeLessThan(String value) {
            addCriterion("shipping_code <", value, "shippingCode");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingCodeLessThanOrEqualTo(String value) {
            addCriterion("shipping_code <=", value, "shippingCode");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingCodeLike(String value) {
            addCriterion("shipping_code like", value, "shippingCode");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingCodeNotLike(String value) {
            addCriterion("shipping_code not like", value, "shippingCode");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingCodeIn(java.util.List<String> values) {
            addCriterion("shipping_code in", values, "shippingCode");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingCodeNotIn(java.util.List<String> values) {
            addCriterion("shipping_code not in", values, "shippingCode");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingCodeBetween(String value1, String value2) {
            addCriterion("shipping_code between", value1, value2, "shippingCode");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andShippingCodeNotBetween(String value1, String value2) {
            addCriterion("shipping_code not between", value1, value2, "shippingCode");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUserIdIn(java.util.List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUserIdNotIn(java.util.List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerMessageIsNull() {
            addCriterion("buyer_message is null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerMessageIsNotNull() {
            addCriterion("buyer_message is not null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerMessageEqualTo(String value) {
            addCriterion("buyer_message =", value, "buyerMessage");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerMessageNotEqualTo(String value) {
            addCriterion("buyer_message <>", value, "buyerMessage");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerMessageGreaterThan(String value) {
            addCriterion("buyer_message >", value, "buyerMessage");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerMessageGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_message >=", value, "buyerMessage");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerMessageLessThan(String value) {
            addCriterion("buyer_message <", value, "buyerMessage");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerMessageLessThanOrEqualTo(String value) {
            addCriterion("buyer_message <=", value, "buyerMessage");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerMessageLike(String value) {
            addCriterion("buyer_message like", value, "buyerMessage");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerMessageNotLike(String value) {
            addCriterion("buyer_message not like", value, "buyerMessage");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerMessageIn(java.util.List<String> values) {
            addCriterion("buyer_message in", values, "buyerMessage");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerMessageNotIn(java.util.List<String> values) {
            addCriterion("buyer_message not in", values, "buyerMessage");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerMessageBetween(String value1, String value2) {
            addCriterion("buyer_message between", value1, value2, "buyerMessage");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerMessageNotBetween(String value1, String value2) {
            addCriterion("buyer_message not between", value1, value2, "buyerMessage");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerNickIsNull() {
            addCriterion("buyer_nick is null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerNickIsNotNull() {
            addCriterion("buyer_nick is not null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerNickEqualTo(String value) {
            addCriterion("buyer_nick =", value, "buyerNick");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerNickNotEqualTo(String value) {
            addCriterion("buyer_nick <>", value, "buyerNick");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerNickGreaterThan(String value) {
            addCriterion("buyer_nick >", value, "buyerNick");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerNickGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_nick >=", value, "buyerNick");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerNickLessThan(String value) {
            addCriterion("buyer_nick <", value, "buyerNick");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerNickLessThanOrEqualTo(String value) {
            addCriterion("buyer_nick <=", value, "buyerNick");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerNickLike(String value) {
            addCriterion("buyer_nick like", value, "buyerNick");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerNickNotLike(String value) {
            addCriterion("buyer_nick not like", value, "buyerNick");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerNickIn(java.util.List<String> values) {
            addCriterion("buyer_nick in", values, "buyerNick");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerNickNotIn(java.util.List<String> values) {
            addCriterion("buyer_nick not in", values, "buyerNick");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerNickBetween(String value1, String value2) {
            addCriterion("buyer_nick between", value1, value2, "buyerNick");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerNickNotBetween(String value1, String value2) {
            addCriterion("buyer_nick not between", value1, value2, "buyerNick");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerRateIsNull() {
            addCriterion("buyer_rate is null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerRateIsNotNull() {
            addCriterion("buyer_rate is not null");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerRateEqualTo(Integer value) {
            addCriterion("buyer_rate =", value, "buyerRate");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerRateNotEqualTo(Integer value) {
            addCriterion("buyer_rate <>", value, "buyerRate");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerRateGreaterThan(Integer value) {
            addCriterion("buyer_rate >", value, "buyerRate");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyer_rate >=", value, "buyerRate");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerRateLessThan(Integer value) {
            addCriterion("buyer_rate <", value, "buyerRate");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerRateLessThanOrEqualTo(Integer value) {
            addCriterion("buyer_rate <=", value, "buyerRate");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerRateIn(java.util.List<Integer> values) {
            addCriterion("buyer_rate in", values, "buyerRate");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerRateNotIn(java.util.List<Integer> values) {
            addCriterion("buyer_rate not in", values, "buyerRate");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerRateBetween(Integer value1, Integer value2) {
            addCriterion("buyer_rate between", value1, value2, "buyerRate");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderExample.Criteria andBuyerRateNotBetween(Integer value1, Integer value2) {
            addCriterion("buyer_rate not between", value1, value2, "buyerRate");
            return (com.xy.ttshop.pojo.po.TbOrderExample.Criteria) this;
        }
    }

    public static class Criteria extends com.xy.ttshop.pojo.po.TbOrderExample.GeneratedCriteria {

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