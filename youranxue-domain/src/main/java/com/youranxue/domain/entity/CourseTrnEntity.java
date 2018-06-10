package com.youranxue.domain.entity;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.youranxue.domain.mapper.CourseTrnMapper;
import com.youranxue.domain.model.CourseTrn;
import com.youranxue.domain.model.CourseTrnExample;
import com.youranxue.domain.stereotype.Entity;

@Entity
public class CourseTrnEntity {

	@Autowired
	private CourseTrnMapper mapper;

	public int insert(CourseTrn courseTrn) {
		courseTrn.setCourseId(UUID.randomUUID().toString());
		courseTrn.setStatus("0");
		courseTrn.setCreateDate(new Date());
		courseTrn.setUpdateDate(new Date());
		return mapper.insert(courseTrn);
	}

	public List<CourseTrn> getAllCourse() {
		return mapper.selectByExample(new CourseTrnExample());
	}
}
