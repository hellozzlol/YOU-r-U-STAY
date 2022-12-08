package co.stay.prj.myhome.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyhomeController {
	
	// 이어살기 글 작성 폼
	@GetMapping("/myhomeInsertForm")
	public String myhomeInsertForm() {
		return "myhome/myhomeInsertForm";
	}
	
	// 커뮤니티 글 리스트 (썸네일 카드형)
	@GetMapping("/myhomeList")
	public String myhomeList() {
		return "myhome/myhomeList";
	}
}
