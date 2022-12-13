package co.stay.prj.cmmncd.mapper;

import java.util.List;

import co.stay.prj.cmmncd.service.CmmncdVO;

public interface CmmnCdMapper {
	
	List<CmmncdVO> boardList(); //커뮤니티 공통코드 리스트
	List<CmmncdVO> limitList(); // 정원 공통코드 리스트

}
