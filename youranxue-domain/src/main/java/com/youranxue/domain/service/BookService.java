package com.youranxue.domain.service;

import java.util.List;

import com.youranxue.domain.vo.Book;
import com.youranxue.domain.vo.Chapter;

public interface BookService {

	List<List<Book>> searchMyBookList(String userId);

	List<Chapter> serachChapterList(Integer bookId);

}
