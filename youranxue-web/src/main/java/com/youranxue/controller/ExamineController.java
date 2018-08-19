package com.youranxue.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.youranxue.domain.master.CodeListService;
import com.youranxue.domain.vo.ExamineGroupVO;

@RestController
@CrossOrigin
@RequestMapping("/examine")
public class ExamineController {

	@Autowired
	private CodeListService codeListService;

	@ResponseBody
	@RequestMapping(value = "/getAllExamines", method = RequestMethod.GET)
	public List<ExamineGroupVO> getAllExamines() {
		return dummyExamine();
	}

	private List<ExamineGroupVO> dummyExamine() {
		List<ExamineGroupVO> dummyList = new ArrayList<>();
		ExamineGroupVO vo1 = new ExamineGroupVO(1001, "初三上学期数学");
		vo1.addExamine(2001L, "上学期期中测验");
		vo1.addExamine(2002L, "上学期期末测验");

		ExamineGroupVO vo2 = new ExamineGroupVO(2001, "初三下学期数学");
		vo2.addExamine(3001, "下学期期中测验");
		vo2.addExamine(3002, "下学期期末测验");

		dummyList.add(vo1);
		dummyList.add(vo2);
		return dummyList;
	}

}
