package com.youranxue.domain.vo;

import com.alibaba.fastjson.annotation.JSONType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JSONType
@Deprecated
public class TableDetailVO {

	private String name;
	private String student;
	private String clazz;
	private String all;
	private String max;

}
