package co.stay.prj.board.mapper;

import java.util.List;

import co.stay.prj.board.service.BoardVO;
import co.stay.prj.pgroup.service.PgroupVO;
import co.stay.prj.photo.service.PhotoVO;

public interface BoardMapper {
	
	List<BoardVO> boardList(BoardVO vo); //커뮤니티 게시글 전체조회 (페이징처리)
	BoardVO boardSelectOne(BoardVO vo); // 커뮤니티 단건조회
	int boardInsert(BoardVO vo); //커뮤니티 게시글 작성
	int boardUpdate(BoardVO vo); //커뮤니티 게시글 수정
	int boardDelete(BoardVO vo); //커뮤니티 게시글 삭제
	List<BoardVO> boardSearch(BoardVO vo); //커뮤니티 게시글 검색
	
	
	int fileInsert(PhotoVO vo); //사진 테이블 insert

}
