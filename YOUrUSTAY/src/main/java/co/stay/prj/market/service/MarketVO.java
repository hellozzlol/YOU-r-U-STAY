package co.stay.prj.market.service;

import java.sql.Date;

import lombok.Data;

@Data
public class MarketVO {
	private int mkNo; // 글 번호
	private String mkCategory; // 카테고리
	private String mkTitle;
	private String mkContent;
	private Date mkDt; // 작성일자
	private int mkPrice; // 물품 가격
	private String mkState; // 거래 상태
	private int mkHit; // 조회수
	private int fileGid; // 파일 그룹아이디
	private int userNo; // 유저번호
}
