package com.youranxue.domain.vo;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class QuestionChoiceVO {
	private Long questionId;
    private int questionNo;
    private int questionIdx;
	private String question;
	private List<String> imgList = new ArrayList<>();
	private List<QuestionChoiceOptionVO> choiceOptionList = new ArrayList<>();

	public void addImg(String img) {
		this.imgList.add(img);

	}

	public void addQuestionChoiceOption(QuestionChoiceOptionVO questionChoiceOptionVO) {
		this.choiceOptionList.add(questionChoiceOptionVO);
	}

}
