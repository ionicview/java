package com.youranxue.vo;

import java.util.Date;

import lombok.Data;

@Data
public class NewTaskVO {
	private String className;
	private String subjectCode;
	private String teachTargetCode;
	private String termCode;
	private String publisherCode;
	private Integer studentCount;
	private Date endDate;
}
