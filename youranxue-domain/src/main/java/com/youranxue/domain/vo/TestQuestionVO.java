package com.youranxue.domain.vo;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class TestQuestionVO {
	private String choiceTital;

	

	private String choiceTitle = "一、选择题：本大题共12小题，每小题5分，共60分，在每小题给出的四个选项中，只有一项是满足题目要求的。";
	private String fillblankTitle = "二、填空题：本大题共4小题，每题5分，共20分.请将答案填在答题卡对应题号的位置上。";
	private String shortAnswerTitle="三、解答题：本大题共6小题，共70分。解答应写出文字说明、证明过程或演算步骤。";
	
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
