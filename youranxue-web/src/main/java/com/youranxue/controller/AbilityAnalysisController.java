package com.youranxue.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.youranxue.domain.util.Constants;
import com.youranxue.domain.vo.AblilityTestVO;
import com.youranxue.domain.vo.TableDetailVO;

@SuppressWarnings("deprecation")
@CrossOrigin
@RestController
@RequestMapping("/ability-analysis")
public class AbilityAnalysisController {

	/**
	 * JSON
	 * 
	 * @return
	 */
	@RequestMapping(value = "table-json", method = { RequestMethod.GET, RequestMethod.POST })
	public String getChartsMap() {

		AblilityTestVO vo = new AblilityTestVO();

		List<String> header = Arrays.asList("成绩/知识", "学生", "班级", "全体", "满分");

		List<Map<String, Object>> detailMap = makeDetailMap();

		vo.setHeader(header);
		vo.setDetail(detailMap);

		// serializes
		return JSON.toJSONString(vo);
	}

	/**
	 * map
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "table-map", method = { RequestMethod.GET, RequestMethod.POST })
	public AblilityTestVO getChartsMapOld() {

		AblilityTestVO vo = new AblilityTestVO();

		List<String> header = Arrays.asList("成绩/知识", "学生", "班级", "全体", "满分");
		List<Map<String, Object>> detailMap = makeDetailMap();

		vo.setHeader(header);
		vo.setDetail(detailMap);

		return vo;
	}

	/**
	 * VO
	 * 
	 * @return
	 */
	@Deprecated
	@ResponseBody
	@RequestMapping(value = "table-vo", method = { RequestMethod.GET, RequestMethod.POST })
	public AblilityTestVO getChartsVO() {

		AblilityTestVO vo = new AblilityTestVO();

		List<String> header = Arrays.asList("成绩/知识", "学生", "班级", "全体", "满分");

		List<TableDetailVO> detail = makeDetailVO();

		vo.setHeader(header);
		vo.setDetailVo(detail);

		return vo;
	}

	/**
	 * 创建表结构中的明细行
	 * 
	 * @return 明细行 VO
	 */
	private List<TableDetailVO> makeDetailVO() {
		TableDetailVO vo1 = TableDetailVO.builder().name("整数的认识").student("95.7").clazz("90").all("80").max("100")
				.build();
		TableDetailVO vo2 = TableDetailVO.builder().name("整数的运算").student("40").clazz("45").all("30").max("50").build();
		TableDetailVO vo3 = TableDetailVO.builder().name("JAVA-BAKCEND").student("95.7").clazz("90").all("80")
				.max("100").build();
		return Arrays.asList(vo1, vo2, vo3);
	}

	/**
	 * 创建表结构中的明细行
	 * 
	 * @return 明细行 MAP
	 */
	private static List<Map<String, Object>> makeDetailMap() {
		Map<String, Object> map1 = new HashMap<>();
		map1.put(Constants.NAME, "整数的认识");
		map1.put(Constants.STUDENT, 95.7);
		map1.put(Constants.CLAZZ, 90);
		map1.put(Constants.ALL, 80);
		map1.put(Constants.MAX, 100);

		Map<String, Object> map2 = new HashMap<>();
		map2.put(Constants.NAME, "JAVA-BAKCEND1");
		map2.put(Constants.STUDENT, 40);
		map2.put(Constants.CLAZZ, 45);
		map2.put(Constants.ALL, 30);
		map2.put(Constants.MAX, 50);

		Map<String, Object> map3 = new HashMap<>();
		map3.put(Constants.NAME, "JAVA-BAKCEND2");
		map3.put(Constants.STUDENT, 40);
		map3.put(Constants.CLAZZ, 45);
		map3.put(Constants.ALL, 30);
		map3.put(Constants.MAX, 50);
		
		Map<String, Object> map4 = new HashMap<>();
		map4.put(Constants.NAME, "整数的运算");
		map4.put(Constants.STUDENT, 40);
		map4.put(Constants.CLAZZ, 45);
		map4.put(Constants.ALL, 30);
		map3.put(Constants.MAX, 50);
		
		Map<String, Object> map5 = new HashMap<>();
		map5.put(Constants.NAME, "对称");
		map5.put(Constants.STUDENT, 40);
		map5.put(Constants.CLAZZ, 45);
		map5.put(Constants.ALL, 30);
		map5.put(Constants.MAX, 50);

		List<Map<String, Object>> result = new ArrayList<>();

		result.add(map1);
		result.add(map2);
		result.add(map3);
		result.add(map4);
		result.add(map5);

		return result;
	}

	/**
	 * Test
	 * 
	 * @param args
	 * @throws JsonProcessingException
	 */
	public static void main(String[] args) throws JsonProcessingException {
		List<Map<String, Object>> makeDetailMap = makeDetailMap();
		ObjectMapper objectMapper = new ObjectMapper();
		String writeValueAsString = objectMapper.writeValueAsString(makeDetailMap);
		System.out.println(writeValueAsString);

	}

}
