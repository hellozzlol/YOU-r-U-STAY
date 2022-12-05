package co.stay.prj.users.service;

import lombok.Data;

@Data
public class usersVO {
	
	private int userNo;
	private String userId;
	private String userPw;
	private String userToken;
	private String userName;
	private String userNick;
	private String userCall;
	private String userEmail;
	private String userAddress;
	private String userAuthor;
	private int fileGid;

}
