package co.stay.prj.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.stay.prj.test.mapper.TestMapper;
import co.stay.prj.test.service.TestVO;


@Controller
public class TestController {
	
	@Autowired TestMapper test;
	

	@RequestMapping("/testList")
	/*
	 * public String testList(Model model, TestVO vo) {
	 * System.out.println("테스트중"+test.findAll(vo)); model.addAttribute("test",
	 * test.findAll(vo)); return "test/testList"; }
	 */
	
	
	public String testList(Model model,TestVO vo) {
		model.addAttribute("test", test.findAll());
		System.out.println("테스트중"+test.findAll());
		return "test/testList";
	}
	
	
	
	
	
	
}
	
