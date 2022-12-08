package co.stay.prj.market.service;

import java.util.List;

public interface MarketService {

	List<MarketVO> marketList();
	
	MarketVO marketSelect(MarketVO vo); // 게시글 상세조회
	
}
