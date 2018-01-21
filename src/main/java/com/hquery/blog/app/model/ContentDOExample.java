package com.hquery.blog.app.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author hquery.huang
 */
public class ContentDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ContentDOExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSlugIsNull() {
            addCriterion("slug is null");
            return (Criteria) this;
        }

        public Criteria andSlugIsNotNull() {
            addCriterion("slug is not null");
            return (Criteria) this;
        }

        public Criteria andSlugEqualTo(String value) {
            addCriterion("slug =", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugNotEqualTo(String value) {
            addCriterion("slug <>", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugGreaterThan(String value) {
            addCriterion("slug >", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugGreaterThanOrEqualTo(String value) {
            addCriterion("slug >=", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugLessThan(String value) {
            addCriterion("slug <", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugLessThanOrEqualTo(String value) {
            addCriterion("slug <=", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugLike(String value) {
            addCriterion("slug like", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugNotLike(String value) {
            addCriterion("slug not like", value, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugIn(List<String> values) {
            addCriterion("slug in", values, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugNotIn(List<String> values) {
            addCriterion("slug not in", values, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugBetween(String value1, String value2) {
            addCriterion("slug between", value1, value2, "slug");
            return (Criteria) this;
        }

        public Criteria andSlugNotBetween(String value1, String value2) {
            addCriterion("slug not between", value1, value2, "slug");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNull() {
            addCriterion("author_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNotNull() {
            addCriterion("author_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdEqualTo(Long value) {
            addCriterion("author_id =", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotEqualTo(Long value) {
            addCriterion("author_id <>", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThan(Long value) {
            addCriterion("author_id >", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("author_id >=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThan(Long value) {
            addCriterion("author_id <", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThanOrEqualTo(Long value) {
            addCriterion("author_id <=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIn(List<Long> values) {
            addCriterion("author_id in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotIn(List<Long> values) {
            addCriterion("author_id not in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdBetween(Long value1, Long value2) {
            addCriterion("author_id between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotBetween(Long value1, Long value2) {
            addCriterion("author_id not between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andHitsIsNull() {
            addCriterion("hits is null");
            return (Criteria) this;
        }

        public Criteria andHitsIsNotNull() {
            addCriterion("hits is not null");
            return (Criteria) this;
        }

        public Criteria andHitsEqualTo(Integer value) {
            addCriterion("hits =", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotEqualTo(Integer value) {
            addCriterion("hits <>", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThan(Integer value) {
            addCriterion("hits >", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("hits >=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThan(Integer value) {
            addCriterion("hits <", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThanOrEqualTo(Integer value) {
            addCriterion("hits <=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsIn(List<Integer> values) {
            addCriterion("hits in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotIn(List<Integer> values) {
            addCriterion("hits not in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsBetween(Integer value1, Integer value2) {
            addCriterion("hits between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotBetween(Integer value1, Integer value2) {
            addCriterion("hits not between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andFmtTypeIsNull() {
            addCriterion("fmt_type is null");
            return (Criteria) this;
        }

        public Criteria andFmtTypeIsNotNull() {
            addCriterion("fmt_type is not null");
            return (Criteria) this;
        }

        public Criteria andFmtTypeEqualTo(String value) {
            addCriterion("fmt_type =", value, "fmtType");
            return (Criteria) this;
        }

        public Criteria andFmtTypeNotEqualTo(String value) {
            addCriterion("fmt_type <>", value, "fmtType");
            return (Criteria) this;
        }

        public Criteria andFmtTypeGreaterThan(String value) {
            addCriterion("fmt_type >", value, "fmtType");
            return (Criteria) this;
        }

        public Criteria andFmtTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fmt_type >=", value, "fmtType");
            return (Criteria) this;
        }

        public Criteria andFmtTypeLessThan(String value) {
            addCriterion("fmt_type <", value, "fmtType");
            return (Criteria) this;
        }

        public Criteria andFmtTypeLessThanOrEqualTo(String value) {
            addCriterion("fmt_type <=", value, "fmtType");
            return (Criteria) this;
        }

        public Criteria andFmtTypeLike(String value) {
            addCriterion("fmt_type like", value, "fmtType");
            return (Criteria) this;
        }

        public Criteria andFmtTypeNotLike(String value) {
            addCriterion("fmt_type not like", value, "fmtType");
            return (Criteria) this;
        }

        public Criteria andFmtTypeIn(List<String> values) {
            addCriterion("fmt_type in", values, "fmtType");
            return (Criteria) this;
        }

        public Criteria andFmtTypeNotIn(List<String> values) {
            addCriterion("fmt_type not in", values, "fmtType");
            return (Criteria) this;
        }

        public Criteria andFmtTypeBetween(String value1, String value2) {
            addCriterion("fmt_type between", value1, value2, "fmtType");
            return (Criteria) this;
        }

        public Criteria andFmtTypeNotBetween(String value1, String value2) {
            addCriterion("fmt_type not between", value1, value2, "fmtType");
            return (Criteria) this;
        }

        public Criteria andThumbImgIsNull() {
            addCriterion("thumb_img is null");
            return (Criteria) this;
        }

        public Criteria andThumbImgIsNotNull() {
            addCriterion("thumb_img is not null");
            return (Criteria) this;
        }

        public Criteria andThumbImgEqualTo(String value) {
            addCriterion("thumb_img =", value, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgNotEqualTo(String value) {
            addCriterion("thumb_img <>", value, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgGreaterThan(String value) {
            addCriterion("thumb_img >", value, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgGreaterThanOrEqualTo(String value) {
            addCriterion("thumb_img >=", value, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgLessThan(String value) {
            addCriterion("thumb_img <", value, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgLessThanOrEqualTo(String value) {
            addCriterion("thumb_img <=", value, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgLike(String value) {
            addCriterion("thumb_img like", value, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgNotLike(String value) {
            addCriterion("thumb_img not like", value, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgIn(List<String> values) {
            addCriterion("thumb_img in", values, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgNotIn(List<String> values) {
            addCriterion("thumb_img not in", values, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgBetween(String value1, String value2) {
            addCriterion("thumb_img between", value1, value2, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgNotBetween(String value1, String value2) {
            addCriterion("thumb_img not between", value1, value2, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andCategoriesIsNull() {
            addCriterion("categories is null");
            return (Criteria) this;
        }

        public Criteria andCategoriesIsNotNull() {
            addCriterion("categories is not null");
            return (Criteria) this;
        }

        public Criteria andCategoriesEqualTo(String value) {
            addCriterion("categories =", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotEqualTo(String value) {
            addCriterion("categories <>", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesGreaterThan(String value) {
            addCriterion("categories >", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesGreaterThanOrEqualTo(String value) {
            addCriterion("categories >=", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesLessThan(String value) {
            addCriterion("categories <", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesLessThanOrEqualTo(String value) {
            addCriterion("categories <=", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesLike(String value) {
            addCriterion("categories like", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotLike(String value) {
            addCriterion("categories not like", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesIn(List<String> values) {
            addCriterion("categories in", values, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotIn(List<String> values) {
            addCriterion("categories not in", values, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesBetween(String value1, String value2) {
            addCriterion("categories between", value1, value2, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotBetween(String value1, String value2) {
            addCriterion("categories not between", value1, value2, "categories");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCommentsNumIsNull() {
            addCriterion("comments_num is null");
            return (Criteria) this;
        }

        public Criteria andCommentsNumIsNotNull() {
            addCriterion("comments_num is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsNumEqualTo(Integer value) {
            addCriterion("comments_num =", value, "commentsNum");
            return (Criteria) this;
        }

        public Criteria andCommentsNumNotEqualTo(Integer value) {
            addCriterion("comments_num <>", value, "commentsNum");
            return (Criteria) this;
        }

        public Criteria andCommentsNumGreaterThan(Integer value) {
            addCriterion("comments_num >", value, "commentsNum");
            return (Criteria) this;
        }

        public Criteria andCommentsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("comments_num >=", value, "commentsNum");
            return (Criteria) this;
        }

        public Criteria andCommentsNumLessThan(Integer value) {
            addCriterion("comments_num <", value, "commentsNum");
            return (Criteria) this;
        }

        public Criteria andCommentsNumLessThanOrEqualTo(Integer value) {
            addCriterion("comments_num <=", value, "commentsNum");
            return (Criteria) this;
        }

        public Criteria andCommentsNumIn(List<Integer> values) {
            addCriterion("comments_num in", values, "commentsNum");
            return (Criteria) this;
        }

        public Criteria andCommentsNumNotIn(List<Integer> values) {
            addCriterion("comments_num not in", values, "commentsNum");
            return (Criteria) this;
        }

        public Criteria andCommentsNumBetween(Integer value1, Integer value2) {
            addCriterion("comments_num between", value1, value2, "commentsNum");
            return (Criteria) this;
        }

        public Criteria andCommentsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("comments_num not between", value1, value2, "commentsNum");
            return (Criteria) this;
        }

        public Criteria andAllowCommentIsNull() {
            addCriterion("allow_comment is null");
            return (Criteria) this;
        }

        public Criteria andAllowCommentIsNotNull() {
            addCriterion("allow_comment is not null");
            return (Criteria) this;
        }

        public Criteria andAllowCommentEqualTo(Boolean value) {
            addCriterion("allow_comment =", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentNotEqualTo(Boolean value) {
            addCriterion("allow_comment <>", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentGreaterThan(Boolean value) {
            addCriterion("allow_comment >", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("allow_comment >=", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentLessThan(Boolean value) {
            addCriterion("allow_comment <", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentLessThanOrEqualTo(Boolean value) {
            addCriterion("allow_comment <=", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentIn(List<Boolean> values) {
            addCriterion("allow_comment in", values, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentNotIn(List<Boolean> values) {
            addCriterion("allow_comment not in", values, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentBetween(Boolean value1, Boolean value2) {
            addCriterion("allow_comment between", value1, value2, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("allow_comment not between", value1, value2, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowPingIsNull() {
            addCriterion("allow_ping is null");
            return (Criteria) this;
        }

        public Criteria andAllowPingIsNotNull() {
            addCriterion("allow_ping is not null");
            return (Criteria) this;
        }

        public Criteria andAllowPingEqualTo(Boolean value) {
            addCriterion("allow_ping =", value, "allowPing");
            return (Criteria) this;
        }

        public Criteria andAllowPingNotEqualTo(Boolean value) {
            addCriterion("allow_ping <>", value, "allowPing");
            return (Criteria) this;
        }

        public Criteria andAllowPingGreaterThan(Boolean value) {
            addCriterion("allow_ping >", value, "allowPing");
            return (Criteria) this;
        }

        public Criteria andAllowPingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("allow_ping >=", value, "allowPing");
            return (Criteria) this;
        }

        public Criteria andAllowPingLessThan(Boolean value) {
            addCriterion("allow_ping <", value, "allowPing");
            return (Criteria) this;
        }

        public Criteria andAllowPingLessThanOrEqualTo(Boolean value) {
            addCriterion("allow_ping <=", value, "allowPing");
            return (Criteria) this;
        }

        public Criteria andAllowPingIn(List<Boolean> values) {
            addCriterion("allow_ping in", values, "allowPing");
            return (Criteria) this;
        }

        public Criteria andAllowPingNotIn(List<Boolean> values) {
            addCriterion("allow_ping not in", values, "allowPing");
            return (Criteria) this;
        }

        public Criteria andAllowPingBetween(Boolean value1, Boolean value2) {
            addCriterion("allow_ping between", value1, value2, "allowPing");
            return (Criteria) this;
        }

        public Criteria andAllowPingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("allow_ping not between", value1, value2, "allowPing");
            return (Criteria) this;
        }

        public Criteria andAllowFeedIsNull() {
            addCriterion("allow_feed is null");
            return (Criteria) this;
        }

        public Criteria andAllowFeedIsNotNull() {
            addCriterion("allow_feed is not null");
            return (Criteria) this;
        }

        public Criteria andAllowFeedEqualTo(Boolean value) {
            addCriterion("allow_feed =", value, "allowFeed");
            return (Criteria) this;
        }

        public Criteria andAllowFeedNotEqualTo(Boolean value) {
            addCriterion("allow_feed <>", value, "allowFeed");
            return (Criteria) this;
        }

        public Criteria andAllowFeedGreaterThan(Boolean value) {
            addCriterion("allow_feed >", value, "allowFeed");
            return (Criteria) this;
        }

        public Criteria andAllowFeedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("allow_feed >=", value, "allowFeed");
            return (Criteria) this;
        }

        public Criteria andAllowFeedLessThan(Boolean value) {
            addCriterion("allow_feed <", value, "allowFeed");
            return (Criteria) this;
        }

        public Criteria andAllowFeedLessThanOrEqualTo(Boolean value) {
            addCriterion("allow_feed <=", value, "allowFeed");
            return (Criteria) this;
        }

        public Criteria andAllowFeedIn(List<Boolean> values) {
            addCriterion("allow_feed in", values, "allowFeed");
            return (Criteria) this;
        }

        public Criteria andAllowFeedNotIn(List<Boolean> values) {
            addCriterion("allow_feed not in", values, "allowFeed");
            return (Criteria) this;
        }

        public Criteria andAllowFeedBetween(Boolean value1, Boolean value2) {
            addCriterion("allow_feed between", value1, value2, "allowFeed");
            return (Criteria) this;
        }

        public Criteria andAllowFeedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("allow_feed not between", value1, value2, "allowFeed");
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