package com.youranxue.domain.entity;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.youranxue.domain.mapper.TestTrnMapper;
import com.youranxue.domain.model.TestTrn;
import com.youranxue.domain.model.TestTrnExample;
import com.youranxue.domain.stereotype.Entity;

@Entity
public class TestTrnEntity {

	@Autowired
	private TestTrnMapper mapper;

	public int insert(TestTrn testTrn) {

		testTrn.setCreateDate(new Date());
		testTrn.setUpdateDate(new Date());
		return mapper.insert(testTrn);
	}

	public List<TestTrn> getAllTestByBookId(Integer bookId) {

		return mapper.selectByExample(new TestTrnExample());
	}
}
