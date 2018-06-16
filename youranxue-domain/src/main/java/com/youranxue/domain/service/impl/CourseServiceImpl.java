package com.youranxue.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.youranxue.domain.entity.CourseTrnEntity;
import com.youranxue.domain.model.CourseTrn;
import com.youranxue.domain.service.CourseService;
import com.youranxue.domain.vo.CourseViewVO;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseTrnEntity courseTrnEntity;

	public int insertCourseTrn(CourseTrn courseTrn) {

		return courseTrnEntity.insert(courseTrn);
	}

	@Override
	public List<CourseViewVO> getAllCourse() {

		List<CourseTrn> courseTrnList = courseTrnEntity.getAllCourse();

		List<CourseViewVO> courseViewVoList = new ArrayList<>();
		if (CollectionUtils.isEmpty(courseTrnList)) {
			return courseViewVoList;
		}

		courseTrnList.forEach(record -> {
			courseViewVoList.add(new CourseViewVO(record));
		});

		return courseViewVoList;
	}
}
