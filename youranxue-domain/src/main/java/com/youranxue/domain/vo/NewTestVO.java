package com.youranxue.domain.vo;

import java.util.Random;

import org.springframework.beans.BeanUtils;

import com.youranxue.domain.model.TestTrn;

import lombok.Data;

@Data
public class NewTestVO {
	private String testName;
	private Integer chapterId;
	private Integer sectionId;
	private Integer useHour;
	private Integer useMin;
	private Integer totalScore;

	public TestTrn toTestTrn() {
		TestTrn trn = new TestTrn();
		BeanUtils.copyProperties(this, trn);

		// 换算为分钟存储
		trn.setTestDurationMin(useHour * 60 + useMin);
		trn.setTestId(new Random().nextLong());
		return trn;

	}
}
