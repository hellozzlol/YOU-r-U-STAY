package co.stay.prj.join.web;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.stay.prj.join.service.JoinService;
import co.stay.prj.login.mapper.LoginMapper;
import co.stay.prj.users.service.UsersVO;

@Controller

public class JoinController {
	@Autowired
	private JoinService js;

	// 회원가입 메인페이지

	@GetMapping("/joinForm")
	public String joinForm() {
		return "member/joinForm";
	}

	@GetMapping("/usersboardList")
	public String usersboardList() {
		return "member/usersboardList";
	}

	// 회원등록
	@PostMapping("member/JoinForm")
	public String userInsert(UsersVO vo) {
		int cnt = js.usersInsert(vo);
		return "redirect:/loginForm";
	}

	// 비밀번호 재설정
	@PostMapping("pwUpdate")
	public String pwUpdate(UsersVO vo) {
		System.out.println(vo.toString());
		int cnt = js.pwUpdate(vo);
		return "redirect:/loginForm";
	}

	// 로그인

	@RequestMapping("/login")
	public String login(HttpServletRequest request, Model model,UsersVO vo) {
		System.out.println("++나오니?"+vo.getUserId());
		System.out.println("++나오니?"+vo.getUserPw());
		request.getSession(true); // 세션 강제 세션 추가
		return "main/main";
	}
	
	//로그인폼
	@GetMapping("/loginForm")
	public String loginForm(HttpServletRequest request, Model model,UsersVO vo) {
		request.getSession(true); // 세션 강제 세션 추가
		return "member/loginForm";
	}

}
