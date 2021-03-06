/**
 *  introspectedTable.getFullyQualifiedTable().getComment()
 * UsersExample.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2015-10-30 Created
 */
package org.learn.boot.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UsersQueryHelper {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersQueryHelper() {
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

    /**
     * 
     * 
     * @author 菠萝大象
     * @version 1.0 2015-10-30
     */
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andMain_head_photo_urlIsNull() {
            addCriterion("main_head_photo_url is null");
            return (Criteria) this;
        }

        public Criteria andMain_head_photo_urlIsNotNull() {
            addCriterion("main_head_photo_url is not null");
            return (Criteria) this;
        }

        public Criteria andMain_head_photo_urlEqualTo(String value) {
            addCriterion("main_head_photo_url =", value, "main_head_photo_url");
            return (Criteria) this;
        }

        public Criteria andMain_head_photo_urlNotEqualTo(String value) {
            addCriterion("main_head_photo_url <>", value, "main_head_photo_url");
            return (Criteria) this;
        }

        public Criteria andMain_head_photo_urlGreaterThan(String value) {
            addCriterion("main_head_photo_url >", value, "main_head_photo_url");
            return (Criteria) this;
        }

        public Criteria andMain_head_photo_urlGreaterThanOrEqualTo(String value) {
            addCriterion("main_head_photo_url >=", value, "main_head_photo_url");
            return (Criteria) this;
        }

        public Criteria andMain_head_photo_urlLessThan(String value) {
            addCriterion("main_head_photo_url <", value, "main_head_photo_url");
            return (Criteria) this;
        }

        public Criteria andMain_head_photo_urlLessThanOrEqualTo(String value) {
            addCriterion("main_head_photo_url <=", value, "main_head_photo_url");
            return (Criteria) this;
        }

        public Criteria andMain_head_photo_urlLike(String value) {
            addCriterion("main_head_photo_url like", value, "main_head_photo_url");
            return (Criteria) this;
        }

        public Criteria andMain_head_photo_urlNotLike(String value) {
            addCriterion("main_head_photo_url not like", value, "main_head_photo_url");
            return (Criteria) this;
        }

        public Criteria andMain_head_photo_urlIn(List<String> values) {
            addCriterion("main_head_photo_url in", values, "main_head_photo_url");
            return (Criteria) this;
        }

        public Criteria andMain_head_photo_urlNotIn(List<String> values) {
            addCriterion("main_head_photo_url not in", values, "main_head_photo_url");
            return (Criteria) this;
        }

        public Criteria andMain_head_photo_urlBetween(String value1, String value2) {
            addCriterion("main_head_photo_url between", value1, value2, "main_head_photo_url");
            return (Criteria) this;
        }

        public Criteria andMain_head_photo_urlNotBetween(String value1, String value2) {
            addCriterion("main_head_photo_url not between", value1, value2, "main_head_photo_url");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andConstellationIsNull() {
            addCriterion("constellation is null");
            return (Criteria) this;
        }

        public Criteria andConstellationIsNotNull() {
            addCriterion("constellation is not null");
            return (Criteria) this;
        }

        public Criteria andConstellationEqualTo(String value) {
            addCriterion("constellation =", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationNotEqualTo(String value) {
            addCriterion("constellation <>", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationGreaterThan(String value) {
            addCriterion("constellation >", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationGreaterThanOrEqualTo(String value) {
            addCriterion("constellation >=", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationLessThan(String value) {
            addCriterion("constellation <", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationLessThanOrEqualTo(String value) {
            addCriterion("constellation <=", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationLike(String value) {
            addCriterion("constellation like", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationNotLike(String value) {
            addCriterion("constellation not like", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationIn(List<String> values) {
            addCriterion("constellation in", values, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationNotIn(List<String> values) {
            addCriterion("constellation not in", values, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationBetween(String value1, String value2) {
            addCriterion("constellation between", value1, value2, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationNotBetween(String value1, String value2) {
            addCriterion("constellation not between", value1, value2, "constellation");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNull() {
            addCriterion("mtime is null");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNotNull() {
            addCriterion("mtime is not null");
            return (Criteria) this;
        }

        public Criteria andMtimeEqualTo(Date value) {
            addCriterion("mtime =", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotEqualTo(Date value) {
            addCriterion("mtime <>", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThan(Date value) {
            addCriterion("mtime >", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mtime >=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThan(Date value) {
            addCriterion("mtime <", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThanOrEqualTo(Date value) {
            addCriterion("mtime <=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeIn(List<Date> values) {
            addCriterion("mtime in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotIn(List<Date> values) {
            addCriterion("mtime not in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeBetween(Date value1, Date value2) {
            addCriterion("mtime between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotBetween(Date value1, Date value2) {
            addCriterion("mtime not between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andTreat_numberIsNull() {
            addCriterion("treat_number is null");
            return (Criteria) this;
        }

        public Criteria andTreat_numberIsNotNull() {
            addCriterion("treat_number is not null");
            return (Criteria) this;
        }

        public Criteria andTreat_numberEqualTo(String value) {
            addCriterion("treat_number =", value, "treat_number");
            return (Criteria) this;
        }

        public Criteria andTreat_numberNotEqualTo(String value) {
            addCriterion("treat_number <>", value, "treat_number");
            return (Criteria) this;
        }

        public Criteria andTreat_numberGreaterThan(String value) {
            addCriterion("treat_number >", value, "treat_number");
            return (Criteria) this;
        }

        public Criteria andTreat_numberGreaterThanOrEqualTo(String value) {
            addCriterion("treat_number >=", value, "treat_number");
            return (Criteria) this;
        }

        public Criteria andTreat_numberLessThan(String value) {
            addCriterion("treat_number <", value, "treat_number");
            return (Criteria) this;
        }

        public Criteria andTreat_numberLessThanOrEqualTo(String value) {
            addCriterion("treat_number <=", value, "treat_number");
            return (Criteria) this;
        }

        public Criteria andTreat_numberLike(String value) {
            addCriterion("treat_number like", value, "treat_number");
            return (Criteria) this;
        }

        public Criteria andTreat_numberNotLike(String value) {
            addCriterion("treat_number not like", value, "treat_number");
            return (Criteria) this;
        }

        public Criteria andTreat_numberIn(List<String> values) {
            addCriterion("treat_number in", values, "treat_number");
            return (Criteria) this;
        }

        public Criteria andTreat_numberNotIn(List<String> values) {
            addCriterion("treat_number not in", values, "treat_number");
            return (Criteria) this;
        }

        public Criteria andTreat_numberBetween(String value1, String value2) {
            addCriterion("treat_number between", value1, value2, "treat_number");
            return (Criteria) this;
        }

        public Criteria andTreat_numberNotBetween(String value1, String value2) {
            addCriterion("treat_number not between", value1, value2, "treat_number");
            return (Criteria) this;
        }

        public Criteria andAffective_stateIsNull() {
            addCriterion("affective_state is null");
            return (Criteria) this;
        }

        public Criteria andAffective_stateIsNotNull() {
            addCriterion("affective_state is not null");
            return (Criteria) this;
        }

        public Criteria andAffective_stateEqualTo(Integer value) {
            addCriterion("affective_state =", value, "affective_state");
            return (Criteria) this;
        }

        public Criteria andAffective_stateNotEqualTo(Integer value) {
            addCriterion("affective_state <>", value, "affective_state");
            return (Criteria) this;
        }

        public Criteria andAffective_stateGreaterThan(Integer value) {
            addCriterion("affective_state >", value, "affective_state");
            return (Criteria) this;
        }

        public Criteria andAffective_stateGreaterThanOrEqualTo(Integer value) {
            addCriterion("affective_state >=", value, "affective_state");
            return (Criteria) this;
        }

        public Criteria andAffective_stateLessThan(Integer value) {
            addCriterion("affective_state <", value, "affective_state");
            return (Criteria) this;
        }

        public Criteria andAffective_stateLessThanOrEqualTo(Integer value) {
            addCriterion("affective_state <=", value, "affective_state");
            return (Criteria) this;
        }

        public Criteria andAffective_stateIn(List<Integer> values) {
            addCriterion("affective_state in", values, "affective_state");
            return (Criteria) this;
        }

        public Criteria andAffective_stateNotIn(List<Integer> values) {
            addCriterion("affective_state not in", values, "affective_state");
            return (Criteria) this;
        }

        public Criteria andAffective_stateBetween(Integer value1, Integer value2) {
            addCriterion("affective_state between", value1, value2, "affective_state");
            return (Criteria) this;
        }

        public Criteria andAffective_stateNotBetween(Integer value1, Integer value2) {
            addCriterion("affective_state not between", value1, value2, "affective_state");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNull() {
            addCriterion("profession is null");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNotNull() {
            addCriterion("profession is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionEqualTo(Integer value) {
            addCriterion("profession =", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotEqualTo(Integer value) {
            addCriterion("profession <>", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThan(Integer value) {
            addCriterion("profession >", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThanOrEqualTo(Integer value) {
            addCriterion("profession >=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThan(Integer value) {
            addCriterion("profession <", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThanOrEqualTo(Integer value) {
            addCriterion("profession <=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionIn(List<Integer> values) {
            addCriterion("profession in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotIn(List<Integer> values) {
            addCriterion("profession not in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionBetween(Integer value1, Integer value2) {
            addCriterion("profession between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotBetween(Integer value1, Integer value2) {
            addCriterion("profession not between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andCity_codeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCity_codeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCity_codeEqualTo(String value) {
            addCriterion("city_code =", value, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeGreaterThan(String value) {
            addCriterion("city_code >", value, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeLessThan(String value) {
            addCriterion("city_code <", value, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeLike(String value) {
            addCriterion("city_code like", value, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeNotLike(String value) {
            addCriterion("city_code not like", value, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeIn(List<String> values) {
            addCriterion("city_code in", values, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "city_code");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(Integer value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(Integer value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(Integer value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(Integer value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(Integer value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<Integer> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<Integer> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(Integer value1, Integer value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(Integer value1, Integer value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIs_drinkIsNull() {
            addCriterion("is_drink is null");
            return (Criteria) this;
        }

        public Criteria andIs_drinkIsNotNull() {
            addCriterion("is_drink is not null");
            return (Criteria) this;
        }

        public Criteria andIs_drinkEqualTo(Integer value) {
            addCriterion("is_drink =", value, "is_drink");
            return (Criteria) this;
        }

        public Criteria andIs_drinkNotEqualTo(Integer value) {
            addCriterion("is_drink <>", value, "is_drink");
            return (Criteria) this;
        }

        public Criteria andIs_drinkGreaterThan(Integer value) {
            addCriterion("is_drink >", value, "is_drink");
            return (Criteria) this;
        }

        public Criteria andIs_drinkGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_drink >=", value, "is_drink");
            return (Criteria) this;
        }

        public Criteria andIs_drinkLessThan(Integer value) {
            addCriterion("is_drink <", value, "is_drink");
            return (Criteria) this;
        }

        public Criteria andIs_drinkLessThanOrEqualTo(Integer value) {
            addCriterion("is_drink <=", value, "is_drink");
            return (Criteria) this;
        }

        public Criteria andIs_drinkIn(List<Integer> values) {
            addCriterion("is_drink in", values, "is_drink");
            return (Criteria) this;
        }

        public Criteria andIs_drinkNotIn(List<Integer> values) {
            addCriterion("is_drink not in", values, "is_drink");
            return (Criteria) this;
        }

        public Criteria andIs_drinkBetween(Integer value1, Integer value2) {
            addCriterion("is_drink between", value1, value2, "is_drink");
            return (Criteria) this;
        }

        public Criteria andIs_drinkNotBetween(Integer value1, Integer value2) {
            addCriterion("is_drink not between", value1, value2, "is_drink");
            return (Criteria) this;
        }

        public Criteria andIs_smokingIsNull() {
            addCriterion("is_smoking is null");
            return (Criteria) this;
        }

        public Criteria andIs_smokingIsNotNull() {
            addCriterion("is_smoking is not null");
            return (Criteria) this;
        }

        public Criteria andIs_smokingEqualTo(Integer value) {
            addCriterion("is_smoking =", value, "is_smoking");
            return (Criteria) this;
        }

        public Criteria andIs_smokingNotEqualTo(Integer value) {
            addCriterion("is_smoking <>", value, "is_smoking");
            return (Criteria) this;
        }

        public Criteria andIs_smokingGreaterThan(Integer value) {
            addCriterion("is_smoking >", value, "is_smoking");
            return (Criteria) this;
        }

        public Criteria andIs_smokingGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_smoking >=", value, "is_smoking");
            return (Criteria) this;
        }

        public Criteria andIs_smokingLessThan(Integer value) {
            addCriterion("is_smoking <", value, "is_smoking");
            return (Criteria) this;
        }

        public Criteria andIs_smokingLessThanOrEqualTo(Integer value) {
            addCriterion("is_smoking <=", value, "is_smoking");
            return (Criteria) this;
        }

        public Criteria andIs_smokingIn(List<Integer> values) {
            addCriterion("is_smoking in", values, "is_smoking");
            return (Criteria) this;
        }

        public Criteria andIs_smokingNotIn(List<Integer> values) {
            addCriterion("is_smoking not in", values, "is_smoking");
            return (Criteria) this;
        }

        public Criteria andIs_smokingBetween(Integer value1, Integer value2) {
            addCriterion("is_smoking between", value1, value2, "is_smoking");
            return (Criteria) this;
        }

        public Criteria andIs_smokingNotBetween(Integer value1, Integer value2) {
            addCriterion("is_smoking not between", value1, value2, "is_smoking");
            return (Criteria) this;
        }

        public Criteria andCredit_balanceIsNull() {
            addCriterion("credit_balance is null");
            return (Criteria) this;
        }

        public Criteria andCredit_balanceIsNotNull() {
            addCriterion("credit_balance is not null");
            return (Criteria) this;
        }

        public Criteria andCredit_balanceEqualTo(Integer value) {
            addCriterion("credit_balance =", value, "credit_balance");
            return (Criteria) this;
        }

        public Criteria andCredit_balanceNotEqualTo(Integer value) {
            addCriterion("credit_balance <>", value, "credit_balance");
            return (Criteria) this;
        }

        public Criteria andCredit_balanceGreaterThan(Integer value) {
            addCriterion("credit_balance >", value, "credit_balance");
            return (Criteria) this;
        }

        public Criteria andCredit_balanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_balance >=", value, "credit_balance");
            return (Criteria) this;
        }

        public Criteria andCredit_balanceLessThan(Integer value) {
            addCriterion("credit_balance <", value, "credit_balance");
            return (Criteria) this;
        }

        public Criteria andCredit_balanceLessThanOrEqualTo(Integer value) {
            addCriterion("credit_balance <=", value, "credit_balance");
            return (Criteria) this;
        }

        public Criteria andCredit_balanceIn(List<Integer> values) {
            addCriterion("credit_balance in", values, "credit_balance");
            return (Criteria) this;
        }

        public Criteria andCredit_balanceNotIn(List<Integer> values) {
            addCriterion("credit_balance not in", values, "credit_balance");
            return (Criteria) this;
        }

        public Criteria andCredit_balanceBetween(Integer value1, Integer value2) {
            addCriterion("credit_balance between", value1, value2, "credit_balance");
            return (Criteria) this;
        }

        public Criteria andCredit_balanceNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_balance not between", value1, value2, "credit_balance");
            return (Criteria) this;
        }

        public Criteria andUser_signIsNull() {
            addCriterion("user_sign is null");
            return (Criteria) this;
        }

        public Criteria andUser_signIsNotNull() {
            addCriterion("user_sign is not null");
            return (Criteria) this;
        }

        public Criteria andUser_signEqualTo(String value) {
            addCriterion("user_sign =", value, "user_sign");
            return (Criteria) this;
        }

        public Criteria andUser_signNotEqualTo(String value) {
            addCriterion("user_sign <>", value, "user_sign");
            return (Criteria) this;
        }

        public Criteria andUser_signGreaterThan(String value) {
            addCriterion("user_sign >", value, "user_sign");
            return (Criteria) this;
        }

        public Criteria andUser_signGreaterThanOrEqualTo(String value) {
            addCriterion("user_sign >=", value, "user_sign");
            return (Criteria) this;
        }

        public Criteria andUser_signLessThan(String value) {
            addCriterion("user_sign <", value, "user_sign");
            return (Criteria) this;
        }

        public Criteria andUser_signLessThanOrEqualTo(String value) {
            addCriterion("user_sign <=", value, "user_sign");
            return (Criteria) this;
        }

        public Criteria andUser_signLike(String value) {
            addCriterion("user_sign like", value, "user_sign");
            return (Criteria) this;
        }

        public Criteria andUser_signNotLike(String value) {
            addCriterion("user_sign not like", value, "user_sign");
            return (Criteria) this;
        }

        public Criteria andUser_signIn(List<String> values) {
            addCriterion("user_sign in", values, "user_sign");
            return (Criteria) this;
        }

        public Criteria andUser_signNotIn(List<String> values) {
            addCriterion("user_sign not in", values, "user_sign");
            return (Criteria) this;
        }

        public Criteria andUser_signBetween(String value1, String value2) {
            addCriterion("user_sign between", value1, value2, "user_sign");
            return (Criteria) this;
        }

        public Criteria andUser_signNotBetween(String value1, String value2) {
            addCriterion("user_sign not between", value1, value2, "user_sign");
            return (Criteria) this;
        }

        public Criteria andLogin_timeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLogin_timeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogin_timeEqualTo(Date value) {
            addCriterion("login_time =", value, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeNotEqualTo(Date value) {
            addCriterion("login_time <>", value, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeGreaterThan(Date value) {
            addCriterion("login_time >", value, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_time >=", value, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeLessThan(Date value) {
            addCriterion("login_time <", value, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeLessThanOrEqualTo(Date value) {
            addCriterion("login_time <=", value, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeIn(List<Date> values) {
            addCriterion("login_time in", values, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeNotIn(List<Date> values) {
            addCriterion("login_time not in", values, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeBetween(Date value1, Date value2) {
            addCriterion("login_time between", value1, value2, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeNotBetween(Date value1, Date value2) {
            addCriterion("login_time not between", value1, value2, "login_time");
            return (Criteria) this;
        }

        public Criteria andCoordinateIsNull() {
            addCriterion("coordinate is null");
            return (Criteria) this;
        }

        public Criteria andCoordinateIsNotNull() {
            addCriterion("coordinate is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinateEqualTo(String value) {
            addCriterion("coordinate =", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotEqualTo(String value) {
            addCriterion("coordinate <>", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateGreaterThan(String value) {
            addCriterion("coordinate >", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("coordinate >=", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLessThan(String value) {
            addCriterion("coordinate <", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLessThanOrEqualTo(String value) {
            addCriterion("coordinate <=", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLike(String value) {
            addCriterion("coordinate like", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotLike(String value) {
            addCriterion("coordinate not like", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateIn(List<String> values) {
            addCriterion("coordinate in", values, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotIn(List<String> values) {
            addCriterion("coordinate not in", values, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateBetween(String value1, String value2) {
            addCriterion("coordinate between", value1, value2, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotBetween(String value1, String value2) {
            addCriterion("coordinate not between", value1, value2, "coordinate");
            return (Criteria) this;
        }

        public Criteria andMobile_deviceIsNull() {
            addCriterion("mobile_device is null");
            return (Criteria) this;
        }

        public Criteria andMobile_deviceIsNotNull() {
            addCriterion("mobile_device is not null");
            return (Criteria) this;
        }

        public Criteria andMobile_deviceEqualTo(String value) {
            addCriterion("mobile_device =", value, "mobile_device");
            return (Criteria) this;
        }

        public Criteria andMobile_deviceNotEqualTo(String value) {
            addCriterion("mobile_device <>", value, "mobile_device");
            return (Criteria) this;
        }

        public Criteria andMobile_deviceGreaterThan(String value) {
            addCriterion("mobile_device >", value, "mobile_device");
            return (Criteria) this;
        }

        public Criteria andMobile_deviceGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_device >=", value, "mobile_device");
            return (Criteria) this;
        }

        public Criteria andMobile_deviceLessThan(String value) {
            addCriterion("mobile_device <", value, "mobile_device");
            return (Criteria) this;
        }

        public Criteria andMobile_deviceLessThanOrEqualTo(String value) {
            addCriterion("mobile_device <=", value, "mobile_device");
            return (Criteria) this;
        }

        public Criteria andMobile_deviceLike(String value) {
            addCriterion("mobile_device like", value, "mobile_device");
            return (Criteria) this;
        }

        public Criteria andMobile_deviceNotLike(String value) {
            addCriterion("mobile_device not like", value, "mobile_device");
            return (Criteria) this;
        }

        public Criteria andMobile_deviceIn(List<String> values) {
            addCriterion("mobile_device in", values, "mobile_device");
            return (Criteria) this;
        }

        public Criteria andMobile_deviceNotIn(List<String> values) {
            addCriterion("mobile_device not in", values, "mobile_device");
            return (Criteria) this;
        }

        public Criteria andMobile_deviceBetween(String value1, String value2) {
            addCriterion("mobile_device between", value1, value2, "mobile_device");
            return (Criteria) this;
        }

        public Criteria andMobile_deviceNotBetween(String value1, String value2) {
            addCriterion("mobile_device not between", value1, value2, "mobile_device");
            return (Criteria) this;
        }

        public Criteria andPretty_numIsNull() {
            addCriterion("pretty_num is null");
            return (Criteria) this;
        }

        public Criteria andPretty_numIsNotNull() {
            addCriterion("pretty_num is not null");
            return (Criteria) this;
        }

        public Criteria andPretty_numEqualTo(Integer value) {
            addCriterion("pretty_num =", value, "pretty_num");
            return (Criteria) this;
        }

        public Criteria andPretty_numNotEqualTo(Integer value) {
            addCriterion("pretty_num <>", value, "pretty_num");
            return (Criteria) this;
        }

        public Criteria andPretty_numGreaterThan(Integer value) {
            addCriterion("pretty_num >", value, "pretty_num");
            return (Criteria) this;
        }

        public Criteria andPretty_numGreaterThanOrEqualTo(Integer value) {
            addCriterion("pretty_num >=", value, "pretty_num");
            return (Criteria) this;
        }

        public Criteria andPretty_numLessThan(Integer value) {
            addCriterion("pretty_num <", value, "pretty_num");
            return (Criteria) this;
        }

        public Criteria andPretty_numLessThanOrEqualTo(Integer value) {
            addCriterion("pretty_num <=", value, "pretty_num");
            return (Criteria) this;
        }

        public Criteria andPretty_numIn(List<Integer> values) {
            addCriterion("pretty_num in", values, "pretty_num");
            return (Criteria) this;
        }

        public Criteria andPretty_numNotIn(List<Integer> values) {
            addCriterion("pretty_num not in", values, "pretty_num");
            return (Criteria) this;
        }

        public Criteria andPretty_numBetween(Integer value1, Integer value2) {
            addCriterion("pretty_num between", value1, value2, "pretty_num");
            return (Criteria) this;
        }

        public Criteria andPretty_numNotBetween(Integer value1, Integer value2) {
            addCriterion("pretty_num not between", value1, value2, "pretty_num");
            return (Criteria) this;
        }

        public Criteria andReviewIsNull() {
            addCriterion("review is null");
            return (Criteria) this;
        }

        public Criteria andReviewIsNotNull() {
            addCriterion("review is not null");
            return (Criteria) this;
        }

        public Criteria andReviewEqualTo(Integer value) {
            addCriterion("review =", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotEqualTo(Integer value) {
            addCriterion("review <>", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewGreaterThan(Integer value) {
            addCriterion("review >", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewGreaterThanOrEqualTo(Integer value) {
            addCriterion("review >=", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewLessThan(Integer value) {
            addCriterion("review <", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewLessThanOrEqualTo(Integer value) {
            addCriterion("review <=", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewIn(List<Integer> values) {
            addCriterion("review in", values, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotIn(List<Integer> values) {
            addCriterion("review not in", values, "review");
            return (Criteria) this;
        }

        public Criteria andReviewBetween(Integer value1, Integer value2) {
            addCriterion("review between", value1, value2, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotBetween(Integer value1, Integer value2) {
            addCriterion("review not between", value1, value2, "review");
            return (Criteria) this;
        }

        public Criteria andUser_sourceIsNull() {
            addCriterion("user_source is null");
            return (Criteria) this;
        }

        public Criteria andUser_sourceIsNotNull() {
            addCriterion("user_source is not null");
            return (Criteria) this;
        }

        public Criteria andUser_sourceEqualTo(String value) {
            addCriterion("user_source =", value, "user_source");
            return (Criteria) this;
        }

        public Criteria andUser_sourceNotEqualTo(String value) {
            addCriterion("user_source <>", value, "user_source");
            return (Criteria) this;
        }

        public Criteria andUser_sourceGreaterThan(String value) {
            addCriterion("user_source >", value, "user_source");
            return (Criteria) this;
        }

        public Criteria andUser_sourceGreaterThanOrEqualTo(String value) {
            addCriterion("user_source >=", value, "user_source");
            return (Criteria) this;
        }

        public Criteria andUser_sourceLessThan(String value) {
            addCriterion("user_source <", value, "user_source");
            return (Criteria) this;
        }

        public Criteria andUser_sourceLessThanOrEqualTo(String value) {
            addCriterion("user_source <=", value, "user_source");
            return (Criteria) this;
        }

        public Criteria andUser_sourceLike(String value) {
            addCriterion("user_source like", value, "user_source");
            return (Criteria) this;
        }

        public Criteria andUser_sourceNotLike(String value) {
            addCriterion("user_source not like", value, "user_source");
            return (Criteria) this;
        }

        public Criteria andUser_sourceIn(List<String> values) {
            addCriterion("user_source in", values, "user_source");
            return (Criteria) this;
        }

        public Criteria andUser_sourceNotIn(List<String> values) {
            addCriterion("user_source not in", values, "user_source");
            return (Criteria) this;
        }

        public Criteria andUser_sourceBetween(String value1, String value2) {
            addCriterion("user_source between", value1, value2, "user_source");
            return (Criteria) this;
        }

        public Criteria andUser_sourceNotBetween(String value1, String value2) {
            addCriterion("user_source not between", value1, value2, "user_source");
            return (Criteria) this;
        }

        public Criteria andPhone_typeIsNull() {
            addCriterion("phone_type is null");
            return (Criteria) this;
        }

        public Criteria andPhone_typeIsNotNull() {
            addCriterion("phone_type is not null");
            return (Criteria) this;
        }

        public Criteria andPhone_typeEqualTo(Integer value) {
            addCriterion("phone_type =", value, "phone_type");
            return (Criteria) this;
        }

        public Criteria andPhone_typeNotEqualTo(Integer value) {
            addCriterion("phone_type <>", value, "phone_type");
            return (Criteria) this;
        }

        public Criteria andPhone_typeGreaterThan(Integer value) {
            addCriterion("phone_type >", value, "phone_type");
            return (Criteria) this;
        }

        public Criteria andPhone_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("phone_type >=", value, "phone_type");
            return (Criteria) this;
        }

        public Criteria andPhone_typeLessThan(Integer value) {
            addCriterion("phone_type <", value, "phone_type");
            return (Criteria) this;
        }

        public Criteria andPhone_typeLessThanOrEqualTo(Integer value) {
            addCriterion("phone_type <=", value, "phone_type");
            return (Criteria) this;
        }

        public Criteria andPhone_typeIn(List<Integer> values) {
            addCriterion("phone_type in", values, "phone_type");
            return (Criteria) this;
        }

        public Criteria andPhone_typeNotIn(List<Integer> values) {
            addCriterion("phone_type not in", values, "phone_type");
            return (Criteria) this;
        }

        public Criteria andPhone_typeBetween(Integer value1, Integer value2) {
            addCriterion("phone_type between", value1, value2, "phone_type");
            return (Criteria) this;
        }

        public Criteria andPhone_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("phone_type not between", value1, value2, "phone_type");
            return (Criteria) this;
        }

        public Criteria andOtimeIsNull() {
            addCriterion("otime is null");
            return (Criteria) this;
        }

        public Criteria andOtimeIsNotNull() {
            addCriterion("otime is not null");
            return (Criteria) this;
        }

        public Criteria andOtimeEqualTo(Date value) {
            addCriterion("otime =", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeNotEqualTo(Date value) {
            addCriterion("otime <>", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeGreaterThan(Date value) {
            addCriterion("otime >", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("otime >=", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeLessThan(Date value) {
            addCriterion("otime <", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeLessThanOrEqualTo(Date value) {
            addCriterion("otime <=", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeIn(List<Date> values) {
            addCriterion("otime in", values, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeNotIn(List<Date> values) {
            addCriterion("otime not in", values, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeBetween(Date value1, Date value2) {
            addCriterion("otime between", value1, value2, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeNotBetween(Date value1, Date value2) {
            addCriterion("otime not between", value1, value2, "otime");
            return (Criteria) this;
        }

        public Criteria andNamesIsNull() {
            addCriterion("names is null");
            return (Criteria) this;
        }

        public Criteria andNamesIsNotNull() {
            addCriterion("names is not null");
            return (Criteria) this;
        }

        public Criteria andNamesEqualTo(String value) {
            addCriterion("names =", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesNotEqualTo(String value) {
            addCriterion("names <>", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesGreaterThan(String value) {
            addCriterion("names >", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesGreaterThanOrEqualTo(String value) {
            addCriterion("names >=", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesLessThan(String value) {
            addCriterion("names <", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesLessThanOrEqualTo(String value) {
            addCriterion("names <=", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesLike(String value) {
            addCriterion("names like", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesNotLike(String value) {
            addCriterion("names not like", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesIn(List<String> values) {
            addCriterion("names in", values, "names");
            return (Criteria) this;
        }

        public Criteria andNamesNotIn(List<String> values) {
            addCriterion("names not in", values, "names");
            return (Criteria) this;
        }

        public Criteria andNamesBetween(String value1, String value2) {
            addCriterion("names between", value1, value2, "names");
            return (Criteria) this;
        }

        public Criteria andNamesNotBetween(String value1, String value2) {
            addCriterion("names not between", value1, value2, "names");
            return (Criteria) this;
        }

        public Criteria andModify_names_timeIsNull() {
            addCriterion("modify_names_time is null");
            return (Criteria) this;
        }

        public Criteria andModify_names_timeIsNotNull() {
            addCriterion("modify_names_time is not null");
            return (Criteria) this;
        }

        public Criteria andModify_names_timeEqualTo(Date value) {
            addCriterion("modify_names_time =", value, "modify_names_time");
            return (Criteria) this;
        }

        public Criteria andModify_names_timeNotEqualTo(Date value) {
            addCriterion("modify_names_time <>", value, "modify_names_time");
            return (Criteria) this;
        }

        public Criteria andModify_names_timeGreaterThan(Date value) {
            addCriterion("modify_names_time >", value, "modify_names_time");
            return (Criteria) this;
        }

        public Criteria andModify_names_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_names_time >=", value, "modify_names_time");
            return (Criteria) this;
        }

        public Criteria andModify_names_timeLessThan(Date value) {
            addCriterion("modify_names_time <", value, "modify_names_time");
            return (Criteria) this;
        }

        public Criteria andModify_names_timeLessThanOrEqualTo(Date value) {
            addCriterion("modify_names_time <=", value, "modify_names_time");
            return (Criteria) this;
        }

        public Criteria andModify_names_timeIn(List<Date> values) {
            addCriterion("modify_names_time in", values, "modify_names_time");
            return (Criteria) this;
        }

        public Criteria andModify_names_timeNotIn(List<Date> values) {
            addCriterion("modify_names_time not in", values, "modify_names_time");
            return (Criteria) this;
        }

        public Criteria andModify_names_timeBetween(Date value1, Date value2) {
            addCriterion("modify_names_time between", value1, value2, "modify_names_time");
            return (Criteria) this;
        }

        public Criteria andModify_names_timeNotBetween(Date value1, Date value2) {
            addCriterion("modify_names_time not between", value1, value2, "modify_names_time");
            return (Criteria) this;
        }

        public Criteria andVersionsIsNull() {
            addCriterion("versions is null");
            return (Criteria) this;
        }

        public Criteria andVersionsIsNotNull() {
            addCriterion("versions is not null");
            return (Criteria) this;
        }

        public Criteria andVersionsEqualTo(Integer value) {
            addCriterion("versions =", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsNotEqualTo(Integer value) {
            addCriterion("versions <>", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsGreaterThan(Integer value) {
            addCriterion("versions >", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("versions >=", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsLessThan(Integer value) {
            addCriterion("versions <", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsLessThanOrEqualTo(Integer value) {
            addCriterion("versions <=", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsIn(List<Integer> values) {
            addCriterion("versions in", values, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsNotIn(List<Integer> values) {
            addCriterion("versions not in", values, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsBetween(Integer value1, Integer value2) {
            addCriterion("versions between", value1, value2, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsNotBetween(Integer value1, Integer value2) {
            addCriterion("versions not between", value1, value2, "versions");
            return (Criteria) this;
        }

        public Criteria andProvice_codeIsNull() {
            addCriterion("provice_code is null");
            return (Criteria) this;
        }

        public Criteria andProvice_codeIsNotNull() {
            addCriterion("provice_code is not null");
            return (Criteria) this;
        }

        public Criteria andProvice_codeEqualTo(String value) {
            addCriterion("provice_code =", value, "provice_code");
            return (Criteria) this;
        }

        public Criteria andProvice_codeNotEqualTo(String value) {
            addCriterion("provice_code <>", value, "provice_code");
            return (Criteria) this;
        }

        public Criteria andProvice_codeGreaterThan(String value) {
            addCriterion("provice_code >", value, "provice_code");
            return (Criteria) this;
        }

        public Criteria andProvice_codeGreaterThanOrEqualTo(String value) {
            addCriterion("provice_code >=", value, "provice_code");
            return (Criteria) this;
        }

        public Criteria andProvice_codeLessThan(String value) {
            addCriterion("provice_code <", value, "provice_code");
            return (Criteria) this;
        }

        public Criteria andProvice_codeLessThanOrEqualTo(String value) {
            addCriterion("provice_code <=", value, "provice_code");
            return (Criteria) this;
        }

        public Criteria andProvice_codeLike(String value) {
            addCriterion("provice_code like", value, "provice_code");
            return (Criteria) this;
        }

        public Criteria andProvice_codeNotLike(String value) {
            addCriterion("provice_code not like", value, "provice_code");
            return (Criteria) this;
        }

        public Criteria andProvice_codeIn(List<String> values) {
            addCriterion("provice_code in", values, "provice_code");
            return (Criteria) this;
        }

        public Criteria andProvice_codeNotIn(List<String> values) {
            addCriterion("provice_code not in", values, "provice_code");
            return (Criteria) this;
        }

        public Criteria andProvice_codeBetween(String value1, String value2) {
            addCriterion("provice_code between", value1, value2, "provice_code");
            return (Criteria) this;
        }

        public Criteria andProvice_codeNotBetween(String value1, String value2) {
            addCriterion("provice_code not between", value1, value2, "provice_code");
            return (Criteria) this;
        }

        public Criteria andMobileLikeInsensitive(String value) {
            addCriterion("upper(mobile) like", value.toUpperCase(), "mobile");
            return (Criteria) this;
        }

        public Criteria andPwdLikeInsensitive(String value) {
            addCriterion("upper(pwd) like", value.toUpperCase(), "pwd");
            return (Criteria) this;
        }

        public Criteria andMain_head_photo_urlLikeInsensitive(String value) {
            addCriterion("upper(main_head_photo_url) like", value.toUpperCase(), "main_head_photo_url");
            return (Criteria) this;
        }

        public Criteria andNicknameLikeInsensitive(String value) {
            addCriterion("upper(nickname) like", value.toUpperCase(), "nickname");
            return (Criteria) this;
        }

        public Criteria andConstellationLikeInsensitive(String value) {
            addCriterion("upper(constellation) like", value.toUpperCase(), "constellation");
            return (Criteria) this;
        }

        public Criteria andTreat_numberLikeInsensitive(String value) {
            addCriterion("upper(treat_number) like", value.toUpperCase(), "treat_number");
            return (Criteria) this;
        }

        public Criteria andCity_codeLikeInsensitive(String value) {
            addCriterion("upper(city_code) like", value.toUpperCase(), "city_code");
            return (Criteria) this;
        }

        public Criteria andUser_signLikeInsensitive(String value) {
            addCriterion("upper(user_sign) like", value.toUpperCase(), "user_sign");
            return (Criteria) this;
        }

        public Criteria andCoordinateLikeInsensitive(String value) {
            addCriterion("upper(coordinate) like", value.toUpperCase(), "coordinate");
            return (Criteria) this;
        }

        public Criteria andMobile_deviceLikeInsensitive(String value) {
            addCriterion("upper(mobile_device) like", value.toUpperCase(), "mobile_device");
            return (Criteria) this;
        }

        public Criteria andUser_sourceLikeInsensitive(String value) {
            addCriterion("upper(user_source) like", value.toUpperCase(), "user_source");
            return (Criteria) this;
        }

        public Criteria andNamesLikeInsensitive(String value) {
            addCriterion("upper(names) like", value.toUpperCase(), "names");
            return (Criteria) this;
        }

        public Criteria andProvice_codeLikeInsensitive(String value) {
            addCriterion("upper(provice_code) like", value.toUpperCase(), "provice_code");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * 
     * @author 菠萝大象
     * @version 1.0 2015-10-30
     */
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