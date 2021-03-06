
/* Drop Tables */

DROP TABLE IF EXISTS FAVORITE;
DROP TABLE IF EXISTS STUDENT;
DROP TABLE IF EXISTS TEACHER_ROLL;
DROP TABLE IF EXISTS SCG_MST;
DROP TABLE IF EXISTS SCHOOL_MST;
DROP TABLE IF EXISTS ADDRESS_MST;
DROP TABLE IF EXISTS ANSWER_SHEET_QUESTION_TRN;
DROP TABLE IF EXISTS ANSWER_SHEET_TRN;
DROP TABLE IF EXISTS SECTION_KNOWLEDGE;
DROP TABLE IF EXISTS TEST_GROUP_TRN;
DROP TABLE IF EXISTS TEST_QUESTION_TRN;
DROP TABLE IF EXISTS TEST_TRN;
DROP TABLE IF EXISTS SECTION_MST;
DROP TABLE IF EXISTS CHAPTER_MST;
DROP TABLE IF EXISTS MY_BOOKS;
DROP TABLE IF EXISTS BOOK_MST;
DROP TABLE IF EXISTS CHOICE;
DROP TABLE IF EXISTS CITY_MST;
DROP TABLE IF EXISTS CLASS_MST;
DROP TABLE IF EXISTS CODE_MST;
DROP TABLE IF EXISTS CODE_TYPE_MST;
DROP TABLE IF EXISTS COURSE_TRN;
DROP TABLE IF EXISTS DISTRICT_MST;
DROP TABLE IF EXISTS EXPLAIN_IN_DETAIL;
DROP TABLE IF EXISTS FAVORITE_TYPE;
DROP TABLE IF EXISTS FILL_BLANK;
DROP TABLE IF EXISTS GRADE_MST;
DROP TABLE IF EXISTS USER_GROUP_MST;
DROP TABLE IF EXISTS GROUP_TRN;
DROP TABLE IF EXISTS HINT;
DROP TABLE IF EXISTS IMG_MST;
DROP TABLE IF EXISTS QUESTION_KNOWLEDGE;
DROP TABLE IF EXISTS KNOWLEDGE_MST;
DROP TABLE IF EXISTS PROVINCE_MST;
DROP TABLE IF EXISTS PUBLISHER_MST;
DROP TABLE IF EXISTS SHORT_ANSWER;
DROP TABLE IF EXISTS QUESTION;
DROP TABLE IF EXISTS QUESTION_TYPE_MST;
DROP TABLE IF EXISTS USER_ROLE_MST;
DROP TABLE IF EXISTS ROLE_MST;
DROP TABLE IF EXISTS SEMESTER_MST;
DROP TABLE IF EXISTS SUBJECT_MST;
DROP TABLE IF EXISTS TEACHER;
DROP TABLE IF EXISTS TEST_TYPE;
DROP TABLE IF EXISTS USER_MST;




/* Create Tables */

CREATE TABLE ADDRESS_MST
(
	ADDRESS_ID BIGINT NOT NULL,
	ADDRESS_DETAIL VARCHAR(100),
	PROVINCE BIGINT NOT NULL,
	CITY_ID BIGINT NOT NULL,
	DISTRICT_ID BIGINT NOT NULL,
	PRIMARY KEY (ADDRESS_ID)
) WITHOUT OIDS;


CREATE TABLE ANSWER_SHEET_QUESTION_TRN
(
	ANSWER_SHEET_QUESTION_ID SERIAL NOT NULL,
	ANSWER_SHEET_ID INT NOT NULL,
	USER_ANSWER TEXT,
	-- 问答题的时候，无法确定正确性，所以必须在此标识正确与否
	ANSWER_SHEET_STATUS INT,
	ANSWER_COMMENT TEXT,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	QUESTION_ID INT NOT NULL,
	PRIMARY KEY (ANSWER_SHEET_QUESTION_ID)
) WITHOUT OIDS;


CREATE TABLE ANSWER_SHEET_TRN
(
	ANSWER_SHEET_ID SERIAL NOT NULL,
	-- 邮箱地址
	USER_ID VARCHAR(30) NOT NULL,
	USED_TIME INT,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (ANSWER_SHEET_ID)
) WITHOUT OIDS;


