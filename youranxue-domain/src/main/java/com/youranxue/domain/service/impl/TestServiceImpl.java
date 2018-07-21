package com.youranxue.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youranxue.domain.entity.TestTrnEntity;
import com.youranxue.domain.model.TestTrn;
import com.youranxue.domain.service.TestService;
import com.youranxue.domain.vo.QuestionNumberVO;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestTrnEntity testTrnEntity;

	public int insertTestTrn(TestTrn testTrn) {

		return testTrnEntity.insert(testTrn);
	}

	@Override
	public List<TestTrn> getAllTestByBookId(Integer bookId) {
		return testTrnEntity.getAllTestByBookId(bookId);
	}

	public int autoNewTest(Integer sectionId, List<QuestionNumberVO> questionList) {
		System.out.println("Section ID:" + sectionId);
		questionList.forEach(questionNumber -> {

			System.out.println(questionNumber.getQuestionCount());
		});

		return 0;
	}

}
