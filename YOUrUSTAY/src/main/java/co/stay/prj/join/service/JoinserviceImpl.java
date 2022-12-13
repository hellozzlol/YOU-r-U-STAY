package co.stay.prj.join.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import co.stay.prj.join.mapper.JoinMapper;
import co.stay.prj.users.service.usersVO;

@Service
public class JoinserviceImpl implements JoinService {

	@Autowired
	private JoinMapper jm;

	// 일반회원 등록
	@Override
	public int usersInsert(usersVO vo) {
		// 비밀번호 암호화(DB)
		BCryptPasswordEncoder Pencoder = new BCryptPasswordEncoder();
		String result = Pencoder.encode(vo.getUserPw());
		vo.setUserPw(result);
		return jm.usersInsert(vo);

	}

	@Override
	public String stateUpdate(usersVO vo) {
		// 회원상태업데이트
		return null;
	}

	@Override
	public int idChk(String id) {
		// 아이디중복체크
		return jm.idChk(id);
	}

	@Override
	public int nickChk(String id) {
		// 닉네임중복체크
		return jm.nickChk(id);
	}

	// 비밀번호재설정
	@Override
	public int pwUpdate(usersVO vo) {
		BCryptPasswordEncoder Pencoder = new BCryptPasswordEncoder();
		String result = Pencoder.encode(vo.getUserPw());
		vo.setUserPw(result);
		return jm.usersInsert(vo);
	}

}
