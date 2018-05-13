package com.youranxue.domain.vo;

import lombok.Data;

@Data
public class Book {

	private Integer bookId;

	private String bookName;

	private String coverImgPath;

	public void addCoverImgPathPrefix(String urlPrefix) {
		if (null == urlPrefix) {
			return;
		}
		this.coverImgPath = urlPrefix.concat(this.coverImgPath);
	}

}
