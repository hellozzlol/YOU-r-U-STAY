package co.stay.prj.board.service;

import java.util.List;

import co.stay.prj.pgroup.service.PgroupVO;
import co.stay.prj.photo.service.PhotoVO;
import lombok.Data;

@Data
public class BoardVO {
	
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
	
	private String ustate; // 파일 그룹 테이블 - 사용여부
	
	private List<PhotoVO> Photo; // 파일 테이블

}
