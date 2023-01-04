package com.kh.seeReal.member.model.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class Member {

	private int memberNo; 		//MEMBER_NO
	private String memberId;	//MEMBER_ID
	private String memberPwd;	//MEMBER_PWD
	private String memberPhone;	//MEMBER_PHONE
	private String memberEmail;	//MEMBER_EMAIL
	private String memberPhoto;	//MEMBER_PHOTO
	private Date memberCreateDate;	//MEMBER_CREATEDATE
	private Date memberModifyDate;	//MEMBER_MODIFYDATE
	private String status;		//STATUS
}
