package co.stay.prj;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@EnableScheduling
@SpringBootApplication
@Controller
@MapperScan(basePackages = "co.stay.prj.**.mapper")
@ComponentScan(basePackages = { "co.stay.prj.**.mapper" })
public class YoUrUstayApplication {
	public static void main(String[] args) {
		SpringApplication.run(YoUrUstayApplication.class, args);
	}

	// 메인화면
	@GetMapping("/")
	public String main() {
		return "main/main";
	}

	// 로그인 폼

	@GetMapping("/loginForm")
	public String loginForm(HttpServletRequest request) {
		// 세션 강제 세션 추가
		request.getSession(true);
		return "member/loginForm";
	}

	// 회원가입 폼

	@GetMapping("/joinForm")
	public String signupForm() {
		return "member/joinForm";
	}

}