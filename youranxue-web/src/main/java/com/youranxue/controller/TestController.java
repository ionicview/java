package com.youranxue.controller;

import java.util.ArrayList;
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
import com.youranxue.domain.vo.QuestionFillBlankBlankVO;
import com.youranxue.domain.vo.QuestionFillBlankVO;
import com.youranxue.domain.vo.QuestionNumberVO;
import com.youranxue.domain.vo.QuestionShortAnswerSubQuestionVO;
import com.youranxue.domain.vo.QuestionShortAnswerVO;
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

		TestQuestionVO testQuestionVO = new TestQuestionVO();
		testQuestionVO.addQuestionChoice(dummyChoiceQuestion());
		testQuestionVO.addQuestionFillBlank(dummyFillBlankQuetion());
		testQuestionVO.addQuestionShortAnswer(dummyShortAnswer());
		return testQuestionVO;
	}

	QuestionFillBlankVO dummyFillBlankQuetion() {
		QuestionFillBlankVO fillBlankVO = new QuestionFillBlankVO();
		fillBlankVO.setQuestion(
				"1. 如图，$\\triangle ABC$中，$\\angle A= 36^{\\circ}$，$\\angle B= 72^{\\circ}$，$\\angle ACB$的平分线交$AB$于$D$，则图中共有等腰三角形#BLANK#个.");
		QuestionFillBlankBlankVO blankVO = new QuestionFillBlankBlankVO();
		fillBlankVO.addImage("image/imageDisplay/imgouter/6.svg");
		blankVO.setYourAnswer("3");
		blankVO.setReadOnlyMode(true);
		fillBlankVO.addBlank(blankVO);

		return fillBlankVO;
	}

	QuestionChoiceVO dummyChoiceQuestion() {

		QuestionChoiceVO choiceVO = new QuestionChoiceVO();
		choiceVO.addImg("image/imageDisplay/imgouter/3.svg");

		choiceVO.setQuestion(
				"1. 如图，$\\triangle ABC$中，$\\angle A= 36^{\\circ}$，$\\angle B= 72^{\\circ}$，$\\angle ACB$的平分线交$AB$于$D$，则图中共有等腰三角形(　)");

		QuestionChoiceOptionVO optionVO1 = new QuestionChoiceOptionVO();
		optionVO1.setChoiceId(1001);
		optionVO1.setChoiceItem(" 2个");
		optionVO1.setSequenceNo(65);
		optionVO1.setRightAnswerFlg(false);
		// optionVO1.addImage("image/imageDisplay/imgouter/4.svg");
		choiceVO.addQuestionChoiceOption(optionVO1);

		QuestionChoiceOptionVO optionVO2 = new QuestionChoiceOptionVO();
		optionVO2.setChoiceId(1002);
		optionVO2.setChoiceItem(" 3个");
		optionVO2.setSequenceNo(66);
		optionVO2.setRightAnswerFlg(false);
		choiceVO.addQuestionChoiceOption(optionVO2);

		QuestionChoiceOptionVO optionVO3 = new QuestionChoiceOptionVO();
		optionVO3.setChoiceId(1003);
		optionVO3.setChoiceItem(" 4个");
		optionVO3.setSequenceNo(67);
		optionVO3.setRightAnswerFlg(false);
		choiceVO.addQuestionChoiceOption(optionVO3);

		QuestionChoiceOptionVO optionVO4 = new QuestionChoiceOptionVO();
		optionVO4.setChoiceId(100);
		optionVO4.setChoiceItem(" 5个");
		optionVO4.setSequenceNo(68);
		optionVO4.setRightAnswerFlg(false);
		choiceVO.addQuestionChoiceOption(optionVO4);
		return choiceVO;
	}

	QuestionShortAnswerVO dummyShortAnswer() {
		QuestionShortAnswerVO sav = new QuestionShortAnswerVO();
		sav.setShortAnswerId(5001);
		sav.setShortAnswerContent(
				"1. 已知函数 $f(x)=\\displaystyle \\lim_{n \\to \\infty}\\sum_{k=1}^n \\frac{1}{k^2}$");
		sav.addImages("image/imageDisplay/imgouter/4.svg");
		List<QuestionShortAnswerSubQuestionVO> subQuestionList = new ArrayList<>();
		QuestionShortAnswerSubQuestionVO s1 = new QuestionShortAnswerSubQuestionVO();
		s1.setShortAnswerContent("(1) 试判断函数 $f(x)$ 的零点个数；");
		s1.addImages("image/imageDisplay/imgouter/5.svg");
		
		QuestionShortAnswerSubQuestionVO s2 = new QuestionShortAnswerSubQuestionVO();
		s2.setShortAnswerContent("(2) 求 $f(x)$ 的极限值；");
		
		subQuestionList.add(s1);
		subQuestionList.add(s2);
		sav.setSubQuestionList(subQuestionList);
		
		return sav;
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
