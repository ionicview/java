package com.youranxue.domain.vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Data;

@Data
public class QuestionShortAnswerSubQuestionVO {
	private long subQuestionId;
	private int sequenceNo;
	private String shortAnswerContent;
	private List<String> images = new ArrayList<>();
	
	private QuestionAnswerVO answer;
	
	public void addImages(String... images) {
		if (null == images || 0 == images.length) {
			return;
		}
		this.images.addAll(Arrays.asList(images));
	}
}
