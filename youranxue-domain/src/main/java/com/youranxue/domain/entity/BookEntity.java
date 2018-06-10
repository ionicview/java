package com.youranxue.domain.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.youranxue.domain.entity.mapper.BookEntityMapper;
import com.youranxue.domain.mapper.ChapterMstMapper;
import com.youranxue.domain.mapper.SectionMstMapper;
import com.youranxue.domain.model.BookMst;
import com.youranxue.domain.model.ChapterMst;
import com.youranxue.domain.model.ChapterMstExample;
import com.youranxue.domain.model.SectionMst;
import com.youranxue.domain.model.SectionMstExample;
import com.youranxue.domain.select.SelectOption;
import com.youranxue.domain.stereotype.Entity;
import com.youranxue.domain.vo.Book;
import com.youranxue.domain.vo.Chapter;

@Entity
public class BookEntity {

	private BookMst bookMst;

	@Autowired
	private BookEntityMapper bookEntityMapper;

	@Autowired
	private ChapterMstMapper chapterMstMapper;
	//
	@Autowired
	private SectionMstMapper sectionMstMapper;

	public List<Book> searchMyBookList(String userId) {

		return bookEntityMapper.searchMyBookList();
	}

	public List<Chapter> searchChapterList(Integer bookId) {
		ChapterMstExample chapterMstExample = new ChapterMstExample();
		chapterMstExample.createCriteria().andBookIdEqualTo(bookId);

		List<ChapterMst> chapterMstList = chapterMstMapper.selectByExample(chapterMstExample);

		List<Chapter> chapterList = new ArrayList<>();

		chapterMstList.forEach(chapterMst -> {

			Chapter chapter = new Chapter();
			BeanUtils.copyProperties(chapterMst, chapter);

			SectionMstExample sectionMstExample = new SectionMstExample();
			List<SectionMst> sectionList = sectionMstMapper.selectByExample(sectionMstExample);

			chapter.setSectionList(sectionList);
			chapterList.add(chapter);
		});

		return chapterList;
	}

	public List<SelectOption> getChapterSelectOptionByBookId(Integer bookId) {
		ChapterMstExample chapterMstExample = new ChapterMstExample();
		chapterMstExample.createCriteria().andBookIdEqualTo(bookId);
		List<ChapterMst> chapterMstList = chapterMstMapper.selectByExample(chapterMstExample);

		List<SelectOption> chapterSelectOptionList = new ArrayList<>();
		chapterMstList.forEach(chapter -> {
			chapterSelectOptionList.add(new SelectOption(chapter));
		});

		return chapterSelectOptionList;

	}

	public List<SelectOption> getSectionSelectOptionByChapterId(Integer chapterId) {
		SectionMstExample sectionMstExample = new SectionMstExample();
		sectionMstExample.createCriteria().andChapterIdEqualTo(chapterId);
		List<SectionMst> sectionMstList = sectionMstMapper.selectByExample(sectionMstExample);

		List<SelectOption> sectionSelectOptionList = new ArrayList<>();
		sectionMstList.forEach(section -> {
			sectionSelectOptionList.add(new SelectOption(section));
		});

		return sectionSelectOptionList;

	}

}
