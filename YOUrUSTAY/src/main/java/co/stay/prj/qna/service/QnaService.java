package co.stay.prj.qna.service;

import java.util.List;

public interface QnaService {
	
	List<QnaVO> qnaList();

	int qnaInsert(QnaVO vo);
}
