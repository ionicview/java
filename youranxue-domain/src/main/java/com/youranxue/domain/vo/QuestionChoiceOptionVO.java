package com.youranxue.domain.vo;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class QuestionChoiceOptionVO {
	private Integer choiceId;
	private Integer sequenceNo;
	private String choiceItem;
	private List<String> imgList= new ArrayList<>();
	private boolean rightAnswerFlg;
	public void addImage(String imgFilePath) {
		this.imgList.add(imgFilePath);
	}
}
