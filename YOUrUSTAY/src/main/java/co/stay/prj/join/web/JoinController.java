package co.stay.prj.join.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import co.stay.prj.join.service.JoinService;
import co.stay.prj.users.service.usersVO;

@Controller

public class JoinController {
	@Autowired
	private JoinService js;

	


	// 회원가입 메인페이지

	@GetMapping("/joinForm")
	public String joinForm() {
		return "member/joinForm";
	}

	// 회원등록
	@PostMapping("member/JoinForm")
	public String userInsert(usersVO vo) {
		int cnt = js.usersInsert(vo);
		return "redirect:/loginForm";
	}

	// 비밀번호 재설정
	@PostMapping("pwUpdate")
	public String pwUpdate(usersVO vo) {
		System.out.println(vo.toString());
		int cnt = js.pwUpdate(vo);
		return "redirect:/loginForm";
	}

}
