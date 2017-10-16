package com.xy.ttshop.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbItemParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected java.util.List<com.xy.ttshop.pojo.po.TbItemParamExample.Criteria> oredCriteria;

    public TbItemParamExample() {
        oredCriteria = new java.util.ArrayList<com.xy.ttshop.pojo.po.TbItemParamExample.Criteria>();
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

    public java.util.List<com.xy.ttshop.pojo.po.TbItemParamExample.Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(com.xy.ttshop.pojo.po.TbItemParamExample.Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria or() {
        com.xy.ttshop.pojo.po.TbItemParamExample.Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria createCriteria() {
        com.xy.ttshop.pojo.po.TbItemParamExample.Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected com.xy.ttshop.pojo.po.TbItemParamExample.Criteria createCriteriaInternal() {
        com.xy.ttshop.pojo.po.TbItemParamExample.Criteria criteria = new com.xy.ttshop.pojo.po.TbItemParamExample.Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.xy.ttshop.pojo.po.TbItemParamExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.xy.ttshop.pojo.po.TbItemParamExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.xy.ttshop.pojo.po.TbItemParamExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.xy.ttshop.pojo.po.TbItemParamExample.Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbItemParamExample.Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbItemParamExample.Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbItemParamExample.Criterion(condition, value1, value2));
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andIdIsNull() {
            addCriterion("id is null");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andIdIn(java.util.List<Long> values) {
            addCriterion("id in", values, "id");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andIdNotIn(java.util.List<Long> values) {
            addCriterion("id not in", values, "id");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andItemCatIdIsNull() {
            addCriterion("item_cat_id is null");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andItemCatIdIsNotNull() {
            addCriterion("item_cat_id is not null");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andItemCatIdEqualTo(Long value) {
            addCriterion("item_cat_id =", value, "itemCatId");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andItemCatIdNotEqualTo(Long value) {
            addCriterion("item_cat_id <>", value, "itemCatId");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andItemCatIdGreaterThan(Long value) {
            addCriterion("item_cat_id >", value, "itemCatId");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andItemCatIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_cat_id >=", value, "itemCatId");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andItemCatIdLessThan(Long value) {
            addCriterion("item_cat_id <", value, "itemCatId");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andItemCatIdLessThanOrEqualTo(Long value) {
            addCriterion("item_cat_id <=", value, "itemCatId");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andItemCatIdIn(java.util.List<Long> values) {
            addCriterion("item_cat_id in", values, "itemCatId");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andItemCatIdNotIn(java.util.List<Long> values) {
            addCriterion("item_cat_id not in", values, "itemCatId");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andItemCatIdBetween(Long value1, Long value2) {
            addCriterion("item_cat_id between", value1, value2, "itemCatId");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andItemCatIdNotBetween(Long value1, Long value2) {
            addCriterion("item_cat_id not between", value1, value2, "itemCatId");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andCreatedEqualTo(java.util.Date value) {
            addCriterion("created =", value, "created");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andCreatedNotEqualTo(java.util.Date value) {
            addCriterion("created <>", value, "created");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andCreatedGreaterThan(java.util.Date value) {
            addCriterion("created >", value, "created");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andCreatedGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("created >=", value, "created");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andCreatedLessThan(java.util.Date value) {
            addCriterion("created <", value, "created");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andCreatedLessThanOrEqualTo(java.util.Date value) {
            addCriterion("created <=", value, "created");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andCreatedIn(java.util.List<java.util.Date> values) {
            addCriterion("created in", values, "created");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andCreatedNotIn(java.util.List<java.util.Date> values) {
            addCriterion("created not in", values, "created");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andCreatedBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andCreatedNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andUpdatedEqualTo(java.util.Date value) {
            addCriterion("updated =", value, "updated");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andUpdatedNotEqualTo(java.util.Date value) {
            addCriterion("updated <>", value, "updated");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andUpdatedGreaterThan(java.util.Date value) {
            addCriterion("updated >", value, "updated");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andUpdatedGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("updated >=", value, "updated");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andUpdatedLessThan(java.util.Date value) {
            addCriterion("updated <", value, "updated");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andUpdatedLessThanOrEqualTo(java.util.Date value) {
            addCriterion("updated <=", value, "updated");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andUpdatedIn(java.util.List<java.util.Date> values) {
            addCriterion("updated in", values, "updated");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andUpdatedNotIn(java.util.List<java.util.Date> values) {
            addCriterion("updated not in", values, "updated");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andUpdatedBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamExample.Criteria andUpdatedNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (com.xy.ttshop.pojo.po.TbItemParamExample.Criteria) this;
        }
    }

    public static class Criteria extends com.xy.ttshop.pojo.po.TbItemParamExample.GeneratedCriteria {

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