package co.stay.prj.cmmncd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.stay.prj.cmmncd.mapper.CmmnCdMapper;

@Service
public class CmmnCdServiceImpl implements CmmnCdService {
	
	@Autowired
	private CmmnCdMapper map; //공통코드 mapper

	@Override
	public List<CmmncdVO> boardList() {
		return map.boardList();
	}

	@Override
	public List<CmmncdVO> limitList() {
		return map.limitList();
	}

	

}
