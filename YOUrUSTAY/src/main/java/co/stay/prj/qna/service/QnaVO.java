package co.stay.prj.qna.service;

import lombok.Data;

@Data
public class QnaVO {
	private int qnaNo;
	private String qnaTitle;
	private String qnaContent;
	private String qnaHit;
	private String qnaoringinNo;
	private String qnagroupOrder;
	private int fileGid;
	
}
