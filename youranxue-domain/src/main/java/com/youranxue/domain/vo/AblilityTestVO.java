package com.youranxue.domain.vo;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class AblilityTestVO {

	List<String> header;

	List<Map<String, Object>> detail;

	@Deprecated
	List<TableDetailVO> detailVo;
}
