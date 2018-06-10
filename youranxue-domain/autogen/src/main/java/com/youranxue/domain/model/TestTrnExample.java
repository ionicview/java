package com.youranxue.domain.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestTrnExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table youranxue.test_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table youranxue.test_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table youranxue.test_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.test_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	public TestTrnExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.test_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.test_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.test_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.test_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.test_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.test_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.test_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.test_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.test_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table youranxue.test_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table youranxue.test_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
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

		public Criteria andTestIdIsNull() {
			addCriterion("test_id is null");
			return (Criteria) this;
		}

		public Criteria andTestIdIsNotNull() {
			addCriterion("test_id is not null");
			return (Criteria) this;
		}

		public Criteria andTestIdEqualTo(Long value) {
			addCriterion("test_id =", value, "testId");
			return (Criteria) this;
		}

		public Criteria andTestIdNotEqualTo(Long value) {
			addCriterion("test_id <>", value, "testId");
			return (Criteria) this;
		}

		public Criteria andTestIdGreaterThan(Long value) {
			addCriterion("test_id >", value, "testId");
			return (Criteria) this;
		}

		public Criteria andTestIdGreaterThanOrEqualTo(Long value) {
			addCriterion("test_id >=", value, "testId");
			return (Criteria) this;
		}

		public Criteria andTestIdLessThan(Long value) {
			addCriterion("test_id <", value, "testId");
			return (Criteria) this;
		}

		public Criteria andTestIdLessThanOrEqualTo(Long value) {
			addCriterion("test_id <=", value, "testId");
			return (Criteria) this;
		}

		public Criteria andTestIdIn(List<Long> values) {
			addCriterion("test_id in", values, "testId");
			return (Criteria) this;
		}

		public Criteria andTestIdNotIn(List<Long> values) {
			addCriterion("test_id not in", values, "testId");
			return (Criteria) this;
		}

		public Criteria andTestIdBetween(Long value1, Long value2) {
			addCriterion("test_id between", value1, value2, "testId");
			return (Criteria) this;
		}

		public Criteria andTestIdNotBetween(Long value1, Long value2) {
			addCriterion("test_id not between", value1, value2, "testId");
			return (Criteria) this;
		}

		public Criteria andChapterIdIsNull() {
			addCriterion("chapter_id is null");
			return (Criteria) this;
		}

		public Criteria andChapterIdIsNotNull() {
			addCriterion("chapter_id is not null");
			return (Criteria) this;
		}

		public Criteria andChapterIdEqualTo(Integer value) {
			addCriterion("chapter_id =", value, "chapterId");
			return (Criteria) this;
		}

		public Criteria andChapterIdNotEqualTo(Integer value) {
			addCriterion("chapter_id <>", value, "chapterId");
			return (Criteria) this;
		}

		public Criteria andChapterIdGreaterThan(Integer value) {
			addCriterion("chapter_id >", value, "chapterId");
			return (Criteria) this;
		}

		public Criteria andChapterIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("chapter_id >=", value, "chapterId");
			return (Criteria) this;
		}

		public Criteria andChapterIdLessThan(Integer value) {
			addCriterion("chapter_id <", value, "chapterId");
			return (Criteria) this;
		}

		public Criteria andChapterIdLessThanOrEqualTo(Integer value) {
			addCriterion("chapter_id <=", value, "chapterId");
			return (Criteria) this;
		}

		public Criteria andChapterIdIn(List<Integer> values) {
			addCriterion("chapter_id in", values, "chapterId");
			return (Criteria) this;
		}

		public Criteria andChapterIdNotIn(List<Integer> values) {
			addCriterion("chapter_id not in", values, "chapterId");
			return (Criteria) this;
		}

		public Criteria andChapterIdBetween(Integer value1, Integer value2) {
			addCriterion("chapter_id between", value1, value2, "chapterId");
			return (Criteria) this;
		}

		public Criteria andChapterIdNotBetween(Integer value1, Integer value2) {
			addCriterion("chapter_id not between", value1, value2, "chapterId");
			return (Criteria) this;
		}

		public Criteria andSectionIdIsNull() {
			addCriterion("section_id is null");
			return (Criteria) this;
		}

		public Criteria andSectionIdIsNotNull() {
			addCriterion("section_id is not null");
			return (Criteria) this;
		}

		public Criteria andSectionIdEqualTo(Integer value) {
			addCriterion("section_id =", value, "sectionId");
			return (Criteria) this;
		}

		public Criteria andSectionIdNotEqualTo(Integer value) {
			addCriterion("section_id <>", value, "sectionId");
			return (Criteria) this;
		}

		public Criteria andSectionIdGreaterThan(Integer value) {
			addCriterion("section_id >", value, "sectionId");
			return (Criteria) this;
		}

		public Criteria andSectionIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("section_id >=", value, "sectionId");
			return (Criteria) this;
		}

		public Criteria andSectionIdLessThan(Integer value) {
			addCriterion("section_id <", value, "sectionId");
			return (Criteria) this;
		}

		public Criteria andSectionIdLessThanOrEqualTo(Integer value) {
			addCriterion("section_id <=", value, "sectionId");
			return (Criteria) this;
		}

		public Criteria andSectionIdIn(List<Integer> values) {
			addCriterion("section_id in", values, "sectionId");
			return (Criteria) this;
		}

		public Criteria andSectionIdNotIn(List<Integer> values) {
			addCriterion("section_id not in", values, "sectionId");
			return (Criteria) this;
		}

		public Criteria andSectionIdBetween(Integer value1, Integer value2) {
			addCriterion("section_id between", value1, value2, "sectionId");
			return (Criteria) this;
		}

		public Criteria andSectionIdNotBetween(Integer value1, Integer value2) {
			addCriterion("section_id not between", value1, value2, "sectionId");
			return (Criteria) this;
		}

		public Criteria andTestNameIsNull() {
			addCriterion("test_name is null");
			return (Criteria) this;
		}

		public Criteria andTestNameIsNotNull() {
			addCriterion("test_name is not null");
			return (Criteria) this;
		}

		public Criteria andTestNameEqualTo(String value) {
			addCriterion("test_name =", value, "testName");
			return (Criteria) this;
		}

		public Criteria andTestNameNotEqualTo(String value) {
			addCriterion("test_name <>", value, "testName");
			return (Criteria) this;
		}

		public Criteria andTestNameGreaterThan(String value) {
			addCriterion("test_name >", value, "testName");
			return (Criteria) this;
		}

		public Criteria andTestNameGreaterThanOrEqualTo(String value) {
			addCriterion("test_name >=", value, "testName");
			return (Criteria) this;
		}

		public Criteria andTestNameLessThan(String value) {
			addCriterion("test_name <", value, "testName");
			return (Criteria) this;
		}

		public Criteria andTestNameLessThanOrEqualTo(String value) {
			addCriterion("test_name <=", value, "testName");
			return (Criteria) this;
		}

		public Criteria andTestNameLike(String value) {
			addCriterion("test_name like", value, "testName");
			return (Criteria) this;
		}

		public Criteria andTestNameNotLike(String value) {
			addCriterion("test_name not like", value, "testName");
			return (Criteria) this;
		}

		public Criteria andTestNameIn(List<String> values) {
			addCriterion("test_name in", values, "testName");
			return (Criteria) this;
		}

		public Criteria andTestNameNotIn(List<String> values) {
			addCriterion("test_name not in", values, "testName");
			return (Criteria) this;
		}

		public Criteria andTestNameBetween(String value1, String value2) {
			addCriterion("test_name between", value1, value2, "testName");
			return (Criteria) this;
		}

		public Criteria andTestNameNotBetween(String value1, String value2) {
			addCriterion("test_name not between", value1, value2, "testName");
			return (Criteria) this;
		}

		public Criteria andTotalScoreIsNull() {
			addCriterion("total_score is null");
			return (Criteria) this;
		}

		public Criteria andTotalScoreIsNotNull() {
			addCriterion("total_score is not null");
			return (Criteria) this;
		}

		public Criteria andTotalScoreEqualTo(Integer value) {
			addCriterion("total_score =", value, "totalScore");
			return (Criteria) this;
		}

		public Criteria andTotalScoreNotEqualTo(Integer value) {
			addCriterion("total_score <>", value, "totalScore");
			return (Criteria) this;
		}

		public Criteria andTotalScoreGreaterThan(Integer value) {
			addCriterion("total_score >", value, "totalScore");
			return (Criteria) this;
		}

		public Criteria andTotalScoreGreaterThanOrEqualTo(Integer value) {
			addCriterion("total_score >=", value, "totalScore");
			return (Criteria) this;
		}

		public Criteria andTotalScoreLessThan(Integer value) {
			addCriterion("total_score <", value, "totalScore");
			return (Criteria) this;
		}

		public Criteria andTotalScoreLessThanOrEqualTo(Integer value) {
			addCriterion("total_score <=", value, "totalScore");
			return (Criteria) this;
		}

		public Criteria andTotalScoreIn(List<Integer> values) {
			addCriterion("total_score in", values, "totalScore");
			return (Criteria) this;
		}

		public Criteria andTotalScoreNotIn(List<Integer> values) {
			addCriterion("total_score not in", values, "totalScore");
			return (Criteria) this;
		}

		public Criteria andTotalScoreBetween(Integer value1, Integer value2) {
			addCriterion("total_score between", value1, value2, "totalScore");
			return (Criteria) this;
		}

		public Criteria andTotalScoreNotBetween(Integer value1, Integer value2) {
			addCriterion("total_score not between", value1, value2, "totalScore");
			return (Criteria) this;
		}

		public Criteria andTestDurationMinIsNull() {
			addCriterion("test_duration_min is null");
			return (Criteria) this;
		}

		public Criteria andTestDurationMinIsNotNull() {
			addCriterion("test_duration_min is not null");
			return (Criteria) this;
		}

		public Criteria andTestDurationMinEqualTo(Integer value) {
			addCriterion("test_duration_min =", value, "testDurationMin");
			return (Criteria) this;
		}

		public Criteria andTestDurationMinNotEqualTo(Integer value) {
			addCriterion("test_duration_min <>", value, "testDurationMin");
			return (Criteria) this;
		}

		public Criteria andTestDurationMinGreaterThan(Integer value) {
			addCriterion("test_duration_min >", value, "testDurationMin");
			return (Criteria) this;
		}

		public Criteria andTestDurationMinGreaterThanOrEqualTo(Integer value) {
			addCriterion("test_duration_min >=", value, "testDurationMin");
			return (Criteria) this;
		}

		public Criteria andTestDurationMinLessThan(Integer value) {
			addCriterion("test_duration_min <", value, "testDurationMin");
			return (Criteria) this;
		}

		public Criteria andTestDurationMinLessThanOrEqualTo(Integer value) {
			addCriterion("test_duration_min <=", value, "testDurationMin");
			return (Criteria) this;
		}

		public Criteria andTestDurationMinIn(List<Integer> values) {
			addCriterion("test_duration_min in", values, "testDurationMin");
			return (Criteria) this;
		}

		public Criteria andTestDurationMinNotIn(List<Integer> values) {
			addCriterion("test_duration_min not in", values, "testDurationMin");
			return (Criteria) this;
		}

		public Criteria andTestDurationMinBetween(Integer value1, Integer value2) {
			addCriterion("test_duration_min between", value1, value2, "testDurationMin");
			return (Criteria) this;
		}

		public Criteria andTestDurationMinNotBetween(Integer value1, Integer value2) {
			addCriterion("test_duration_min not between", value1, value2, "testDurationMin");
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

		public Criteria andUpdateDateIsNull() {
			addCriterion("update_date is null");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIsNotNull() {
			addCriterion("update_date is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateDateEqualTo(Date value) {
			addCriterion("update_date =", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotEqualTo(Date value) {
			addCriterion("update_date <>", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateGreaterThan(Date value) {
			addCriterion("update_date >", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("update_date >=", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateLessThan(Date value) {
			addCriterion("update_date <", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
			addCriterion("update_date <=", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIn(List<Date> values) {
			addCriterion("update_date in", values, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotIn(List<Date> values) {
			addCriterion("update_date not in", values, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateBetween(Date value1, Date value2) {
			addCriterion("update_date between", value1, value2, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
			addCriterion("update_date not between", value1, value2, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIsNull() {
			addCriterion("update_user is null");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIsNotNull() {
			addCriterion("update_user is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateUserEqualTo(String value) {
			addCriterion("update_user =", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserNotEqualTo(String value) {
			addCriterion("update_user <>", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserGreaterThan(String value) {
			addCriterion("update_user >", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
			addCriterion("update_user >=", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserLessThan(String value) {
			addCriterion("update_user <", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserLessThanOrEqualTo(String value) {
			addCriterion("update_user <=", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserLike(String value) {
			addCriterion("update_user like", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserNotLike(String value) {
			addCriterion("update_user not like", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIn(List<String> values) {
			addCriterion("update_user in", values, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserNotIn(List<String> values) {
			addCriterion("update_user not in", values, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserBetween(String value1, String value2) {
			addCriterion("update_user between", value1, value2, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserNotBetween(String value1, String value2) {
			addCriterion("update_user not between", value1, value2, "updateUser");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table youranxue.test_trn
	 * @mbg.generated  Sat Jun 09 20:41:13 JST 2018
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table youranxue.test_trn
     *
     * @mbg.generated do_not_delete_during_merge Mon May 28 00:46:05 JST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}