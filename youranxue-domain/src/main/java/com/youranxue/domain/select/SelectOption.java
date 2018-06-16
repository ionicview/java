package com.youranxue.domain.select;

import com.youranxue.domain.model.ChapterMst;
import com.youranxue.domain.model.SectionMst;

import lombok.Data;

@Data
public class SelectOption {
	private long value;
	private String label;

	public SelectOption(long value, String label) {
		this.value = value;
		this.label = label;
	}

	public SelectOption(ChapterMst chapterMst) {
		this.value = chapterMst.getChapterId();
		this.label = chapterMst.getChapterName();
	}

	public SelectOption(SectionMst sectionMst) {
		this.value = sectionMst.getSectionId();
		this.label = sectionMst.getSectionName();
	}

}
