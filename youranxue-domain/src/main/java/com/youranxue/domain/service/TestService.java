package com.youranxue.domain.service;

import java.util.List;

import com.youranxue.domain.model.TestTrn;
import com.youranxue.domain.vo.QuestionNumberVO;

public interface TestService {

	int insertTestTrn(TestTrn testTrn);

	List<TestTrn> getAllTestByBookId(Integer bookId);

	int autoNewTest(Integer sectionId, List<QuestionNumberVO> questionList);
}
