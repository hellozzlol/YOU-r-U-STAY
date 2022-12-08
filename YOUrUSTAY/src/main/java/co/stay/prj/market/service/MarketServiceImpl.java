package co.stay.prj.market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.stay.prj.market.mapper.MarketMapper;

@Service
public class MarketServiceImpl implements MarketService {

	@Autowired
	private MarketMapper mm;
	
	@Override
	public List<MarketVO> marketList() {
		return mm.marketList();
	}

	@Override
	public MarketVO marketSelect(MarketVO vo) {
		return mm.marketSelect(vo);
	}

	
}
