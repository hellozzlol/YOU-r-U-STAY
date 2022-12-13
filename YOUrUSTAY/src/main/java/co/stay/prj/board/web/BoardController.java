package co.stay.prj.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import co.stay.prj.board.service.BoardService;
import co.stay.prj.board.service.BoardVO;
import co.stay.prj.cmmncd.service.CmmnCdService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boService; // 커뮤니티 서비스
	
	@Autowired
	private CmmnCdService cdService; // 공통코드 서비스

	// 커뮤니티 글 작성 폼
	@GetMapping("/boardInsertForm")
	public String boardInsertForm(Model model) {
		
		model.addAttribute("boardList", cdService.boardList());
		model.addAttribute("limitList", cdService.limitList());
		return "board/boardInsertForm";
	}
	
	// 커뮤니티 글 리스트
	@GetMapping("/boardList")
	public String boardList() {
		return "board/boardList";
	}
	
	// 커뮤니티 게시글 insert
	@PostMapping("/boardInsert")
	public String boardInsert(BoardVO vo) {
		boService.boardInsert(vo);
		return "redirect:boardList";
	}
	
	

}