CREATE TABLE BOOK_MST
(
	BOOK_ID SERIAL NOT NULL,
	GRADE_ID INT NOT NULL,
	BOOK_NAME VARCHAR(100),
	ISBN VARCHAR(20),
	SUBJECT_ID INT NOT NULL,
	SEMESTER_ID INT NOT NULL,
	PUBLISHER_ID INT NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (BOOK_ID)
) WITHOUT OIDS;


CREATE TABLE CHAPTER_MST
(
	CHAPTER_ID SERIAL NOT NULL,
	CHAPTER_NAME VARCHAR(30),
	BOOK_ID INT NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (CHAPTER_ID)
) WITHOUT OIDS;


CREATE TABLE CHOICE
(
	CHOICE_ID SERIAL NOT NULL,
	SEQUENCE_NO INT,
	CHOICE_ITEM TEXT,
	RIGHT_ANSWER_FLG BOOLEAN,
	QUESTION_ID INT NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (CHOICE_ID)
) WITHOUT OIDS;


CREATE TABLE CITY_MST
(
	CITY_ID BIGINT NOT NULL,
	CITY_NAME VARCHAR(30),
	PRIMARY KEY (CITY_ID)
) WITHOUT OIDS;


CREATE TABLE CLASS_MST
(
	CLASS_ID BIGINT NOT NULL,
	CLASS_NAME VARCHAR(30) NOT NULL,
	PRIMARY KEY (CLASS_ID)
) WITHOUT OIDS;


CREATE TABLE CODE_MST
(
	CODE_ID SERIAL NOT NULL,
	CODE_TYPE_ID INT NOT NULL,
	SEQ INT,
	CODE_KEY VARCHAR(20) NOT NULL,
	CODE_VALUE VARCHAR(40) NOT NULL,
	NOTE VARCHAR(200),
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (CODE_ID)
) WITHOUT OIDS;


CREATE TABLE CODE_TYPE_MST
(
	CODE_TYPE_ID SERIAL NOT NULL,
	PHYSICAL_NAME VARCHAR(20) NOT NULL,
	LOGIC_NAME VARCHAR(20),
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (CODE_TYPE_ID)
) WITHOUT OIDS;


CREATE TABLE COURSE_TRN
(
	COURSE_ID VARCHAR(40) NOT NULL,
	SUBJECT_ID INT NOT NULL,
	GRADE_ID INT NOT NULL,
	SEMESTER_ID INT NOT NULL,
	PUBLISHER_ID INT NOT NULL,
	COURSE_NAME VARCHAR(50),
	STUDENT_COUNT INT,
	END_DATE DATE,
	-- AUDIT_WAITTING：待审核
	-- AUDITED：已审核
	-- FINISHED：已结束
	STATUS VARCHAR(30),
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (COURSE_ID)
) WITHOUT OIDS;


CREATE TABLE DISTRICT_MST
(
	DISTRICT_ID BIGINT NOT NULL,
	DISTRICT_NAME VARCHAR(30),
	PRIMARY KEY (DISTRICT_ID)
) WITHOUT OIDS;


CREATE TABLE EXPLAIN_IN_DETAIL
(
	EXPLAIN_IN_DETAIL SERIAL NOT NULL,
	QUESTION_ID INT NOT NULL,
	SEQUENCE_NO INT,
	CONTENT TEXT,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (EXPLAIN_IN_DETAIL)
) WITHOUT OIDS;


CREATE TABLE FAVORITE
(
	FAVORITE_ID SERIAL NOT NULL,
	FAVORITE_TYPE_ID INT NOT NULL,
	QUESTION_ID INT NOT NULL,
	-- 邮箱地址
	USER_ID VARCHAR(30) NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (FAVORITE_ID)
) WITHOUT OIDS;


CREATE TABLE FAVORITE_TYPE
(
	FAVORITE_TYPE_ID SERIAL NOT NULL,
	FAVORITE_TYPE_NAME VARCHAR(30),
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (FAVORITE_TYPE_ID)
) WITHOUT OIDS;


CREATE TABLE FILL_BLANK
(
	FILL_BLANK_ID SERIAL NOT NULL,
	SEQUENCE_NO INT,
	ANSWER VARCHAR(50),
	QUESTION_ID INT NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (FILL_BLANK_ID)
) WITHOUT OIDS;


CREATE TABLE GRADE_MST
(
	GRADE_ID SERIAL NOT NULL,
	GRADE_NAME VARCHAR(20),
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (GRADE_ID)
) WITHOUT OIDS;


