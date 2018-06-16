package com.youranxue.domain.vo;

import org.springframework.beans.BeanUtils;

import com.youranxue.domain.model.CourseTrn;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CourseViewVO extends CourseTrn {
	private String statusVal;

	public CourseViewVO() {

	}

	public CourseViewVO(CourseTrn courseTrn) {

		BeanUtils.copyProperties(courseTrn, this);
	}
}
