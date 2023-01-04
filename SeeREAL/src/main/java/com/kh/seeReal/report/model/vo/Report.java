package com.kh.seeReal.report.model.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class Report {

	private int reportNo; // REPORT_NO	NUMBER
	private String reportWriter; // REPORT_WRITER VARCHAR2(100 BYTE) ?????????????????????????
	private String reportReason; //REPORT_REASON	VARCHAR2(100 BYTE)
	private Date reportDate; // REPORT_DATE	DATE
	private int reportOccured; // REPORT_OCCURED	NUMBER
	private int reportType; //REPORT_TYPE	NUMBER
}
