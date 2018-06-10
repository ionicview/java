package com.youranxue.domain.service;

import java.util.List;

import com.youranxue.domain.model.CourseTrn;
import com.youranxue.domain.vo.CourseViewVO;

public interface CourseService {

	int insertCourseTrn(CourseTrn courseTrn);

	List<CourseViewVO> getAllCourse();
}
