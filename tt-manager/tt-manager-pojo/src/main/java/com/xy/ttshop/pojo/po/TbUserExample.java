package com.xy.ttshop.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected java.util.List<com.xy.ttshop.pojo.po.TbUserExample.Criteria> oredCriteria;

    public TbUserExample() {
        oredCriteria = new java.util.ArrayList<com.xy.ttshop.pojo.po.TbUserExample.Criteria>();
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

    public java.util.List<com.xy.ttshop.pojo.po.TbUserExample.Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(com.xy.ttshop.pojo.po.TbUserExample.Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public com.xy.ttshop.pojo.po.TbUserExample.Criteria or() {
        com.xy.ttshop.pojo.po.TbUserExample.Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public com.xy.ttshop.pojo.po.TbUserExample.Criteria createCriteria() {
        com.xy.ttshop.pojo.po.TbUserExample.Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected com.xy.ttshop.pojo.po.TbUserExample.Criteria createCriteriaInternal() {
        com.xy.ttshop.pojo.po.TbUserExample.Criteria criteria = new com.xy.ttshop.pojo.po.TbUserExample.Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected java.util.List<com.xy.ttshop.pojo.po.TbUserExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new java.util.ArrayList<com.xy.ttshop.pojo.po.TbUserExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public java.util.List<com.xy.ttshop.pojo.po.TbUserExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public java.util.List<com.xy.ttshop.pojo.po.TbUserExample.Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbUserExample.Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbUserExample.Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new com.xy.ttshop.pojo.po.TbUserExample.Criterion(condition, value1, value2));
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andIdIsNull() {
            addCriterion("id is null");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andIdIn(java.util.List<Long> values) {
            addCriterion("id in", values, "id");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andIdNotIn(java.util.List<Long> values) {
            addCriterion("id not in", values, "id");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUsernameIn(java.util.List<String> values) {
            addCriterion("username in", values, "username");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUsernameNotIn(java.util.List<String> values) {
            addCriterion("username not in", values, "username");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPasswordIn(java.util.List<String> values) {
            addCriterion("password in", values, "password");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPasswordNotIn(java.util.List<String> values) {
            addCriterion("password not in", values, "password");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPhoneIn(java.util.List<String> values) {
            addCriterion("phone in", values, "phone");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPhoneNotIn(java.util.List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andEmailIn(java.util.List<String> values) {
            addCriterion("email in", values, "email");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andEmailNotIn(java.util.List<String> values) {
            addCriterion("email not in", values, "email");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andCreatedEqualTo(java.util.Date value) {
            addCriterion("created =", value, "created");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andCreatedNotEqualTo(java.util.Date value) {
            addCriterion("created <>", value, "created");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andCreatedGreaterThan(java.util.Date value) {
            addCriterion("created >", value, "created");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andCreatedGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("created >=", value, "created");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andCreatedLessThan(java.util.Date value) {
            addCriterion("created <", value, "created");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andCreatedLessThanOrEqualTo(java.util.Date value) {
            addCriterion("created <=", value, "created");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andCreatedIn(java.util.List<java.util.Date> values) {
            addCriterion("created in", values, "created");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andCreatedNotIn(java.util.List<java.util.Date> values) {
            addCriterion("created not in", values, "created");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andCreatedBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andCreatedNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUpdatedEqualTo(java.util.Date value) {
            addCriterion("updated =", value, "updated");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUpdatedNotEqualTo(java.util.Date value) {
            addCriterion("updated <>", value, "updated");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUpdatedGreaterThan(java.util.Date value) {
            addCriterion("updated >", value, "updated");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUpdatedGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("updated >=", value, "updated");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUpdatedLessThan(java.util.Date value) {
            addCriterion("updated <", value, "updated");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUpdatedLessThanOrEqualTo(java.util.Date value) {
            addCriterion("updated <=", value, "updated");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUpdatedIn(java.util.List<java.util.Date> values) {
            addCriterion("updated in", values, "updated");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUpdatedNotIn(java.util.List<java.util.Date> values) {
            addCriterion("updated not in", values, "updated");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUpdatedBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }

        public com.xy.ttshop.pojo.po.TbUserExample.Criteria andUpdatedNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (com.xy.ttshop.pojo.po.TbUserExample.Criteria) this;
        }
    }

    public static class Criteria extends com.xy.ttshop.pojo.po.TbUserExample.GeneratedCriteria {

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