CREATE TABLE GROUP_TRN
(
	GROUP_ID BIGINT NOT NULL,
	GROUP_NAME VARCHAR(30),
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (GROUP_ID)
) WITHOUT OIDS;


CREATE TABLE HINT
(
	HINT_ID SERIAL NOT NULL,
	SEQUENCE_NO INT,
	QUESTION_ID_PARENT INT NOT NULL,
	QUESTION_ID INT NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (HINT_ID)
) WITHOUT OIDS;


CREATE TABLE IMG_MST
(
	IMG_ID SERIAL NOT NULL,
	IMG_TYPE SMALLINT,
	IMG_RELEATION_ID BIGINT,
	IMG_NAME VARCHAR(30),
	IMG_PATH TEXT NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (IMG_ID)
) WITHOUT OIDS;


CREATE TABLE KNOWLEDGE_MST
(
	KNOWLEDGE_ID SERIAL NOT NULL,
	KNOWLEDGE_NAME VARCHAR(30),
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (KNOWLEDGE_ID)
) WITHOUT OIDS;


CREATE TABLE MY_BOOKS
(
	MY_BOOK_ID SERIAL NOT NULL UNIQUE,
	BOOK_ID INT NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (MY_BOOK_ID)
) WITHOUT OIDS;


CREATE TABLE PROVINCE_MST
(
	PROVINCE BIGINT NOT NULL,
	PROVINCE_NAME VARCHAR(30),
	PRIMARY KEY (PROVINCE)
) WITHOUT OIDS;


CREATE TABLE PUBLISHER_MST
(
	PUBLISHER_ID SERIAL NOT NULL,
	PUBLISHER_NAME VARCHAR(50),
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (PUBLISHER_ID)
) WITHOUT OIDS;


CREATE TABLE QUESTION
(
	QUESTION_ID SERIAL NOT NULL,
	QUESTION_TYPE_ID INT NOT NULL,
	QUESTION VARCHAR(300),
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (QUESTION_ID)
) WITHOUT OIDS;


CREATE TABLE QUESTION_KNOWLEDGE
(
	QUESTION_ID INT NOT NULL,
	KNOWLEDGE_ID INT NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (QUESTION_ID, KNOWLEDGE_ID),
	UNIQUE (QUESTION_ID, KNOWLEDGE_ID)
) WITHOUT OIDS;


CREATE TABLE QUESTION_TYPE_MST
(
	QUESTION_TYPE_ID SERIAL NOT NULL,
	QUESTION_TYPE_NAME VARCHAR(30),
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (QUESTION_TYPE_ID)
) WITHOUT OIDS;


CREATE TABLE ROLE_MST
(
	ROLE_ID SERIAL NOT NULL,
	ROLE_NAME VARCHAR(20) NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (ROLE_ID)
) WITHOUT OIDS;


CREATE TABLE SCG_MST
(
	SGC_ID BIGINT NOT NULL,
	SCHOOL_ID BIGINT NOT NULL,
	GRADE_ID INT NOT NULL,
	CLASS_ID BIGINT NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (SGC_ID),
	UNIQUE (GRADE_ID, CLASS_ID, SCHOOL_ID)
) WITHOUT OIDS;


CREATE TABLE SCHOOL_MST
(
	SCHOOL_ID BIGINT NOT NULL,
	SCHOOL_NAME VARCHAR(50),
	ADDRESS_ID BIGINT NOT NULL,
	PRIMARY KEY (SCHOOL_ID)
) WITHOUT OIDS;


CREATE TABLE SECTION_KNOWLEDGE
(
	KNOWLEDGE_ID INT NOT NULL,
	SECTION_ID INT NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (KNOWLEDGE_ID, SECTION_ID),
	UNIQUE (KNOWLEDGE_ID, SECTION_ID)
) WITHOUT OIDS;


CREATE TABLE SECTION_MST
(
	SECTION_ID SERIAL NOT NULL,
	CHAPTER_ID INT NOT NULL,
	SECTION_NAME VARCHAR(30),
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (SECTION_ID)
) WITHOUT OIDS;


CREATE TABLE SEMESTER_MST
(
	SEMESTER_ID SERIAL NOT NULL,
	SEMESTER_NAME VARCHAR(30),
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (SEMESTER_ID)
) WITHOUT OIDS;


