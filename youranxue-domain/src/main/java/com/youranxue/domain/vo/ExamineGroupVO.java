package com.youranxue.domain.vo;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ExamineGroupVO {
	private long examineGroupId;
	private String examineGroupName;
	private List<ExamineVO> examineList = new ArrayList<>();

	public ExamineGroupVO(long id, String name) {
		this.examineGroupId = id;
		this.examineGroupName = name;
	}
	
	public void addExamine(long esamineId, String examineName) {
		ExamineVO vo = new ExamineVO(esamineId,examineName);
		examineList.add(vo);
	}
}
