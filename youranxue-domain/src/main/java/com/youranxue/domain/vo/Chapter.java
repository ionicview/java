package com.youranxue.domain.vo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.youranxue.domain.model.SectionMst;

import lombok.Data;

@Data
public class Chapter {
	private Integer chapterId;
	private String chapterName;
	private List<Section> sectionList = new ArrayList<>();

	public void addSection(SectionMst sectionMst) {
		Section section = new Section();
		BeanUtils.copyProperties(sectionMst, section);
		this.sectionList.add(section);
	}

	public void setSectionList(List<SectionMst> sectionMstList) {
		if (null == sectionMstList) {
			return;
		}

		sectionMstList.forEach(sectionMst -> {
			addSection(sectionMst);
		});
	}
}
