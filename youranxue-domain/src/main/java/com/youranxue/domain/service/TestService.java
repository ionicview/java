package com.youranxue.domain.service;

import java.util.List;

import com.youranxue.domain.model.TestTrn;

public interface TestService {

	int insertTestTrn(TestTrn testTrn);

	List<TestTrn> getAllTestByBookId(Integer bookId);
}
