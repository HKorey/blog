package com.hquery.blog.app.model;

import java.util.ArrayList;
import java.util.List;

public class RelationshipsDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public RelationshipsDOExample() {
        oredCriteria = new ArrayList<Criteria>();
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

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNull() {
            addCriterion("content_id is null");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNotNull() {
            addCriterion("content_id is not null");
            return (Criteria) this;
        }

        public Criteria andContentIdEqualTo(Long value) {
            addCriterion("content_id =", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotEqualTo(Long value) {
            addCriterion("content_id <>", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThan(Long value) {
            addCriterion("content_id >", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("content_id >=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThan(Long value) {
            addCriterion("content_id <", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThanOrEqualTo(Long value) {
            addCriterion("content_id <=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdIn(List<Long> values) {
            addCriterion("content_id in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotIn(List<Long> values) {
            addCriterion("content_id not in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdBetween(Long value1, Long value2) {
            addCriterion("content_id between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotBetween(Long value1, Long value2) {
            addCriterion("content_id not between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andMetaIdIsNull() {
            addCriterion("meta_id is null");
            return (Criteria) this;
        }

        public Criteria andMetaIdIsNotNull() {
            addCriterion("meta_id is not null");
            return (Criteria) this;
        }

        public Criteria andMetaIdEqualTo(Long value) {
            addCriterion("meta_id =", value, "metaId");
            return (Criteria) this;
        }

        public Criteria andMetaIdNotEqualTo(Long value) {
            addCriterion("meta_id <>", value, "metaId");
            return (Criteria) this;
        }

        public Criteria andMetaIdGreaterThan(Long value) {
            addCriterion("meta_id >", value, "metaId");
            return (Criteria) this;
        }

        public Criteria andMetaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("meta_id >=", value, "metaId");
            return (Criteria) this;
        }

        public Criteria andMetaIdLessThan(Long value) {
            addCriterion("meta_id <", value, "metaId");
            return (Criteria) this;
        }

        public Criteria andMetaIdLessThanOrEqualTo(Long value) {
            addCriterion("meta_id <=", value, "metaId");
            return (Criteria) this;
        }

        public Criteria andMetaIdIn(List<Long> values) {
            addCriterion("meta_id in", values, "metaId");
            return (Criteria) this;
        }

        public Criteria andMetaIdNotIn(List<Long> values) {
            addCriterion("meta_id not in", values, "metaId");
            return (Criteria) this;
        }

        public Criteria andMetaIdBetween(Long value1, Long value2) {
            addCriterion("meta_id between", value1, value2, "metaId");
            return (Criteria) this;
        }

        public Criteria andMetaIdNotBetween(Long value1, Long value2) {
            addCriterion("meta_id not between", value1, value2, "metaId");
            return (Criteria) this;
        }

        public Criteria andMetaTypeIsNull() {
            addCriterion("meta_type is null");
            return (Criteria) this;
        }

        public Criteria andMetaTypeIsNotNull() {
            addCriterion("meta_type is not null");
            return (Criteria) this;
        }

        public Criteria andMetaTypeEqualTo(String value) {
            addCriterion("meta_type =", value, "metaType");
            return (Criteria) this;
        }

        public Criteria andMetaTypeNotEqualTo(String value) {
            addCriterion("meta_type <>", value, "metaType");
            return (Criteria) this;
        }

        public Criteria andMetaTypeGreaterThan(String value) {
            addCriterion("meta_type >", value, "metaType");
            return (Criteria) this;
        }

        public Criteria andMetaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("meta_type >=", value, "metaType");
            return (Criteria) this;
        }

        public Criteria andMetaTypeLessThan(String value) {
            addCriterion("meta_type <", value, "metaType");
            return (Criteria) this;
        }

        public Criteria andMetaTypeLessThanOrEqualTo(String value) {
            addCriterion("meta_type <=", value, "metaType");
            return (Criteria) this;
        }

        public Criteria andMetaTypeLike(String value) {
            addCriterion("meta_type like", value, "metaType");
            return (Criteria) this;
        }

        public Criteria andMetaTypeNotLike(String value) {
            addCriterion("meta_type not like", value, "metaType");
            return (Criteria) this;
        }

        public Criteria andMetaTypeIn(List<String> values) {
            addCriterion("meta_type in", values, "metaType");
            return (Criteria) this;
        }

        public Criteria andMetaTypeNotIn(List<String> values) {
            addCriterion("meta_type not in", values, "metaType");
            return (Criteria) this;
        }

        public Criteria andMetaTypeBetween(String value1, String value2) {
            addCriterion("meta_type between", value1, value2, "metaType");
            return (Criteria) this;
        }

        public Criteria andMetaTypeNotBetween(String value1, String value2) {
            addCriterion("meta_type not between", value1, value2, "metaType");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

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
            if (value instanceof List<?>) {
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