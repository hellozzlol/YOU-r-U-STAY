package co.stay.prj.users.service;

import java.util.List;

import co.stay.prj.login.service.LoginVO;
import co.stay.prj.photo.service.PhotoVO;
import co.stay.prj.scrap.service.ScrapVO;

public interface UsersService {
	//내정보 조회(단건조회)
	UsersVO usersSelect(UsersVO vo);
	// 내 정보수정
	int userUpdate(UsersVO vo);
	// 회원 삭제
	int userDelete(UsersVO vo);
	//사진불러오기
	List<PhotoVO> photoList(PhotoVO vo);
	//내 스크랩조회
	List<ScrapVO> scrapList(ScrapVO vo);
	//전체리스트
	List<UsersVO> userSelectList();
	//등록
	int usersInsert(UsersVO vo);
	List<LoginVO> lohingList(LoginVO vo);
	
}
