package com.aha.smallmall.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CategoriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoriesExample() {
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

        public Criteria andCatIdIsNull() {
            addCriterion("cat_id is null");
            return (Criteria) this;
        }

        public Criteria andCatIdIsNotNull() {
            addCriterion("cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatIdEqualTo(String value) {
            addCriterion("cat_id =", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotEqualTo(String value) {
            addCriterion("cat_id <>", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThan(String value) {
            addCriterion("cat_id >", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThanOrEqualTo(String value) {
            addCriterion("cat_id >=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThan(String value) {
            addCriterion("cat_id <", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThanOrEqualTo(String value) {
            addCriterion("cat_id <=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLike(String value) {
            addCriterion("cat_id like", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotLike(String value) {
            addCriterion("cat_id not like", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdIn(List<String> values) {
            addCriterion("cat_id in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotIn(List<String> values) {
            addCriterion("cat_id not in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdBetween(String value1, String value2) {
            addCriterion("cat_id between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotBetween(String value1, String value2) {
            addCriterion("cat_id not between", value1, value2, "catId");
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

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andCatNameIsNull() {
            addCriterion("cat_name is null");
            return (Criteria) this;
        }

        public Criteria andCatNameIsNotNull() {
            addCriterion("cat_name is not null");
            return (Criteria) this;
        }

        public Criteria andCatNameEqualTo(String value) {
            addCriterion("cat_name =", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotEqualTo(String value) {
            addCriterion("cat_name <>", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameGreaterThan(String value) {
            addCriterion("cat_name >", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameGreaterThanOrEqualTo(String value) {
            addCriterion("cat_name >=", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLessThan(String value) {
            addCriterion("cat_name <", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLessThanOrEqualTo(String value) {
            addCriterion("cat_name <=", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLike(String value) {
            addCriterion("cat_name like", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotLike(String value) {
            addCriterion("cat_name not like", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameIn(List<String> values) {
            addCriterion("cat_name in", values, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotIn(List<String> values) {
            addCriterion("cat_name not in", values, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameBetween(String value1, String value2) {
            addCriterion("cat_name between", value1, value2, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotBetween(String value1, String value2) {
            addCriterion("cat_name not between", value1, value2, "catName");
            return (Criteria) this;
        }

        public Criteria andCatPidIsNull() {
            addCriterion("cat_pid is null");
            return (Criteria) this;
        }

        public Criteria andCatPidIsNotNull() {
            addCriterion("cat_pid is not null");
            return (Criteria) this;
        }

        public Criteria andCatPidEqualTo(String value) {
            addCriterion("cat_pid =", value, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatPidNotEqualTo(String value) {
            addCriterion("cat_pid <>", value, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatPidGreaterThan(String value) {
            addCriterion("cat_pid >", value, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatPidGreaterThanOrEqualTo(String value) {
            addCriterion("cat_pid >=", value, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatPidLessThan(String value) {
            addCriterion("cat_pid <", value, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatPidLessThanOrEqualTo(String value) {
            addCriterion("cat_pid <=", value, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatPidLike(String value) {
            addCriterion("cat_pid like", value, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatPidNotLike(String value) {
            addCriterion("cat_pid not like", value, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatPidIn(List<String> values) {
            addCriterion("cat_pid in", values, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatPidNotIn(List<String> values) {
            addCriterion("cat_pid not in", values, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatPidBetween(String value1, String value2) {
            addCriterion("cat_pid between", value1, value2, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatPidNotBetween(String value1, String value2) {
            addCriterion("cat_pid not between", value1, value2, "catPid");
            return (Criteria) this;
        }

        public Criteria andCatLevelIsNull() {
            addCriterion("cat_level is null");
            return (Criteria) this;
        }

        public Criteria andCatLevelIsNotNull() {
            addCriterion("cat_level is not null");
            return (Criteria) this;
        }

        public Criteria andCatLevelEqualTo(Integer value) {
            addCriterion("cat_level =", value, "catLevel");
            return (Criteria) this;
        }

        public Criteria andCatLevelNotEqualTo(Integer value) {
            addCriterion("cat_level <>", value, "catLevel");
            return (Criteria) this;
        }

        public Criteria andCatLevelGreaterThan(Integer value) {
            addCriterion("cat_level >", value, "catLevel");
            return (Criteria) this;
        }

        public Criteria andCatLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("cat_level >=", value, "catLevel");
            return (Criteria) this;
        }

        public Criteria andCatLevelLessThan(Integer value) {
            addCriterion("cat_level <", value, "catLevel");
            return (Criteria) this;
        }

        public Criteria andCatLevelLessThanOrEqualTo(Integer value) {
            addCriterion("cat_level <=", value, "catLevel");
            return (Criteria) this;
        }

        public Criteria andCatLevelIn(List<Integer> values) {
            addCriterion("cat_level in", values, "catLevel");
            return (Criteria) this;
        }

        public Criteria andCatLevelNotIn(List<Integer> values) {
            addCriterion("cat_level not in", values, "catLevel");
            return (Criteria) this;
        }

        public Criteria andCatLevelBetween(Integer value1, Integer value2) {
            addCriterion("cat_level between", value1, value2, "catLevel");
            return (Criteria) this;
        }

        public Criteria andCatLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("cat_level not between", value1, value2, "catLevel");
            return (Criteria) this;
        }

        public Criteria andCatKeyIsNull() {
            addCriterion("cat_key is null");
            return (Criteria) this;
        }

        public Criteria andCatKeyIsNotNull() {
            addCriterion("cat_key is not null");
            return (Criteria) this;
        }

        public Criteria andCatKeyEqualTo(String value) {
            addCriterion("cat_key =", value, "catKey");
            return (Criteria) this;
        }

        public Criteria andCatKeyNotEqualTo(String value) {
            addCriterion("cat_key <>", value, "catKey");
            return (Criteria) this;
        }

        public Criteria andCatKeyGreaterThan(String value) {
            addCriterion("cat_key >", value, "catKey");
            return (Criteria) this;
        }

        public Criteria andCatKeyGreaterThanOrEqualTo(String value) {
            addCriterion("cat_key >=", value, "catKey");
            return (Criteria) this;
        }

        public Criteria andCatKeyLessThan(String value) {
            addCriterion("cat_key <", value, "catKey");
            return (Criteria) this;
        }

        public Criteria andCatKeyLessThanOrEqualTo(String value) {
            addCriterion("cat_key <=", value, "catKey");
            return (Criteria) this;
        }

        public Criteria andCatKeyLike(String value) {
            addCriterion("cat_key like", value, "catKey");
            return (Criteria) this;
        }

        public Criteria andCatKeyNotLike(String value) {
            addCriterion("cat_key not like", value, "catKey");
            return (Criteria) this;
        }

        public Criteria andCatKeyIn(List<String> values) {
            addCriterion("cat_key in", values, "catKey");
            return (Criteria) this;
        }

        public Criteria andCatKeyNotIn(List<String> values) {
            addCriterion("cat_key not in", values, "catKey");
            return (Criteria) this;
        }

        public Criteria andCatKeyBetween(String value1, String value2) {
            addCriterion("cat_key between", value1, value2, "catKey");
            return (Criteria) this;
        }

        public Criteria andCatKeyNotBetween(String value1, String value2) {
            addCriterion("cat_key not between", value1, value2, "catKey");
            return (Criteria) this;
        }

        public Criteria andCatIconIsNull() {
            addCriterion("cat_icon is null");
            return (Criteria) this;
        }

        public Criteria andCatIconIsNotNull() {
            addCriterion("cat_icon is not null");
            return (Criteria) this;
        }

        public Criteria andCatIconEqualTo(String value) {
            addCriterion("cat_icon =", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconNotEqualTo(String value) {
            addCriterion("cat_icon <>", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconGreaterThan(String value) {
            addCriterion("cat_icon >", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconGreaterThanOrEqualTo(String value) {
            addCriterion("cat_icon >=", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconLessThan(String value) {
            addCriterion("cat_icon <", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconLessThanOrEqualTo(String value) {
            addCriterion("cat_icon <=", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconLike(String value) {
            addCriterion("cat_icon like", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconNotLike(String value) {
            addCriterion("cat_icon not like", value, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconIn(List<String> values) {
            addCriterion("cat_icon in", values, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconNotIn(List<String> values) {
            addCriterion("cat_icon not in", values, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconBetween(String value1, String value2) {
            addCriterion("cat_icon between", value1, value2, "catIcon");
            return (Criteria) this;
        }

        public Criteria andCatIconNotBetween(String value1, String value2) {
            addCriterion("cat_icon not between", value1, value2, "catIcon");
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