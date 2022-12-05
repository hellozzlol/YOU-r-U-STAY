package co.stay.prj.myhome.service;

import java.sql.Date;

import lombok.Data;

@Data
public class MyhomeVO {
	private int homeNo; // 글 번호
	private String homeTilte;
	private int homeFloor;
	private int homeDeposit;
	private int homeRentpay;
	private Date homePeriod;
	private String homeHeating;
	private String homeInclude;
	private String homeOption;
	private String homeAnother;
	private Date homeDt;
	private int homeHit;
	private int fileGid; // 파일 그룹아이디
	private int userNo; // 유저번호
}
