package co.stay.prj.login.service;

import lombok.Data;

@Data
public class LoginVO {
	private int userNo;
	private String userId;
	private String userPw;
	private String userAuthor;
}