CREATE TABLE SHORT_ANSWER
(
	SHORT_ANSWER_ID SERIAL NOT NULL,
	SEQUENCE_NO INT,
	SHORT_ANSWER_CONTENT VARCHAR(200),
	ANSWER TEXT,
	QUESTION_ID INT NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (SHORT_ANSWER_ID)
) WITHOUT OIDS;


CREATE TABLE STUDENT
(
	-- 邮箱地址
	USER_ID VARCHAR(30) NOT NULL,
	SGC_ID BIGINT NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (USER_ID)
) WITHOUT OIDS;


CREATE TABLE SUBJECT_MST
(
	SUBJECT_ID SERIAL NOT NULL,
	SUBJECT_NAME VARCHAR(100),
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (SUBJECT_ID)
) WITHOUT OIDS;


CREATE TABLE TEACHER
(
	-- 邮箱地址
	USER_ID VARCHAR(30) NOT NULL,
	TEACHING_AGE INT,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (USER_ID)
) WITHOUT OIDS;


CREATE TABLE TEACHER_ROLL
(
	TEACHER_ROLL_ID BIGINT NOT NULL,
	TEACHER_ROLL_NAME VARCHAR(20),
	-- 邮箱地址
	USER_ID VARCHAR(30) NOT NULL,
	SGC_ID BIGINT NOT NULL,
	BOOK_ID INT NOT NULL,
	DEFAULT_ROLL_FLG BOOLEAN NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (TEACHER_ROLL_ID),
	UNIQUE (USER_ID, DEFAULT_ROLL_FLG)
) WITHOUT OIDS;


CREATE TABLE TEST_GROUP_TRN
(
	TEST_GROUP_ID BIGINT NOT NULL,
	GROUP_ID BIGINT NOT NULL,
	TEST_ID BIGINT NOT NULL,
	TEST_TYPE_ID INT NOT NULL,
	START_TIME TIMESTAMP NOT NULL,
	END_TIME TIMESTAMP NOT NULL,
	-- UNPUBLISHED：未发布
	-- PUBLISHING：发布中
	--  FINISHED：已结束
	STATUS VARCHAR(30),
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (TEST_GROUP_ID)
) WITHOUT OIDS;


CREATE TABLE TEST_QUESTION_TRN
(
	TEST_ID BIGINT NOT NULL,
	QUESTION_ID INT NOT NULL,
	SCORE INT,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20)
) WITHOUT OIDS;


CREATE TABLE TEST_TRN
(
	TEST_ID BIGSERIAL NOT NULL,
	CHAPTER_ID INT NOT NULL,
	SECTION_ID INT NOT NULL,
	TEST_NAME VARCHAR,
	TOTAL_SCORE INT,
	-- 单位：分钟
	TEST_DURATION_MIN INT,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (TEST_ID)
) WITHOUT OIDS;


CREATE TABLE TEST_TYPE
(
	TEST_TYPE_ID INT NOT NULL,
	TEST_TYPE_NAME VARCHAR(30),
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (TEST_TYPE_ID)
) WITHOUT OIDS;


CREATE TABLE USER_GROUP_MST
(
	-- 邮箱地址
	USER_ID VARCHAR(30) NOT NULL,
	GROUP_ID BIGINT NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20)
) WITHOUT OIDS;


CREATE TABLE USER_MST
(
	-- 邮箱地址
	USER_ID VARCHAR(30) NOT NULL,
	USER_NAME VARCHAR(20),
	GENDER VARCHAR(10),
	DATE_OF_BIRTH DATE,
	PICTURE VARCHAR(150),
	PASSWORD TEXT NOT NULL,
	ACCOUNT_EXPIRED BOOLEAN,
	ACCOUNT_LOCKED BOOLEAN,
	CREDENTIALS_EXPIRED BOOLEAN,
	DISABLED BOOLEAN,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20),
	PRIMARY KEY (USER_ID)
) WITHOUT OIDS;


CREATE TABLE USER_ROLE_MST
(
	ROLE_ID INT NOT NULL,
	-- 邮箱地址
	USER_ID VARCHAR(30) NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	UPDATE_USER VARCHAR(20)
) WITHOUT OIDS;



/* Create Foreign Keys */

