package co.stay.prj.qna.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import co.stay.prj.qna.service.QnaService;
import co.stay.prj.qna.service.QnaVO;

@Controller
public class QnaController {

	@Autowired
	private QnaService qna;
	
	//게시판 리스트 조회
	@GetMapping("/qnaList")
	public String qnaList(Model model, QnaVO vo, 
			@RequestParam(required = false, defaultValue = "1") int pageNum,
			@RequestParam(required = false, defaultValue = "10") int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		model.addAttribute("pageInfo", PageInfo.of(qna.qnaList(vo)));
		return "qna/qnaList";
	}
	
	
	//게시판 글 작성하기
	@RequestMapping("/qnaForm")
	public String qnaForm() {
		return "qna/qnaForm";
	}
	
	
	//게시판 글 등록하기
	@PostMapping("/qnaInsert")
	public String qnaInsert(QnaVO vo) {
		qna.qnaInsert(vo);
		return "redirect:qnaList";
	}
	
	
	//게시판 글 상세보기
	@GetMapping("/qnaSelect")
	public String qnaSelect(QnaVO vo, Model model, HttpServletRequest request) {
		System.out.println(request.getParameter("qnaNo"));
		vo.setQnaNo(Integer.parseInt(request.getParameter("qnaNo")));
		model.addAttribute("qnaSelect", qna.qnaSelect(vo));
		return "qna/qnaSelect";
	}
}
