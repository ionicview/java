package com.youranxue.domain.vo;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class QuestionFillBlankVO {
	private Integer fillblankId;
    private int questionIdx;
    private int questionNo;
	private String question;
	private Integer blankCount;
	private List<String> imgList = new ArrayList<>();
	private List<QuestionFillBlankBlankVO> blankList = new ArrayList<>();

	public void addImage(String imgFilePath) {
		this.imgList.add(imgFilePath);
	}

	public void addBlank(QuestionFillBlankBlankVO blankVO) {
		this.blankList.add(blankVO);
	}
}
