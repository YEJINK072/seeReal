package com.kh.seeReal.comments.model.vo;

import lombok.Data;

@Data
public class CommentsLike {
	
	private int commentWriter;
	private String commentLike;
	private String disLike;
	private int commentNo;

}
