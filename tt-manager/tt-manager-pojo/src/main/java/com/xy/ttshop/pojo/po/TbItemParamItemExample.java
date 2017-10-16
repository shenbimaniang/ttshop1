package com.xy.ttshop.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbItemParamItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected java.util.List<com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria> oredCriteria;

    public TbItemParamItemExample() {
        oredCriteria = new java.util.ArrayList<com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria>();
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

    public java.util.List<com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria or() {
        com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria createCriteria() {
        com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria createCriteriaInternal() {
        com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria criteria = new com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.xy.ttshop.pojo.po.TbItemParamItemExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.xy.ttshop.pojo.po.TbItemParamItemExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.xy.ttshop.pojo.po.TbItemParamItemExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.xy.ttshop.pojo.po.TbItemParamItemExample.Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbItemParamItemExample.Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbItemParamItemExample.Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbItemParamItemExample.Criterion(condition, value1, value2));
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andIdIsNull() {
            addCriterion("id is null");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andIdIn(java.util.List<Long> values) {
            addCriterion("id in", values, "id");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andIdNotIn(java.util.List<Long> values) {
            addCriterion("id not in", values, "id");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andItemIdEqualTo(Long value) {
            addCriterion("item_id =", value, "itemId");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andItemIdNotEqualTo(Long value) {
            addCriterion("item_id <>", value, "itemId");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andItemIdGreaterThan(Long value) {
            addCriterion("item_id >", value, "itemId");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_id >=", value, "itemId");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andItemIdLessThan(Long value) {
            addCriterion("item_id <", value, "itemId");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andItemIdLessThanOrEqualTo(Long value) {
            addCriterion("item_id <=", value, "itemId");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andItemIdIn(java.util.List<Long> values) {
            addCriterion("item_id in", values, "itemId");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andItemIdNotIn(java.util.List<Long> values) {
            addCriterion("item_id not in", values, "itemId");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andItemIdBetween(Long value1, Long value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andItemIdNotBetween(Long value1, Long value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andCreatedEqualTo(java.util.Date value) {
            addCriterion("created =", value, "created");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andCreatedNotEqualTo(java.util.Date value) {
            addCriterion("created <>", value, "created");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andCreatedGreaterThan(java.util.Date value) {
            addCriterion("created >", value, "created");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andCreatedGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("created >=", value, "created");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andCreatedLessThan(java.util.Date value) {
            addCriterion("created <", value, "created");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andCreatedLessThanOrEqualTo(java.util.Date value) {
            addCriterion("created <=", value, "created");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andCreatedIn(java.util.List<java.util.Date> values) {
            addCriterion("created in", values, "created");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andCreatedNotIn(java.util.List<java.util.Date> values) {
            addCriterion("created not in", values, "created");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andCreatedBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andCreatedNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andUpdatedEqualTo(java.util.Date value) {
            addCriterion("updated =", value, "updated");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andUpdatedNotEqualTo(java.util.Date value) {
            addCriterion("updated <>", value, "updated");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andUpdatedGreaterThan(java.util.Date value) {
            addCriterion("updated >", value, "updated");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andUpdatedGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("updated >=", value, "updated");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andUpdatedLessThan(java.util.Date value) {
            addCriterion("updated <", value, "updated");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andUpdatedLessThanOrEqualTo(java.util.Date value) {
            addCriterion("updated <=", value, "updated");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andUpdatedIn(java.util.List<java.util.Date> values) {
            addCriterion("updated in", values, "updated");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andUpdatedNotIn(java.util.List<java.util.Date> values) {
            addCriterion("updated not in", values, "updated");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andUpdatedBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria andUpdatedNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (com.xy.ttshop.pojo.po.TbItemParamItemExample.Criteria) this;
        }
    }

    public static class Criteria extends com.xy.ttshop.pojo.po.TbItemParamItemExample.GeneratedCriteria {

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