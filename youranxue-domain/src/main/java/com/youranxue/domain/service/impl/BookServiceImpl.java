package com.youranxue.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youranxue.domain.entity.BookEntity;
import com.youranxue.domain.mapper.BookMstMapper;
import com.youranxue.domain.service.BookService;
import com.youranxue.domain.vo.Book;
import com.youranxue.domain.vo.Chapter;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookEntity bookEntity;

	@Inject
	private BookMstMapper bookMstMapper;

	public List<List<Book>> searchMyBookList(String userId) {


		List<Book> myBookList = bookEntity.searchMyBookList(userId);

		List<List<Book>> outList = new ArrayList<>();
		int j = 0;
		List<Book> rowBookList = new ArrayList<>();
		for (Book bk : myBookList) {
			if (j > 2) {
				j = 0;
				outList.add(rowBookList);
				rowBookList = new ArrayList<>();
			}

			j++;
			rowBookList.add(bk);

		}
		outList.add(rowBookList);
		return outList;
	}

	@Override
	public List<Chapter> serachChapterList(Integer bookId) {

		return bookEntity.searchChapterList(bookId);
	}

}
