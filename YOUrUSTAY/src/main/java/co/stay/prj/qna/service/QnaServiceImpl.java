package co.stay.prj.qna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.stay.prj.qna.mapper.QnaMapper;

@Service
public class QnaServiceImpl implements QnaService {
	
	@Autowired
	private QnaMapper qna;

	// 게시판 목록
	@Override
	public List<QnaVO> qnaList() {
		return qna.qnaList();
	}

	// 게시판 글 등록
	@Override
	public int qnaInsert(QnaVO vo) {
		return qna.qnaInsert(vo);
	}

}
