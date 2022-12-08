package co.stay.prj.market.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.stay.prj.market.service.MarketService;

@Controller
public class MarketController {
	
	@Autowired
	private MarketService market;
	
	
	// 중고장터 게시판 리스트 조회
	@GetMapping("/marketList")
	public String marketList(Model model) {
		model.addAttribute("marketList", market.marketList());
		return "market/marketList";
	}
	
	// 작성폼 호출
	@RequestMapping("/marketForm")
	public String marketForm() {
		return "market/marketForm";
	}
}
