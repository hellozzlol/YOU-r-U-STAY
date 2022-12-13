package co.stay.prj.qna.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.stay.prj.qna.service.QnaService;

@Controller
public class QnaController {

	@Autowired
	private QnaService qna;
	
	//게시판 리스트 조회
	@GetMapping("/qnaList")
	public String qnaList(Model model) {
		model.addAttribute("qnaList", qna.qnaList());
		return "qna/qnaList";
	}
	
	
	//게시판 글 작성하기
	@RequestMapping("/qnaForm")
	public String qnaForm() {
		return "qna/qnaForm";
	}
	
	
	//게시판 글 등록하기
	@PostMapping("/qnaInsert")
	public String qnaInsert() {
		return "redirect:qnaList";
	}
}
