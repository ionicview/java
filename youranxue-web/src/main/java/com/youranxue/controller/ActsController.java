package com.youranxue.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;

@CrossOrigin
@RestController
@RequestMapping("/acts")
public class ActsController {

	@ResponseBody
	@RequestMapping(value = "header", method = { RequestMethod.GET, RequestMethod.POST })
	public ActsHeader getHeader() {

		// header
		List<String> colums = Arrays.asList("满分", "得分", "班级平均分", "答对题", "答错题");
		// points
		List<? extends Number> points = Arrays.asList(150, 120, 100.1, 16, 4);

		return new ActsHeader(colums, points);
	}

	@ResponseBody
	@RequestMapping(value = "charts", method = { RequestMethod.GET, RequestMethod.POST })
	public List<ActsChart> getCharts() {

		List<ChartData> knowledgeList = new ArrayList<>();
		knowledgeList.add(new ChartData("knowledge1", Arrays.asList(65, 59, 80, 81, 56, 55, 40)));
		knowledgeList.add(new ChartData("knowledge2", Arrays.asList(28, 48, 40, 19, 86, 27, 90)));
		ActsChart knowledgeChart = new ActsChart("knowledge", knowledgeList);

		List<ChartData> skillList = new ArrayList<>();
		skillList.add(new ChartData("skill1", Arrays.asList(65, 59, 80, 81, 56, 55, 40)));
		skillList.add(new ChartData("skill2", Arrays.asList(28, 48, 40, 19, 86, 27, 90)));
		skillList.add(new ChartData("skill3", Arrays.asList(12, 13, 14, 50, 18, 25, 100)));
		ActsChart skillChart = new ActsChart("skill", skillList);

		List<ChartData> abilityList = new ArrayList<>();
		abilityList.add(new ChartData("ability1", Arrays.asList(65, 59, 80, 81, 56, 55, 40)));
		abilityList.add(new ChartData("ability2", Arrays.asList(20, 30, 40, 50, 70, 37, 90)));
		ActsChart abilityChart = new ActsChart("ability", abilityList);

		return Arrays.asList(knowledgeChart, skillChart, abilityChart);
	}

	@Data
	@AllArgsConstructor
	private class ActsHeader {
		/**
		 * Column
		 * <p>
		 * table header
		 */
		private List<String> colums;
		/**
		 * points
		 * <p>
		 * points
		 */
		private List<? extends Number> points;
	}

	@Data
	@AllArgsConstructor
	private class ActsChart {
		/**
		 * category
		 */
		private String category;
		/**
		 * chartDatasets
		 * <p>
		 * <key,value>=><label, data>
		 */
		private List<ChartData> chartDatasets;
	}

	@Data
	@AllArgsConstructor
	private class ChartData {
		/**
		 * label
		 */
		private String label;
		/**
		 * data
		 */
		private List<? extends Number> data;
	}

}
