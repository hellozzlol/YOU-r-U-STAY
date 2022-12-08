package co.stay.prj.market.mapper;

import java.util.List;

import co.stay.prj.market.service.MarketVO;

public interface MarketMapper {
	
	List<MarketVO> marketList();
	
	MarketVO marketSelect(MarketVO vo); // 게시글 상세조회
}
