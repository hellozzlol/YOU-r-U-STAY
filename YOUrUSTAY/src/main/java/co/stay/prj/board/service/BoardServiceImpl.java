package co.stay.prj.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.stay.prj.board.mapper.BoardMapper;
import co.stay.prj.pgroup.mapper.PgroupMapper;
import co.stay.prj.pgroup.service.PgroupVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper map;
	
	@Autowired
	private PgroupMapper pmap;

	@Override
	public List<BoardVO> boardList(BoardVO vo) {
		return map.boardList(vo);
	}
	
	@Override
	public BoardVO boardSelectOne(BoardVO vo) {
		return map.boardSelectOne(vo);
	}

	@Override
	public int boardInsert(BoardVO vo) {
		
		// Pgroup 테이블 insert 처리가 먼저
		PgroupVO pvo = new PgroupVO(); 
		pmap.fileGroupInsert(pvo);
		
		vo.setFileGid(pvo.getFileGid());
		
		return map.boardInsert(vo);
	}

	@Override
	public int boardUpdate(BoardVO vo) {
		return map.boardUpdate(vo);
	}

	@Override
	public int boardDelete(BoardVO vo) {
		return map.boardDelete(vo);
	}

	@Override
	public List<BoardVO> boardSearch(BoardVO vo) {
		return map.boardSearch(vo);
	}

	

}
