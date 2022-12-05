package co.stay.prj.review.service;

import lombok.Data;

@Data
public class ReviewVO {
	
	private int reNo;
	private int userNo;
	private int groupNo;
	private String reTitle;
	private String reCont;
	private String reGrade;
	private String reDt;
	private String reState;
	
}
