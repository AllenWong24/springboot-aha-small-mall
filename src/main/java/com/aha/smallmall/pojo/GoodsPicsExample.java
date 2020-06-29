package com.aha.smallmall.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsPicsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsPicsExample() {
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

        public Criteria andPicsIdIsNull() {
            addCriterion("pics_id is null");
            return (Criteria) this;
        }

        public Criteria andPicsIdIsNotNull() {
            addCriterion("pics_id is not null");
            return (Criteria) this;
        }

        public Criteria andPicsIdEqualTo(String value) {
            addCriterion("pics_id =", value, "picsId");
            return (Criteria) this;
        }

        public Criteria andPicsIdNotEqualTo(String value) {
            addCriterion("pics_id <>", value, "picsId");
            return (Criteria) this;
        }

        public Criteria andPicsIdGreaterThan(String value) {
            addCriterion("pics_id >", value, "picsId");
            return (Criteria) this;
        }

        public Criteria andPicsIdGreaterThanOrEqualTo(String value) {
            addCriterion("pics_id >=", value, "picsId");
            return (Criteria) this;
        }

        public Criteria andPicsIdLessThan(String value) {
            addCriterion("pics_id <", value, "picsId");
            return (Criteria) this;
        }

        public Criteria andPicsIdLessThanOrEqualTo(String value) {
            addCriterion("pics_id <=", value, "picsId");
            return (Criteria) this;
        }

        public Criteria andPicsIdLike(String value) {
            addCriterion("pics_id like", value, "picsId");
            return (Criteria) this;
        }

        public Criteria andPicsIdNotLike(String value) {
            addCriterion("pics_id not like", value, "picsId");
            return (Criteria) this;
        }

        public Criteria andPicsIdIn(List<String> values) {
            addCriterion("pics_id in", values, "picsId");
            return (Criteria) this;
        }

        public Criteria andPicsIdNotIn(List<String> values) {
            addCriterion("pics_id not in", values, "picsId");
            return (Criteria) this;
        }

        public Criteria andPicsIdBetween(String value1, String value2) {
            addCriterion("pics_id between", value1, value2, "picsId");
            return (Criteria) this;
        }

        public Criteria andPicsIdNotBetween(String value1, String value2) {
            addCriterion("pics_id not between", value1, value2, "picsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andPicsBigIsNull() {
            addCriterion("pics_big is null");
            return (Criteria) this;
        }

        public Criteria andPicsBigIsNotNull() {
            addCriterion("pics_big is not null");
            return (Criteria) this;
        }

        public Criteria andPicsBigEqualTo(String value) {
            addCriterion("pics_big =", value, "picsBig");
            return (Criteria) this;
        }

        public Criteria andPicsBigNotEqualTo(String value) {
            addCriterion("pics_big <>", value, "picsBig");
            return (Criteria) this;
        }

        public Criteria andPicsBigGreaterThan(String value) {
            addCriterion("pics_big >", value, "picsBig");
            return (Criteria) this;
        }

        public Criteria andPicsBigGreaterThanOrEqualTo(String value) {
            addCriterion("pics_big >=", value, "picsBig");
            return (Criteria) this;
        }

        public Criteria andPicsBigLessThan(String value) {
            addCriterion("pics_big <", value, "picsBig");
            return (Criteria) this;
        }

        public Criteria andPicsBigLessThanOrEqualTo(String value) {
            addCriterion("pics_big <=", value, "picsBig");
            return (Criteria) this;
        }

        public Criteria andPicsBigLike(String value) {
            addCriterion("pics_big like", value, "picsBig");
            return (Criteria) this;
        }

        public Criteria andPicsBigNotLike(String value) {
            addCriterion("pics_big not like", value, "picsBig");
            return (Criteria) this;
        }

        public Criteria andPicsBigIn(List<String> values) {
            addCriterion("pics_big in", values, "picsBig");
            return (Criteria) this;
        }

        public Criteria andPicsBigNotIn(List<String> values) {
            addCriterion("pics_big not in", values, "picsBig");
            return (Criteria) this;
        }

        public Criteria andPicsBigBetween(String value1, String value2) {
            addCriterion("pics_big between", value1, value2, "picsBig");
            return (Criteria) this;
        }

        public Criteria andPicsBigNotBetween(String value1, String value2) {
            addCriterion("pics_big not between", value1, value2, "picsBig");
            return (Criteria) this;
        }

        public Criteria andPicsMidIsNull() {
            addCriterion("pics_mid is null");
            return (Criteria) this;
        }

        public Criteria andPicsMidIsNotNull() {
            addCriterion("pics_mid is not null");
            return (Criteria) this;
        }

        public Criteria andPicsMidEqualTo(String value) {
            addCriterion("pics_mid =", value, "picsMid");
            return (Criteria) this;
        }

        public Criteria andPicsMidNotEqualTo(String value) {
            addCriterion("pics_mid <>", value, "picsMid");
            return (Criteria) this;
        }

        public Criteria andPicsMidGreaterThan(String value) {
            addCriterion("pics_mid >", value, "picsMid");
            return (Criteria) this;
        }

        public Criteria andPicsMidGreaterThanOrEqualTo(String value) {
            addCriterion("pics_mid >=", value, "picsMid");
            return (Criteria) this;
        }

        public Criteria andPicsMidLessThan(String value) {
            addCriterion("pics_mid <", value, "picsMid");
            return (Criteria) this;
        }

        public Criteria andPicsMidLessThanOrEqualTo(String value) {
            addCriterion("pics_mid <=", value, "picsMid");
            return (Criteria) this;
        }

        public Criteria andPicsMidLike(String value) {
            addCriterion("pics_mid like", value, "picsMid");
            return (Criteria) this;
        }

        public Criteria andPicsMidNotLike(String value) {
            addCriterion("pics_mid not like", value, "picsMid");
            return (Criteria) this;
        }

        public Criteria andPicsMidIn(List<String> values) {
            addCriterion("pics_mid in", values, "picsMid");
            return (Criteria) this;
        }

        public Criteria andPicsMidNotIn(List<String> values) {
            addCriterion("pics_mid not in", values, "picsMid");
            return (Criteria) this;
        }

        public Criteria andPicsMidBetween(String value1, String value2) {
            addCriterion("pics_mid between", value1, value2, "picsMid");
            return (Criteria) this;
        }

        public Criteria andPicsMidNotBetween(String value1, String value2) {
            addCriterion("pics_mid not between", value1, value2, "picsMid");
            return (Criteria) this;
        }

        public Criteria andPicsSmaIsNull() {
            addCriterion("pics_sma is null");
            return (Criteria) this;
        }

        public Criteria andPicsSmaIsNotNull() {
            addCriterion("pics_sma is not null");
            return (Criteria) this;
        }

        public Criteria andPicsSmaEqualTo(String value) {
            addCriterion("pics_sma =", value, "picsSma");
            return (Criteria) this;
        }

        public Criteria andPicsSmaNotEqualTo(String value) {
            addCriterion("pics_sma <>", value, "picsSma");
            return (Criteria) this;
        }

        public Criteria andPicsSmaGreaterThan(String value) {
            addCriterion("pics_sma >", value, "picsSma");
            return (Criteria) this;
        }

        public Criteria andPicsSmaGreaterThanOrEqualTo(String value) {
            addCriterion("pics_sma >=", value, "picsSma");
            return (Criteria) this;
        }

        public Criteria andPicsSmaLessThan(String value) {
            addCriterion("pics_sma <", value, "picsSma");
            return (Criteria) this;
        }

        public Criteria andPicsSmaLessThanOrEqualTo(String value) {
            addCriterion("pics_sma <=", value, "picsSma");
            return (Criteria) this;
        }

        public Criteria andPicsSmaLike(String value) {
            addCriterion("pics_sma like", value, "picsSma");
            return (Criteria) this;
        }

        public Criteria andPicsSmaNotLike(String value) {
            addCriterion("pics_sma not like", value, "picsSma");
            return (Criteria) this;
        }

        public Criteria andPicsSmaIn(List<String> values) {
            addCriterion("pics_sma in", values, "picsSma");
            return (Criteria) this;
        }

        public Criteria andPicsSmaNotIn(List<String> values) {
            addCriterion("pics_sma not in", values, "picsSma");
            return (Criteria) this;
        }

        public Criteria andPicsSmaBetween(String value1, String value2) {
            addCriterion("pics_sma between", value1, value2, "picsSma");
            return (Criteria) this;
        }

        public Criteria andPicsSmaNotBetween(String value1, String value2) {
            addCriterion("pics_sma not between", value1, value2, "picsSma");
            return (Criteria) this;
        }
    }

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