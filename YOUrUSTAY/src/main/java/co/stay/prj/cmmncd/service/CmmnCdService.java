package co.stay.prj.cmmncd.service;

import java.util.List;

public interface CmmnCdService {
	
	List<CmmncdVO> boardList(); // 커뮤니티 공통코드 리스트
	List<CmmncdVO> limitList(); // 정원 공통코드 리스트

}
