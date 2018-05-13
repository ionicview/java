package com.youranxue.domain.master;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import lombok.Data;

@Service
public class CodeListService {
	private Map<String, List<Code>> codeMap = new HashMap<>();

	@PostConstruct
	public void initCodeList() {
		this.codeMap.put("subjectSelect", newCodeList(new Code(101, "语文"), new Code(102, "数学"), new Code(103, "化学")));
		this.codeMap.put("teachTargetSelect",
				newCodeList(new Code(101, "初中"), new Code(102, "高中"), new Code(103, "小学")));
		this.codeMap.put("termSelect", newCodeList(new Code(101, "上学期"), new Code(102, "下学期")));
		this.codeMap.put("publisherSelect", newCodeList(new Code(101, "人教版"), new Code(102, "北师大版")));

	}

	public Map<String, List<Code>> getCodeList(String... codeName) {
		Map<String, List<Code>> retMap = new HashMap<>();
		for (String cn : codeName) {
			retMap.put(cn, codeMap.get(cn));
		}
		return retMap;
	}

	public Map<String, List<Code>> getAllCodeList() {
		return this.codeMap;
	}

	private List<Code> newCodeList(Code... codes) {
		List<Code> retList = new ArrayList<>();
		for (Code c : codes) {
			retList.add(c);
		}
		return retList;
	}

	@Data
	public class Code {
		private long value;
		private String label;

		public Code(long value, String label) {
			this.value = value;
			this.label = label;
		}
	}
}
