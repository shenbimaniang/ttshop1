package com.xy.ttshop.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrderShippingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected java.util.List<com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria> oredCriteria;

    public TbOrderShippingExample() {
        oredCriteria = new java.util.ArrayList<com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria>();
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

    public java.util.List<com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria or() {
        com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria createCriteria() {
        com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria createCriteriaInternal() {
        com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria criteria = new com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.xy.ttshop.pojo.po.TbOrderShippingExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.xy.ttshop.pojo.po.TbOrderShippingExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.xy.ttshop.pojo.po.TbOrderShippingExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.xy.ttshop.pojo.po.TbOrderShippingExample.Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbOrderShippingExample.Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbOrderShippingExample.Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbOrderShippingExample.Criterion(condition, value1, value2));
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andOrderIdIn(java.util.List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andOrderIdNotIn(java.util.List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverNameIsNull() {
            addCriterion("receiver_name is null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverNameIsNotNull() {
            addCriterion("receiver_name is not null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverNameEqualTo(String value) {
            addCriterion("receiver_name =", value, "receiverName");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverNameNotEqualTo(String value) {
            addCriterion("receiver_name <>", value, "receiverName");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverNameGreaterThan(String value) {
            addCriterion("receiver_name >", value, "receiverName");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_name >=", value, "receiverName");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverNameLessThan(String value) {
            addCriterion("receiver_name <", value, "receiverName");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverNameLessThanOrEqualTo(String value) {
            addCriterion("receiver_name <=", value, "receiverName");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverNameLike(String value) {
            addCriterion("receiver_name like", value, "receiverName");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverNameNotLike(String value) {
            addCriterion("receiver_name not like", value, "receiverName");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverNameIn(java.util.List<String> values) {
            addCriterion("receiver_name in", values, "receiverName");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverNameNotIn(java.util.List<String> values) {
            addCriterion("receiver_name not in", values, "receiverName");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverNameBetween(String value1, String value2) {
            addCriterion("receiver_name between", value1, value2, "receiverName");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverNameNotBetween(String value1, String value2) {
            addCriterion("receiver_name not between", value1, value2, "receiverName");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverPhoneIsNull() {
            addCriterion("receiver_phone is null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverPhoneIsNotNull() {
            addCriterion("receiver_phone is not null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverPhoneEqualTo(String value) {
            addCriterion("receiver_phone =", value, "receiverPhone");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverPhoneNotEqualTo(String value) {
            addCriterion("receiver_phone <>", value, "receiverPhone");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverPhoneGreaterThan(String value) {
            addCriterion("receiver_phone >", value, "receiverPhone");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_phone >=", value, "receiverPhone");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverPhoneLessThan(String value) {
            addCriterion("receiver_phone <", value, "receiverPhone");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverPhoneLessThanOrEqualTo(String value) {
            addCriterion("receiver_phone <=", value, "receiverPhone");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverPhoneLike(String value) {
            addCriterion("receiver_phone like", value, "receiverPhone");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverPhoneNotLike(String value) {
            addCriterion("receiver_phone not like", value, "receiverPhone");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverPhoneIn(java.util.List<String> values) {
            addCriterion("receiver_phone in", values, "receiverPhone");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverPhoneNotIn(java.util.List<String> values) {
            addCriterion("receiver_phone not in", values, "receiverPhone");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverPhoneBetween(String value1, String value2) {
            addCriterion("receiver_phone between", value1, value2, "receiverPhone");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverPhoneNotBetween(String value1, String value2) {
            addCriterion("receiver_phone not between", value1, value2, "receiverPhone");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverMobileIsNull() {
            addCriterion("receiver_mobile is null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverMobileIsNotNull() {
            addCriterion("receiver_mobile is not null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverMobileEqualTo(String value) {
            addCriterion("receiver_mobile =", value, "receiverMobile");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverMobileNotEqualTo(String value) {
            addCriterion("receiver_mobile <>", value, "receiverMobile");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverMobileGreaterThan(String value) {
            addCriterion("receiver_mobile >", value, "receiverMobile");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverMobileGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_mobile >=", value, "receiverMobile");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverMobileLessThan(String value) {
            addCriterion("receiver_mobile <", value, "receiverMobile");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverMobileLessThanOrEqualTo(String value) {
            addCriterion("receiver_mobile <=", value, "receiverMobile");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverMobileLike(String value) {
            addCriterion("receiver_mobile like", value, "receiverMobile");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverMobileNotLike(String value) {
            addCriterion("receiver_mobile not like", value, "receiverMobile");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverMobileIn(java.util.List<String> values) {
            addCriterion("receiver_mobile in", values, "receiverMobile");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverMobileNotIn(java.util.List<String> values) {
            addCriterion("receiver_mobile not in", values, "receiverMobile");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverMobileBetween(String value1, String value2) {
            addCriterion("receiver_mobile between", value1, value2, "receiverMobile");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverMobileNotBetween(String value1, String value2) {
            addCriterion("receiver_mobile not between", value1, value2, "receiverMobile");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverStateIsNull() {
            addCriterion("receiver_state is null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverStateIsNotNull() {
            addCriterion("receiver_state is not null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverStateEqualTo(String value) {
            addCriterion("receiver_state =", value, "receiverState");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverStateNotEqualTo(String value) {
            addCriterion("receiver_state <>", value, "receiverState");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverStateGreaterThan(String value) {
            addCriterion("receiver_state >", value, "receiverState");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverStateGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_state >=", value, "receiverState");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverStateLessThan(String value) {
            addCriterion("receiver_state <", value, "receiverState");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverStateLessThanOrEqualTo(String value) {
            addCriterion("receiver_state <=", value, "receiverState");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverStateLike(String value) {
            addCriterion("receiver_state like", value, "receiverState");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverStateNotLike(String value) {
            addCriterion("receiver_state not like", value, "receiverState");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverStateIn(java.util.List<String> values) {
            addCriterion("receiver_state in", values, "receiverState");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverStateNotIn(java.util.List<String> values) {
            addCriterion("receiver_state not in", values, "receiverState");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverStateBetween(String value1, String value2) {
            addCriterion("receiver_state between", value1, value2, "receiverState");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverStateNotBetween(String value1, String value2) {
            addCriterion("receiver_state not between", value1, value2, "receiverState");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverCityIsNull() {
            addCriterion("receiver_city is null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverCityIsNotNull() {
            addCriterion("receiver_city is not null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverCityEqualTo(String value) {
            addCriterion("receiver_city =", value, "receiverCity");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverCityNotEqualTo(String value) {
            addCriterion("receiver_city <>", value, "receiverCity");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverCityGreaterThan(String value) {
            addCriterion("receiver_city >", value, "receiverCity");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverCityGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_city >=", value, "receiverCity");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverCityLessThan(String value) {
            addCriterion("receiver_city <", value, "receiverCity");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverCityLessThanOrEqualTo(String value) {
            addCriterion("receiver_city <=", value, "receiverCity");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverCityLike(String value) {
            addCriterion("receiver_city like", value, "receiverCity");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverCityNotLike(String value) {
            addCriterion("receiver_city not like", value, "receiverCity");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverCityIn(java.util.List<String> values) {
            addCriterion("receiver_city in", values, "receiverCity");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverCityNotIn(java.util.List<String> values) {
            addCriterion("receiver_city not in", values, "receiverCity");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverCityBetween(String value1, String value2) {
            addCriterion("receiver_city between", value1, value2, "receiverCity");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverCityNotBetween(String value1, String value2) {
            addCriterion("receiver_city not between", value1, value2, "receiverCity");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverDistrictIsNull() {
            addCriterion("receiver_district is null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverDistrictIsNotNull() {
            addCriterion("receiver_district is not null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverDistrictEqualTo(String value) {
            addCriterion("receiver_district =", value, "receiverDistrict");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverDistrictNotEqualTo(String value) {
            addCriterion("receiver_district <>", value, "receiverDistrict");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverDistrictGreaterThan(String value) {
            addCriterion("receiver_district >", value, "receiverDistrict");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_district >=", value, "receiverDistrict");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverDistrictLessThan(String value) {
            addCriterion("receiver_district <", value, "receiverDistrict");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverDistrictLessThanOrEqualTo(String value) {
            addCriterion("receiver_district <=", value, "receiverDistrict");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverDistrictLike(String value) {
            addCriterion("receiver_district like", value, "receiverDistrict");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverDistrictNotLike(String value) {
            addCriterion("receiver_district not like", value, "receiverDistrict");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverDistrictIn(java.util.List<String> values) {
            addCriterion("receiver_district in", values, "receiverDistrict");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverDistrictNotIn(java.util.List<String> values) {
            addCriterion("receiver_district not in", values, "receiverDistrict");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverDistrictBetween(String value1, String value2) {
            addCriterion("receiver_district between", value1, value2, "receiverDistrict");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverDistrictNotBetween(String value1, String value2) {
            addCriterion("receiver_district not between", value1, value2, "receiverDistrict");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverAddressIsNull() {
            addCriterion("receiver_address is null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverAddressIsNotNull() {
            addCriterion("receiver_address is not null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverAddressEqualTo(String value) {
            addCriterion("receiver_address =", value, "receiverAddress");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverAddressNotEqualTo(String value) {
            addCriterion("receiver_address <>", value, "receiverAddress");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverAddressGreaterThan(String value) {
            addCriterion("receiver_address >", value, "receiverAddress");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_address >=", value, "receiverAddress");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverAddressLessThan(String value) {
            addCriterion("receiver_address <", value, "receiverAddress");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverAddressLessThanOrEqualTo(String value) {
            addCriterion("receiver_address <=", value, "receiverAddress");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverAddressLike(String value) {
            addCriterion("receiver_address like", value, "receiverAddress");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverAddressNotLike(String value) {
            addCriterion("receiver_address not like", value, "receiverAddress");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverAddressIn(java.util.List<String> values) {
            addCriterion("receiver_address in", values, "receiverAddress");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverAddressNotIn(java.util.List<String> values) {
            addCriterion("receiver_address not in", values, "receiverAddress");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverAddressBetween(String value1, String value2) {
            addCriterion("receiver_address between", value1, value2, "receiverAddress");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverAddressNotBetween(String value1, String value2) {
            addCriterion("receiver_address not between", value1, value2, "receiverAddress");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverZipIsNull() {
            addCriterion("receiver_zip is null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverZipIsNotNull() {
            addCriterion("receiver_zip is not null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverZipEqualTo(String value) {
            addCriterion("receiver_zip =", value, "receiverZip");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverZipNotEqualTo(String value) {
            addCriterion("receiver_zip <>", value, "receiverZip");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverZipGreaterThan(String value) {
            addCriterion("receiver_zip >", value, "receiverZip");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverZipGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_zip >=", value, "receiverZip");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverZipLessThan(String value) {
            addCriterion("receiver_zip <", value, "receiverZip");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverZipLessThanOrEqualTo(String value) {
            addCriterion("receiver_zip <=", value, "receiverZip");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverZipLike(String value) {
            addCriterion("receiver_zip like", value, "receiverZip");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverZipNotLike(String value) {
            addCriterion("receiver_zip not like", value, "receiverZip");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverZipIn(java.util.List<String> values) {
            addCriterion("receiver_zip in", values, "receiverZip");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverZipNotIn(java.util.List<String> values) {
            addCriterion("receiver_zip not in", values, "receiverZip");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverZipBetween(String value1, String value2) {
            addCriterion("receiver_zip between", value1, value2, "receiverZip");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andReceiverZipNotBetween(String value1, String value2) {
            addCriterion("receiver_zip not between", value1, value2, "receiverZip");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andCreatedEqualTo(java.util.Date value) {
            addCriterion("created =", value, "created");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andCreatedNotEqualTo(java.util.Date value) {
            addCriterion("created <>", value, "created");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andCreatedGreaterThan(java.util.Date value) {
            addCriterion("created >", value, "created");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andCreatedGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("created >=", value, "created");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andCreatedLessThan(java.util.Date value) {
            addCriterion("created <", value, "created");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andCreatedLessThanOrEqualTo(java.util.Date value) {
            addCriterion("created <=", value, "created");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andCreatedIn(java.util.List<java.util.Date> values) {
            addCriterion("created in", values, "created");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andCreatedNotIn(java.util.List<java.util.Date> values) {
            addCriterion("created not in", values, "created");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andCreatedBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andCreatedNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andUpdatedEqualTo(java.util.Date value) {
            addCriterion("updated =", value, "updated");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andUpdatedNotEqualTo(java.util.Date value) {
            addCriterion("updated <>", value, "updated");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andUpdatedGreaterThan(java.util.Date value) {
            addCriterion("updated >", value, "updated");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andUpdatedGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("updated >=", value, "updated");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andUpdatedLessThan(java.util.Date value) {
            addCriterion("updated <", value, "updated");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andUpdatedLessThanOrEqualTo(java.util.Date value) {
            addCriterion("updated <=", value, "updated");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andUpdatedIn(java.util.List<java.util.Date> values) {
            addCriterion("updated in", values, "updated");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andUpdatedNotIn(java.util.List<java.util.Date> values) {
            addCriterion("updated not in", values, "updated");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andUpdatedBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria andUpdatedNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (com.xy.ttshop.pojo.po.TbOrderShippingExample.Criteria) this;
        }
    }

    public static class Criteria extends com.xy.ttshop.pojo.po.TbOrderShippingExample.GeneratedCriteria {

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