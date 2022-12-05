package co.stay.prj.board.service;

import lombok.Data;

@Data
public class boardVO {
	
	private int boardNo;
	private String boardTitle;
	private String boardPersonnel;
	private String boardLink;
	private String boardContent;
	private String boardDt;
	private int boardHit;
	private String boardCategory;
	private int fileGid;
	private int userNo;

}
