package co.stay.prj.join.service;



import org.springframework.boot.autoconfigure.domain.EntityScan;

import co.stay.prj.users.service.usersVO;

@EntityScan
public interface JoinService {
	int usersInsert(usersVO vo); // 일반회원등록

	String stateUpdate(usersVO vo); // 회원상태수정

	int idChk(String id); // 일반회원 id 중복체크

	int nickChk(String id);// 닉네임중복체크

	int pwUpdate(usersVO vo); // 비밀번호 재설정
}
