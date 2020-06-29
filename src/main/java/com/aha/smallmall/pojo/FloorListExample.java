package com.aha.smallmall.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FloorListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FloorListExample() {
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

        public Criteria andFlIdIsNull() {
            addCriterion("fl_id is null");
            return (Criteria) this;
        }

        public Criteria andFlIdIsNotNull() {
            addCriterion("fl_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlIdEqualTo(String value) {
            addCriterion("fl_id =", value, "flId");
            return (Criteria) this;
        }

        public Criteria andFlIdNotEqualTo(String value) {
            addCriterion("fl_id <>", value, "flId");
            return (Criteria) this;
        }

        public Criteria andFlIdGreaterThan(String value) {
            addCriterion("fl_id >", value, "flId");
            return (Criteria) this;
        }

        public Criteria andFlIdGreaterThanOrEqualTo(String value) {
            addCriterion("fl_id >=", value, "flId");
            return (Criteria) this;
        }

        public Criteria andFlIdLessThan(String value) {
            addCriterion("fl_id <", value, "flId");
            return (Criteria) this;
        }

        public Criteria andFlIdLessThanOrEqualTo(String value) {
            addCriterion("fl_id <=", value, "flId");
            return (Criteria) this;
        }

        public Criteria andFlIdLike(String value) {
            addCriterion("fl_id like", value, "flId");
            return (Criteria) this;
        }

        public Criteria andFlIdNotLike(String value) {
            addCriterion("fl_id not like", value, "flId");
            return (Criteria) this;
        }

        public Criteria andFlIdIn(List<String> values) {
            addCriterion("fl_id in", values, "flId");
            return (Criteria) this;
        }

        public Criteria andFlIdNotIn(List<String> values) {
            addCriterion("fl_id not in", values, "flId");
            return (Criteria) this;
        }

        public Criteria andFlIdBetween(String value1, String value2) {
            addCriterion("fl_id between", value1, value2, "flId");
            return (Criteria) this;
        }

        public Criteria andFlIdNotBetween(String value1, String value2) {
            addCriterion("fl_id not between", value1, value2, "flId");
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

        public Criteria andImageSrcIsNull() {
            addCriterion("image_src is null");
            return (Criteria) this;
        }

        public Criteria andImageSrcIsNotNull() {
            addCriterion("image_src is not null");
            return (Criteria) this;
        }

        public Criteria andImageSrcEqualTo(String value) {
            addCriterion("image_src =", value, "imageSrc");
            return (Criteria) this;
        }

        public Criteria andImageSrcNotEqualTo(String value) {
            addCriterion("image_src <>", value, "imageSrc");
            return (Criteria) this;
        }

        public Criteria andImageSrcGreaterThan(String value) {
            addCriterion("image_src >", value, "imageSrc");
            return (Criteria) this;
        }

        public Criteria andImageSrcGreaterThanOrEqualTo(String value) {
            addCriterion("image_src >=", value, "imageSrc");
            return (Criteria) this;
        }

        public Criteria andImageSrcLessThan(String value) {
            addCriterion("image_src <", value, "imageSrc");
            return (Criteria) this;
        }

        public Criteria andImageSrcLessThanOrEqualTo(String value) {
            addCriterion("image_src <=", value, "imageSrc");
            return (Criteria) this;
        }

        public Criteria andImageSrcLike(String value) {
            addCriterion("image_src like", value, "imageSrc");
            return (Criteria) this;
        }

        public Criteria andImageSrcNotLike(String value) {
            addCriterion("image_src not like", value, "imageSrc");
            return (Criteria) this;
        }

        public Criteria andImageSrcIn(List<String> values) {
            addCriterion("image_src in", values, "imageSrc");
            return (Criteria) this;
        }

        public Criteria andImageSrcNotIn(List<String> values) {
            addCriterion("image_src not in", values, "imageSrc");
            return (Criteria) this;
        }

        public Criteria andImageSrcBetween(String value1, String value2) {
            addCriterion("image_src between", value1, value2, "imageSrc");
            return (Criteria) this;
        }

        public Criteria andImageSrcNotBetween(String value1, String value2) {
            addCriterion("image_src not between", value1, value2, "imageSrc");
            return (Criteria) this;
        }

        public Criteria andImageWidthIsNull() {
            addCriterion("image_width is null");
            return (Criteria) this;
        }

        public Criteria andImageWidthIsNotNull() {
            addCriterion("image_width is not null");
            return (Criteria) this;
        }

        public Criteria andImageWidthEqualTo(String value) {
            addCriterion("image_width =", value, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andImageWidthNotEqualTo(String value) {
            addCriterion("image_width <>", value, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andImageWidthGreaterThan(String value) {
            addCriterion("image_width >", value, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andImageWidthGreaterThanOrEqualTo(String value) {
            addCriterion("image_width >=", value, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andImageWidthLessThan(String value) {
            addCriterion("image_width <", value, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andImageWidthLessThanOrEqualTo(String value) {
            addCriterion("image_width <=", value, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andImageWidthLike(String value) {
            addCriterion("image_width like", value, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andImageWidthNotLike(String value) {
            addCriterion("image_width not like", value, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andImageWidthIn(List<String> values) {
            addCriterion("image_width in", values, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andImageWidthNotIn(List<String> values) {
            addCriterion("image_width not in", values, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andImageWidthBetween(String value1, String value2) {
            addCriterion("image_width between", value1, value2, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andImageWidthNotBetween(String value1, String value2) {
            addCriterion("image_width not between", value1, value2, "imageWidth");
            return (Criteria) this;
        }

        public Criteria andFlNameIsNull() {
            addCriterion("fl_name is null");
            return (Criteria) this;
        }

        public Criteria andFlNameIsNotNull() {
            addCriterion("fl_name is not null");
            return (Criteria) this;
        }

        public Criteria andFlNameEqualTo(String value) {
            addCriterion("fl_name =", value, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameNotEqualTo(String value) {
            addCriterion("fl_name <>", value, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameGreaterThan(String value) {
            addCriterion("fl_name >", value, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameGreaterThanOrEqualTo(String value) {
            addCriterion("fl_name >=", value, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameLessThan(String value) {
            addCriterion("fl_name <", value, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameLessThanOrEqualTo(String value) {
            addCriterion("fl_name <=", value, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameLike(String value) {
            addCriterion("fl_name like", value, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameNotLike(String value) {
            addCriterion("fl_name not like", value, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameIn(List<String> values) {
            addCriterion("fl_name in", values, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameNotIn(List<String> values) {
            addCriterion("fl_name not in", values, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameBetween(String value1, String value2) {
            addCriterion("fl_name between", value1, value2, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameNotBetween(String value1, String value2) {
            addCriterion("fl_name not between", value1, value2, "flName");
            return (Criteria) this;
        }

        public Criteria andFtQueryIsNull() {
            addCriterion("ft_query is null");
            return (Criteria) this;
        }

        public Criteria andFtQueryIsNotNull() {
            addCriterion("ft_query is not null");
            return (Criteria) this;
        }

        public Criteria andFtQueryEqualTo(String value) {
            addCriterion("ft_query =", value, "ftQuery");
            return (Criteria) this;
        }

        public Criteria andFtQueryNotEqualTo(String value) {
            addCriterion("ft_query <>", value, "ftQuery");
            return (Criteria) this;
        }

        public Criteria andFtQueryGreaterThan(String value) {
            addCriterion("ft_query >", value, "ftQuery");
            return (Criteria) this;
        }

        public Criteria andFtQueryGreaterThanOrEqualTo(String value) {
            addCriterion("ft_query >=", value, "ftQuery");
            return (Criteria) this;
        }

        public Criteria andFtQueryLessThan(String value) {
            addCriterion("ft_query <", value, "ftQuery");
            return (Criteria) this;
        }

        public Criteria andFtQueryLessThanOrEqualTo(String value) {
            addCriterion("ft_query <=", value, "ftQuery");
            return (Criteria) this;
        }

        public Criteria andFtQueryLike(String value) {
            addCriterion("ft_query like", value, "ftQuery");
            return (Criteria) this;
        }

        public Criteria andFtQueryNotLike(String value) {
            addCriterion("ft_query not like", value, "ftQuery");
            return (Criteria) this;
        }

        public Criteria andFtQueryIn(List<String> values) {
            addCriterion("ft_query in", values, "ftQuery");
            return (Criteria) this;
        }

        public Criteria andFtQueryNotIn(List<String> values) {
            addCriterion("ft_query not in", values, "ftQuery");
            return (Criteria) this;
        }

        public Criteria andFtQueryBetween(String value1, String value2) {
            addCriterion("ft_query between", value1, value2, "ftQuery");
            return (Criteria) this;
        }

        public Criteria andFtQueryNotBetween(String value1, String value2) {
            addCriterion("ft_query not between", value1, value2, "ftQuery");
            return (Criteria) this;
        }

        public Criteria andFtIdIsNull() {
            addCriterion("ft_id is null");
            return (Criteria) this;
        }

        public Criteria andFtIdIsNotNull() {
            addCriterion("ft_id is not null");
            return (Criteria) this;
        }

        public Criteria andFtIdEqualTo(String value) {
            addCriterion("ft_id =", value, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtIdNotEqualTo(String value) {
            addCriterion("ft_id <>", value, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtIdGreaterThan(String value) {
            addCriterion("ft_id >", value, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtIdGreaterThanOrEqualTo(String value) {
            addCriterion("ft_id >=", value, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtIdLessThan(String value) {
            addCriterion("ft_id <", value, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtIdLessThanOrEqualTo(String value) {
            addCriterion("ft_id <=", value, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtIdLike(String value) {
            addCriterion("ft_id like", value, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtIdNotLike(String value) {
            addCriterion("ft_id not like", value, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtIdIn(List<String> values) {
            addCriterion("ft_id in", values, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtIdNotIn(List<String> values) {
            addCriterion("ft_id not in", values, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtIdBetween(String value1, String value2) {
            addCriterion("ft_id between", value1, value2, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtIdNotBetween(String value1, String value2) {
            addCriterion("ft_id not between", value1, value2, "ftId");
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