package com.youranxue.domain.vo;

import java.util.List;

import lombok.Data;

@Data
public class QuestionChoiceOptionVO {
	private Integer choiceId;
	private Integer sequenceNo;
	private String choiceItem;
	private List<String> imgList;
	private boolean rightAnswerFlg;
}
