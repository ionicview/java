package com.youranxue.domain.vo;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.youranxue.domain.model.CourseTrn;

import lombok.Data;

@Data
public class NewCourseVO {
	private String courseName;
	private Integer subjectId;
	private Integer gradeId;
	private Integer semesterId;
	private Integer publisherId;
	private Integer studentCount;
	private Date endDate;

	public CourseTrn toCourseTrn() {
		CourseTrn trn = new CourseTrn();
		BeanUtils.copyProperties(this, trn);
		return trn;

	}
}