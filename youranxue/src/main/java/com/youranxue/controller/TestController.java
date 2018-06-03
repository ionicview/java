package com.youranxue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.youranxue.domain.master.CodeListService;
import com.youranxue.domain.security.User;
import com.youranxue.domain.select.SelectOption;
import com.youranxue.domain.service.TestService;
import com.youranxue.domain.vo.NewTestVO;

@RestController
@CrossOrigin
@RequestMapping("/test")
public class TestController {

	@Autowired
	private CodeListService codeListService;

	@Autowired
	private TestService testService;

	@GetMapping("/public1")
	@CrossOrigin
	public String publicService() {
		return "This message is public";
	}

	@RequestMapping(value = "initNewTest/{bookId}", method = RequestMethod.GET)
	public List<SelectOption> initNewTest(@PathVariable Integer bookId) {
		return codeListService.getChapterSelectOptionByBookId(bookId);
	}

	@RequestMapping(value = "getSectionSelect/{chapterId}", method = RequestMethod.GET)
	public List<SelectOption> getSectionSelect(@PathVariable Integer chapterId) {
		return codeListService.getSectionSelectOptionByChapterId(chapterId);
	}

	@ResponseBody
	@RequestMapping(value = "/newTest", method = RequestMethod.PUT)
	public int newTest(@RequestBody NewTestVO newTest) {

		return testService.insertTestTrn(newTest.toTestTrn());
	}

	@GetMapping("/secret")
	@CrossOrigin
	public User secretService() {

		User user = new User();
		user.setLastName("admin.last.test");
		user.setUsername("admin");
		user.setFirstName("admin.first");
		return user;
	}

}
