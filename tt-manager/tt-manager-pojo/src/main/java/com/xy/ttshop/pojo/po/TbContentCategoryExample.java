package com.xy.ttshop.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbContentCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected java.util.List<com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria> oredCriteria;

    public TbContentCategoryExample() {
        oredCriteria = new java.util.ArrayList<com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria>();
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

    public java.util.List<com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria or() {
        com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria createCriteria() {
        com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria createCriteriaInternal() {
        com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria criteria = new com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.xy.ttshop.pojo.po.TbContentCategoryExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.xy.ttshop.pojo.po.TbContentCategoryExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.xy.ttshop.pojo.po.TbContentCategoryExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.xy.ttshop.pojo.po.TbContentCategoryExample.Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbContentCategoryExample.Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbContentCategoryExample.Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbContentCategoryExample.Criterion(condition, value1, value2));
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIdIsNull() {
            addCriterion("id is null");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIdIn(java.util.List<Long> values) {
            addCriterion("id in", values, "id");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIdNotIn(java.util.List<Long> values) {
            addCriterion("id not in", values, "id");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andParentIdEqualTo(Long value) {
            addCriterion("parent_id =", value, "parentId");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("parent_id <>", value, "parentId");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andParentIdGreaterThan(Long value) {
            addCriterion("parent_id >", value, "parentId");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_id >=", value, "parentId");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andParentIdLessThan(Long value) {
            addCriterion("parent_id <", value, "parentId");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_id <=", value, "parentId");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andParentIdIn(java.util.List<Long> values) {
            addCriterion("parent_id in", values, "parentId");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andParentIdNotIn(java.util.List<Long> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andNameIsNull() {
            addCriterion("name is null");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andNameIn(java.util.List<String> values) {
            addCriterion("name in", values, "name");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andNameNotIn(java.util.List<String> values) {
            addCriterion("name not in", values, "name");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andStatusIn(java.util.List<Integer> values) {
            addCriterion("status in", values, "status");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andStatusNotIn(java.util.List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andSortOrderIsNull() {
            addCriterion("sort_order is null");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andSortOrderIsNotNull() {
            addCriterion("sort_order is not null");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andSortOrderEqualTo(Integer value) {
            addCriterion("sort_order =", value, "sortOrder");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andSortOrderNotEqualTo(Integer value) {
            addCriterion("sort_order <>", value, "sortOrder");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andSortOrderGreaterThan(Integer value) {
            addCriterion("sort_order >", value, "sortOrder");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andSortOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_order >=", value, "sortOrder");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andSortOrderLessThan(Integer value) {
            addCriterion("sort_order <", value, "sortOrder");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andSortOrderLessThanOrEqualTo(Integer value) {
            addCriterion("sort_order <=", value, "sortOrder");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andSortOrderIn(java.util.List<Integer> values) {
            addCriterion("sort_order in", values, "sortOrder");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andSortOrderNotIn(java.util.List<Integer> values) {
            addCriterion("sort_order not in", values, "sortOrder");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andSortOrderBetween(Integer value1, Integer value2) {
            addCriterion("sort_order between", value1, value2, "sortOrder");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andSortOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_order not between", value1, value2, "sortOrder");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIsParentIsNull() {
            addCriterion("is_parent is null");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIsParentIsNotNull() {
            addCriterion("is_parent is not null");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIsParentEqualTo(Boolean value) {
            addCriterion("is_parent =", value, "isParent");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIsParentNotEqualTo(Boolean value) {
            addCriterion("is_parent <>", value, "isParent");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIsParentGreaterThan(Boolean value) {
            addCriterion("is_parent >", value, "isParent");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIsParentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_parent >=", value, "isParent");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIsParentLessThan(Boolean value) {
            addCriterion("is_parent <", value, "isParent");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIsParentLessThanOrEqualTo(Boolean value) {
            addCriterion("is_parent <=", value, "isParent");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIsParentIn(java.util.List<Boolean> values) {
            addCriterion("is_parent in", values, "isParent");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIsParentNotIn(java.util.List<Boolean> values) {
            addCriterion("is_parent not in", values, "isParent");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIsParentBetween(Boolean value1, Boolean value2) {
            addCriterion("is_parent between", value1, value2, "isParent");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andIsParentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_parent not between", value1, value2, "isParent");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andCreatedEqualTo(java.util.Date value) {
            addCriterion("created =", value, "created");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andCreatedNotEqualTo(java.util.Date value) {
            addCriterion("created <>", value, "created");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andCreatedGreaterThan(java.util.Date value) {
            addCriterion("created >", value, "created");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andCreatedGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("created >=", value, "created");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andCreatedLessThan(java.util.Date value) {
            addCriterion("created <", value, "created");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andCreatedLessThanOrEqualTo(java.util.Date value) {
            addCriterion("created <=", value, "created");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andCreatedIn(java.util.List<java.util.Date> values) {
            addCriterion("created in", values, "created");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andCreatedNotIn(java.util.List<java.util.Date> values) {
            addCriterion("created not in", values, "created");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andCreatedBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andCreatedNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andUpdatedEqualTo(java.util.Date value) {
            addCriterion("updated =", value, "updated");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andUpdatedNotEqualTo(java.util.Date value) {
            addCriterion("updated <>", value, "updated");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andUpdatedGreaterThan(java.util.Date value) {
            addCriterion("updated >", value, "updated");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andUpdatedGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("updated >=", value, "updated");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andUpdatedLessThan(java.util.Date value) {
            addCriterion("updated <", value, "updated");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andUpdatedLessThanOrEqualTo(java.util.Date value) {
            addCriterion("updated <=", value, "updated");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andUpdatedIn(java.util.List<java.util.Date> values) {
            addCriterion("updated in", values, "updated");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andUpdatedNotIn(java.util.List<java.util.Date> values) {
            addCriterion("updated not in", values, "updated");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andUpdatedBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria andUpdatedNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (com.xy.ttshop.pojo.po.TbContentCategoryExample.Criteria) this;
        }
    }

    public static class Criteria extends com.xy.ttshop.pojo.po.TbContentCategoryExample.GeneratedCriteria {

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