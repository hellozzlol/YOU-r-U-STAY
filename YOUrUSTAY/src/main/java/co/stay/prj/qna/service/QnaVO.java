package co.stay.prj.qna.service;

import java.sql.Date;

import lombok.Data;

@Data
public class QnaVO {
	private int qnaNo;
	private String qnaTitle;
	private String qnaContent;
	private int qnaHit;
	private int qnaoringinNo; // 원 글 번호
	private int qnagroupOrder; // 원 글에 대한 순서
	private int qnagrouplayer; // 답글 계층(원 글에 대한 답글인지, 답글에 대한 답글인지 구분)
	private String qnaCategory;
	private String qnaAttach; // 파일첨부 하나만 
	private String qnaAttachDir;
	private Date qnaDt; // 작성일자
	private int userNo; // 유저번호
	
	 
}
