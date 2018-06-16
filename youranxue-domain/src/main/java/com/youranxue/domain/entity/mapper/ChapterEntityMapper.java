package com.youranxue.domain.entity.mapper;

import java.util.List;

import com.youranxue.domain.vo.Chapter;

public interface ChapterEntityMapper {
	List<Chapter> searchChapterListByBookId(long bookId);
}
