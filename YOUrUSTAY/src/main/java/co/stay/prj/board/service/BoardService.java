package co.stay.prj.board.service;

import java.util.List;


public interface BoardService {
	
	List<BoardVO> boardList(BoardVO vo); //커뮤니티 게시글 전체조회 (페이징처리)
	BoardVO boardSelectOne(BoardVO vo); // 커뮤니티 단건조회
	int boardInsert(BoardVO vo); //커뮤니티 게시글 작성
	int boardUpdate(BoardVO vo); //커뮤니티 게시글 수정
	int boardDelete(BoardVO vo); //커뮤니티 게시글 삭제
	List<BoardVO> boardSearch(BoardVO vo); //커뮤니티 게시글 검색
	

}
