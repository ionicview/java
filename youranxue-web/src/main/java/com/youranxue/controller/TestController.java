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
import com.youranxue.domain.vo.QuestionChoiceOptionVO;
import com.youranxue.domain.vo.QuestionChoiceVO;
import com.youranxue.domain.vo.QuestionNumberVO;
import com.youranxue.domain.vo.TestQuestionVO;

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

	@ResponseBody
	@RequestMapping(value = "initNewTest/{bookId}", method = RequestMethod.GET)
	public List<SelectOption> initNewTest(@PathVariable Integer bookId) {
		return codeListService.getChapterSelectOptionByBookId(bookId);
	}

	@ResponseBody
	@RequestMapping(value = "getSectionSelect/{chapterId}", method = RequestMethod.GET)
	public List<SelectOption> getSectionSelect(@PathVariable Integer chapterId) {
		return codeListService.getSectionSelectOptionByChapterId(chapterId);
	}

	@ResponseBody
	@RequestMapping(value = "/newTest", method = RequestMethod.PUT)
	public int newTest(@RequestBody NewTestVO newTest) {

		return testService.insertTestTrn(newTest.toTestTrn());
	}

	@ResponseBody
	@RequestMapping(value = "/autoNewTest/{testId}", method = RequestMethod.POST)
	public int autoNewTest(@PathVariable Integer testId, @RequestBody List<QuestionNumberVO> questionList) {

		return testService.autoNewTest(testId, questionList);
	}

	@ResponseBody
	@RequestMapping(value = "getAllTestQuestionsByTestId/{testId}", method = RequestMethod.GET)
	public TestQuestionVO getAllTestQuestionsByTestId(@PathVariable Integer testId) {

		QuestionChoiceVO choiceVO = new QuestionChoiceVO();
		choiceVO.addImg("");
		choiceVO.setQuestion(
				"如图，$\\triangle ABC$中，$\\angle A= 36^{\\circ}$，$\\angle B= 72^{\\circ}$，$\\angle ACB$的平分线交$AB$于$D$，则图中共有等腰三角形(　)");

		QuestionChoiceOptionVO optionVO1 = new QuestionChoiceOptionVO();
		optionVO1.setChoiceId(1001);
		optionVO1.setChoiceItem("A. 2个");
		optionVO1.setSequenceNo(1);
		optionVO1.setRightAnswerFlg(false);
		choiceVO.addQuestionChoiceOption(optionVO1);

		QuestionChoiceOptionVO optionVO2 = new QuestionChoiceOptionVO();
		optionVO2.setChoiceId(1002);
		optionVO2.setChoiceItem("B. 3个");
		optionVO2.setSequenceNo(1);
		optionVO2.setRightAnswerFlg(false);
		choiceVO.addQuestionChoiceOption(optionVO2);

		QuestionChoiceOptionVO optionVO3 = new QuestionChoiceOptionVO();
		optionVO3.setChoiceId(1003);
		optionVO3.setChoiceItem("C. 4个");
		optionVO3.setSequenceNo(1);
		optionVO3.setRightAnswerFlg(false);
		choiceVO.addQuestionChoiceOption(optionVO3);

		QuestionChoiceOptionVO optionVO4 = new QuestionChoiceOptionVO();
		optionVO4.setChoiceId(1004);
		optionVO4.setChoiceItem("D. 5个");
		optionVO4.setSequenceNo(1);
		optionVO4.setRightAnswerFlg(false);
		choiceVO.addQuestionChoiceOption(optionVO4);

		TestQuestionVO testQuestionVO = new TestQuestionVO();
		testQuestionVO.addQuestionChoice(choiceVO);

		return testQuestionVO;
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
