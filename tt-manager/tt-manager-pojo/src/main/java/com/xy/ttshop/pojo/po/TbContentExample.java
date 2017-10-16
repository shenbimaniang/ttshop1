package com.xy.ttshop.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected java.util.List<com.xy.ttshop.pojo.po.TbContentExample.Criteria> oredCriteria;

    public TbContentExample() {
        oredCriteria = new java.util.ArrayList<com.xy.ttshop.pojo.po.TbContentExample.Criteria>();
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

    public java.util.List<com.xy.ttshop.pojo.po.TbContentExample.Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(com.xy.ttshop.pojo.po.TbContentExample.Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public com.xy.ttshop.pojo.po.TbContentExample.Criteria or() {
        com.xy.ttshop.pojo.po.TbContentExample.Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public com.xy.ttshop.pojo.po.TbContentExample.Criteria createCriteria() {
        com.xy.ttshop.pojo.po.TbContentExample.Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected com.xy.ttshop.pojo.po.TbContentExample.Criteria createCriteriaInternal() {
        com.xy.ttshop.pojo.po.TbContentExample.Criteria criteria = new com.xy.ttshop.pojo.po.TbContentExample.Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.xy.ttshop.pojo.po.TbContentExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.xy.ttshop.pojo.po.TbContentExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.xy.ttshop.pojo.po.TbContentExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.xy.ttshop.pojo.po.TbContentExample.Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbContentExample.Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbContentExample.Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbContentExample.Criterion(condition, value1, value2));
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andIdIsNull() {
            addCriterion("id is null");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andIdIn(java.util.List<Long> values) {
            addCriterion("id in", values, "id");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andIdNotIn(java.util.List<Long> values) {
            addCriterion("id not in", values, "id");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCategoryIdEqualTo(Long value) {
            addCriterion("category_id =", value, "categoryId");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCategoryIdNotEqualTo(Long value) {
            addCriterion("category_id <>", value, "categoryId");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCategoryIdGreaterThan(Long value) {
            addCriterion("category_id >", value, "categoryId");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("category_id >=", value, "categoryId");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCategoryIdLessThan(Long value) {
            addCriterion("category_id <", value, "categoryId");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("category_id <=", value, "categoryId");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCategoryIdIn(java.util.List<Long> values) {
            addCriterion("category_id in", values, "categoryId");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCategoryIdNotIn(java.util.List<Long> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCategoryIdBetween(Long value1, Long value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleIn(java.util.List<String> values) {
            addCriterion("title in", values, "title");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleNotIn(java.util.List<String> values) {
            addCriterion("title not in", values, "title");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andSubTitleIsNull() {
            addCriterion("sub_title is null");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andSubTitleIsNotNull() {
            addCriterion("sub_title is not null");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andSubTitleEqualTo(String value) {
            addCriterion("sub_title =", value, "subTitle");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andSubTitleNotEqualTo(String value) {
            addCriterion("sub_title <>", value, "subTitle");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andSubTitleGreaterThan(String value) {
            addCriterion("sub_title >", value, "subTitle");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andSubTitleGreaterThanOrEqualTo(String value) {
            addCriterion("sub_title >=", value, "subTitle");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andSubTitleLessThan(String value) {
            addCriterion("sub_title <", value, "subTitle");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andSubTitleLessThanOrEqualTo(String value) {
            addCriterion("sub_title <=", value, "subTitle");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andSubTitleLike(String value) {
            addCriterion("sub_title like", value, "subTitle");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andSubTitleNotLike(String value) {
            addCriterion("sub_title not like", value, "subTitle");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andSubTitleIn(java.util.List<String> values) {
            addCriterion("sub_title in", values, "subTitle");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andSubTitleNotIn(java.util.List<String> values) {
            addCriterion("sub_title not in", values, "subTitle");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andSubTitleBetween(String value1, String value2) {
            addCriterion("sub_title between", value1, value2, "subTitle");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andSubTitleNotBetween(String value1, String value2) {
            addCriterion("sub_title not between", value1, value2, "subTitle");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleDescIsNull() {
            addCriterion("title_desc is null");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleDescIsNotNull() {
            addCriterion("title_desc is not null");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleDescEqualTo(String value) {
            addCriterion("title_desc =", value, "titleDesc");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleDescNotEqualTo(String value) {
            addCriterion("title_desc <>", value, "titleDesc");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleDescGreaterThan(String value) {
            addCriterion("title_desc >", value, "titleDesc");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleDescGreaterThanOrEqualTo(String value) {
            addCriterion("title_desc >=", value, "titleDesc");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleDescLessThan(String value) {
            addCriterion("title_desc <", value, "titleDesc");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleDescLessThanOrEqualTo(String value) {
            addCriterion("title_desc <=", value, "titleDesc");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleDescLike(String value) {
            addCriterion("title_desc like", value, "titleDesc");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleDescNotLike(String value) {
            addCriterion("title_desc not like", value, "titleDesc");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleDescIn(java.util.List<String> values) {
            addCriterion("title_desc in", values, "titleDesc");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleDescNotIn(java.util.List<String> values) {
            addCriterion("title_desc not in", values, "titleDesc");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleDescBetween(String value1, String value2) {
            addCriterion("title_desc between", value1, value2, "titleDesc");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andTitleDescNotBetween(String value1, String value2) {
            addCriterion("title_desc not between", value1, value2, "titleDesc");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUrlIn(java.util.List<String> values) {
            addCriterion("url in", values, "url");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUrlNotIn(java.util.List<String> values) {
            addCriterion("url not in", values, "url");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPicIn(java.util.List<String> values) {
            addCriterion("pic in", values, "pic");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPicNotIn(java.util.List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPic2IsNull() {
            addCriterion("pic2 is null");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPic2IsNotNull() {
            addCriterion("pic2 is not null");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPic2EqualTo(String value) {
            addCriterion("pic2 =", value, "pic2");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPic2NotEqualTo(String value) {
            addCriterion("pic2 <>", value, "pic2");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPic2GreaterThan(String value) {
            addCriterion("pic2 >", value, "pic2");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPic2GreaterThanOrEqualTo(String value) {
            addCriterion("pic2 >=", value, "pic2");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPic2LessThan(String value) {
            addCriterion("pic2 <", value, "pic2");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPic2LessThanOrEqualTo(String value) {
            addCriterion("pic2 <=", value, "pic2");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPic2Like(String value) {
            addCriterion("pic2 like", value, "pic2");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPic2NotLike(String value) {
            addCriterion("pic2 not like", value, "pic2");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPic2In(java.util.List<String> values) {
            addCriterion("pic2 in", values, "pic2");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPic2NotIn(java.util.List<String> values) {
            addCriterion("pic2 not in", values, "pic2");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPic2Between(String value1, String value2) {
            addCriterion("pic2 between", value1, value2, "pic2");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andPic2NotBetween(String value1, String value2) {
            addCriterion("pic2 not between", value1, value2, "pic2");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCreatedEqualTo(java.util.Date value) {
            addCriterion("created =", value, "created");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCreatedNotEqualTo(java.util.Date value) {
            addCriterion("created <>", value, "created");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCreatedGreaterThan(java.util.Date value) {
            addCriterion("created >", value, "created");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCreatedGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("created >=", value, "created");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCreatedLessThan(java.util.Date value) {
            addCriterion("created <", value, "created");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCreatedLessThanOrEqualTo(java.util.Date value) {
            addCriterion("created <=", value, "created");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCreatedIn(java.util.List<java.util.Date> values) {
            addCriterion("created in", values, "created");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCreatedNotIn(java.util.List<java.util.Date> values) {
            addCriterion("created not in", values, "created");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCreatedBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andCreatedNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUpdatedEqualTo(java.util.Date value) {
            addCriterion("updated =", value, "updated");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUpdatedNotEqualTo(java.util.Date value) {
            addCriterion("updated <>", value, "updated");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUpdatedGreaterThan(java.util.Date value) {
            addCriterion("updated >", value, "updated");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUpdatedGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("updated >=", value, "updated");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUpdatedLessThan(java.util.Date value) {
            addCriterion("updated <", value, "updated");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUpdatedLessThanOrEqualTo(java.util.Date value) {
            addCriterion("updated <=", value, "updated");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUpdatedIn(java.util.List<java.util.Date> values) {
            addCriterion("updated in", values, "updated");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUpdatedNotIn(java.util.List<java.util.Date> values) {
            addCriterion("updated not in", values, "updated");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUpdatedBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbContentExample.Criteria andUpdatedNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (com.xy.ttshop.pojo.po.TbContentExample.Criteria) this;
        }
    }

    public static class Criteria extends com.xy.ttshop.pojo.po.TbContentExample.GeneratedCriteria {

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