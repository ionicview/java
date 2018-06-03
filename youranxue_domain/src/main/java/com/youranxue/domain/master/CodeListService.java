package com.youranxue.domain.master;

import java.util.List;

import com.youranxue.domain.select.SelectOption;

public interface CodeListService {

	List<SelectOption> getChapterSelectOptionByBookId(Integer bookId);

	List<SelectOption> getSectionSelectOptionByChapterId(Integer chapterId);
}
