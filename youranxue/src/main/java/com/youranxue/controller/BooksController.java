package com.youranxue.controller;

import java.net.URISyntaxException;
import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.youranxue.domain.service.BookService;
import com.youranxue.domain.vo.Book;
import com.youranxue.domain.vo.Chapter;

@CrossOrigin
@RestController
@RequestMapping("/books")
public class BooksController {

	@Inject
	private BookService bookService;

	@ResponseBody
	@RequestMapping(value = "/myBooks", method = RequestMethod.GET)
	public List<List<Book>> getbooks() {

		return bookService.searchMyBookList("2001");

	}

	
	
	@ResponseBody
	@RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
	public List<Chapter> getChapter(@PathVariable Integer bookId) throws URISyntaxException {
		return bookService.serachChapterList(bookId);
		// List<Chapter> chapterList = new ArrayList<>();
		//
		// List<Integer> thumbsups = new ArrayList<>();
		// thumbsups.add(1);
		// thumbsups.add(2);
		//
		// List<Section> sectionList1 = new ArrayList<>();
		// Section s1 = new Section(1, "缁堜簬鍙互杈撳叆涓枃鍟�");
		// Section s2 = new Section(2, "澶ソ鍝�");
		// sectionList1.add(s1);
		// sectionList1.add(s2);
		//
		// Chapter cp1 = new Chapter(1, "绗竴绔�", sectionList1);
		// chapterList.add(cp1);
		//
		// List<Section> sectionList2 = new ArrayList<>();
		// Section s3 = new Section(1, "鏃ユ湰瑾�");
		// Section s4 = new Section(2, "11w");
		// Section s5 = new Section(3, "1.3 ");
		// sectionList2.add(s3);
		// sectionList2.add(s4);
		// sectionList2.add(s5);
		//
		// Chapter cp2 = new Chapter(2, "", sectionList2);
		// chapterList.add(cp2);
		// return null;
		// return bookService.serachChapterList(bookId);
	}

}