package com.youranxue.domain.vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Data;

@Data
public class QuestionShortAnswerVO {
	long shortAnswerId;
	String shortAnswerContent;
	List<String> images = new ArrayList<>();
	List<QuestionShortAnswerSubQuestionVO> subQuestionList;
	QuestionAnswerVO answer;

	public void addImages(String... images) {
		if (null == images || 0 == images.length) {
			return;
		}
		this.images.addAll(Arrays.asList(images));
	}
}
