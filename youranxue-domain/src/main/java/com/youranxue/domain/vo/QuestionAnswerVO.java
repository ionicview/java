package com.youranxue.domain.vo;

import java.util.List;

import lombok.Data;

@Data
public class QuestionAnswerVO {
    long answerId;
    String answerContent;
    List<String> answerImgs;
}
