package com.youranxue.domain.vo;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class TestQuestionVO {
	private List<QuestionChoiceVO> choiceList = new ArrayList<>();
	private List<QuestionFillBlankVO> fillblankList = new ArrayList<>();
	private List<QuestionShortAnswerVO> shortAnswerList = new ArrayList<>();

	public void addQuestionChoice(QuestionChoiceVO questionChoiceVO) {
		this.choiceList.add(questionChoiceVO);
	}
	
	public void addQuestionFillBlank(QuestionFillBlankVO questionFillBlankVO) {
		this.fillblankList.add(questionFillBlankVO);
	}
	
	public void addQuestionShortAnswer(QuestionShortAnswerVO questionShortAnswerVO) {
		this.shortAnswerList.add(questionShortAnswerVO);
	}

}
