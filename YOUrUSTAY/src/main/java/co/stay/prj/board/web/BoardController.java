package co.stay.prj.board.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

	// 커뮤니티 글 작성 폼
	@GetMapping("/boardInsertForm")
	public String boardInsertForm() {
		return "board/boardInsertForm";
	}
	
	// 커뮤니티 글 리스트
	@GetMapping("/boardList")
	public String boardList() {
		return "board/boardList";
	}
	
	

}
