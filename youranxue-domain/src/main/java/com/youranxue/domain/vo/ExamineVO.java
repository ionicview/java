package com.youranxue.domain.vo;

import lombok.Data;

@Data
public class ExamineVO {
	private long examineId;
	private String examineName;

	public ExamineVO(long examineId, String examineName) {
		this.examineId = examineId;
		this.examineName = examineName;

	}
}
