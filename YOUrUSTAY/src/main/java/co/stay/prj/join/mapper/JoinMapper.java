package co.stay.prj.join.mapper;

import co.stay.prj.users.service.usersVO;

public interface JoinMapper {
	int usersInsert(usersVO vo); //일반회원등록
	
	String stateUpdate(usersVO vo); //회원상태수정
	
	int idChk(String id); // 일반회원 id 중복체크
	int nickChk(String id);// 닉네임중복체크
	int pwUpdate(usersVO vo); //비밀번호 재설정
}