ALTER TABLE SCHOOL_MST
	ADD FOREIGN KEY (ADDRESS_ID)
	REFERENCES ADDRESS_MST (ADDRESS_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE ANSWER_SHEET_QUESTION_TRN
	ADD FOREIGN KEY (ANSWER_SHEET_ID)
	REFERENCES ANSWER_SHEET_TRN (ANSWER_SHEET_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE CHAPTER_MST
	ADD FOREIGN KEY (BOOK_ID)
	REFERENCES BOOK_MST (BOOK_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE MY_BOOKS
	ADD FOREIGN KEY (BOOK_ID)
	REFERENCES BOOK_MST (BOOK_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE TEACHER_ROLL
	ADD FOREIGN KEY (BOOK_ID)
	REFERENCES BOOK_MST (BOOK_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE SECTION_MST
	ADD FOREIGN KEY (CHAPTER_ID)
	REFERENCES CHAPTER_MST (CHAPTER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE TEST_TRN
	ADD FOREIGN KEY (CHAPTER_ID)
	REFERENCES CHAPTER_MST (CHAPTER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE ADDRESS_MST
	ADD FOREIGN KEY (CITY_ID)
	REFERENCES CITY_MST (CITY_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE SCG_MST
	ADD FOREIGN KEY (CLASS_ID)
	REFERENCES CLASS_MST (CLASS_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE CODE_MST
	ADD FOREIGN KEY (CODE_TYPE_ID)
	REFERENCES CODE_TYPE_MST (CODE_TYPE_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE ADDRESS_MST
	ADD FOREIGN KEY (DISTRICT_ID)
	REFERENCES DISTRICT_MST (DISTRICT_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE FAVORITE
	ADD FOREIGN KEY (FAVORITE_TYPE_ID)
	REFERENCES FAVORITE_TYPE (FAVORITE_TYPE_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE BOOK_MST
	ADD FOREIGN KEY (GRADE_ID)
	REFERENCES GRADE_MST (GRADE_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE COURSE_TRN
	ADD FOREIGN KEY (GRADE_ID)
	REFERENCES GRADE_MST (GRADE_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE SCG_MST
	ADD FOREIGN KEY (GRADE_ID)
	REFERENCES GRADE_MST (GRADE_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE TEST_GROUP_TRN
	ADD FOREIGN KEY (GROUP_ID)
	REFERENCES GROUP_TRN (GROUP_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE USER_GROUP_MST
	ADD FOREIGN KEY (GROUP_ID)
	REFERENCES GROUP_TRN (GROUP_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE QUESTION_KNOWLEDGE
	ADD FOREIGN KEY (KNOWLEDGE_ID)
	REFERENCES KNOWLEDGE_MST (KNOWLEDGE_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE SECTION_KNOWLEDGE
	ADD FOREIGN KEY (KNOWLEDGE_ID)
	REFERENCES KNOWLEDGE_MST (KNOWLEDGE_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE ADDRESS_MST
	ADD FOREIGN KEY (PROVINCE)
	REFERENCES PROVINCE_MST (PROVINCE)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE BOOK_MST
	ADD FOREIGN KEY (PUBLISHER_ID)
	REFERENCES PUBLISHER_MST (PUBLISHER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE COURSE_TRN
	ADD FOREIGN KEY (PUBLISHER_ID)
	REFERENCES PUBLISHER_MST (PUBLISHER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE ANSWER_SHEET_QUESTION_TRN
	ADD FOREIGN KEY (QUESTION_ID)
	REFERENCES QUESTION (QUESTION_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE CHOICE
	ADD FOREIGN KEY (QUESTION_ID)
	REFERENCES QUESTION (QUESTION_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE EXPLAIN_IN_DETAIL
	ADD FOREIGN KEY (QUESTION_ID)
	REFERENCES QUESTION (QUESTION_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE FAVORITE
	ADD FOREIGN KEY (QUESTION_ID)
	REFERENCES QUESTION (QUESTION_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE FILL_BLANK
	ADD FOREIGN KEY (QUESTION_ID)
	REFERENCES QUESTION (QUESTION_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE HINT
	ADD FOREIGN KEY (QUESTION_ID_PARENT)
	REFERENCES QUESTION (QUESTION_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE HINT
	ADD FOREIGN KEY (QUESTION_ID)
	REFERENCES QUESTION (QUESTION_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE QUESTION_KNOWLEDGE
	ADD FOREIGN KEY (QUESTION_ID)
	REFERENCES QUESTION (QUESTION_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE SHORT_ANSWER
	ADD FOREIGN KEY (QUESTION_ID)
	REFERENCES QUESTION (QUESTION_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE TEST_QUESTION_TRN
	ADD FOREIGN KEY (QUESTION_ID)
	REFERENCES QUESTION (QUESTION_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE QUESTION
	ADD FOREIGN KEY (QUESTION_TYPE_ID)
	REFERENCES QUESTION_TYPE_MST (QUESTION_TYPE_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE USER_ROLE_MST
	ADD FOREIGN KEY (ROLE_ID)
	REFERENCES ROLE_MST (ROLE_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE STUDENT
	ADD FOREIGN KEY (SGC_ID)
	REFERENCES SCG_MST (SGC_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE TEACHER_ROLL
	ADD FOREIGN KEY (SGC_ID)
	REFERENCES SCG_MST (SGC_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE SCG_MST
	ADD FOREIGN KEY (SCHOOL_ID)
	REFERENCES SCHOOL_MST (SCHOOL_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE SECTION_KNOWLEDGE
	ADD FOREIGN KEY (SECTION_ID)
	REFERENCES SECTION_MST (SECTION_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE TEST_TRN
	ADD FOREIGN KEY (SECTION_ID)
	REFERENCES SECTION_MST (SECTION_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE BOOK_MST
	ADD FOREIGN KEY (SEMESTER_ID)
	REFERENCES SEMESTER_MST (SEMESTER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE COURSE_TRN
	ADD FOREIGN KEY (SEMESTER_ID)
	REFERENCES SEMESTER_MST (SEMESTER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE FAVORITE
	ADD FOREIGN KEY (USER_ID)
	REFERENCES STUDENT (USER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE BOOK_MST
	ADD FOREIGN KEY (SUBJECT_ID)
	REFERENCES SUBJECT_MST (SUBJECT_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE COURSE_TRN
	ADD FOREIGN KEY (SUBJECT_ID)
	REFERENCES SUBJECT_MST (SUBJECT_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE TEACHER_ROLL
	ADD FOREIGN KEY (USER_ID)
	REFERENCES TEACHER (USER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE TEST_GROUP_TRN
	ADD FOREIGN KEY (TEST_ID)
	REFERENCES TEST_TRN (TEST_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE TEST_QUESTION_TRN
	ADD FOREIGN KEY (TEST_ID)
	REFERENCES TEST_TRN (TEST_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE TEST_GROUP_TRN
	ADD FOREIGN KEY (TEST_TYPE_ID)
	REFERENCES TEST_TYPE (TEST_TYPE_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE ANSWER_SHEET_TRN
	ADD FOREIGN KEY (USER_ID)
	REFERENCES USER_MST (USER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE STUDENT
	ADD FOREIGN KEY (USER_ID)
	REFERENCES USER_MST (USER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE TEACHER
	ADD FOREIGN KEY (USER_ID)
	REFERENCES USER_MST (USER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE USER_GROUP_MST
	ADD FOREIGN KEY (USER_ID)
	REFERENCES USER_MST (USER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE USER_ROLE_MST
	ADD FOREIGN KEY (USER_ID)
	REFERENCES USER_MST (USER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



/* Comments */

COMMENT ON COLUMN ANSWER_SHEET_QUESTION_TRN.ANSWER_SHEET_STATUS IS '问答题的时候，无法确定正确性，所以必须在此标识正确与否';
COMMENT ON COLUMN ANSWER_SHEET_TRN.USER_ID IS '邮箱地址';
COMMENT ON COLUMN COURSE_TRN.STATUS IS 'AUDIT_WAITTING：待审核
AUDITED：已审核
FINISHED：已结束';
COMMENT ON COLUMN FAVORITE.USER_ID IS '邮箱地址';
COMMENT ON COLUMN STUDENT.USER_ID IS '邮箱地址';
COMMENT ON COLUMN TEACHER.USER_ID IS '邮箱地址';
COMMENT ON COLUMN TEACHER_ROLL.USER_ID IS '邮箱地址';
COMMENT ON COLUMN TEST_GROUP_TRN.STATUS IS 'UNPUBLISHED：未发布
PUBLISHING：发布中
 FINISHED：已结束';
COMMENT ON COLUMN TEST_TRN.TEST_DURATION_MIN IS '单位：分钟';
COMMENT ON COLUMN USER_GROUP_MST.USER_ID IS '邮箱地址';
COMMENT ON COLUMN USER_MST.USER_ID IS '邮箱地址';
COMMENT ON COLUMN USER_ROLE_MST.USER_ID IS '邮箱地址';



