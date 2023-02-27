package co.stay.prj.qna.service;

import java.util.List;

public interface QnaService {
	
	List<QnaVO> qnaList(QnaVO vo); // 

	int qnaInsert(QnaVO vo);
	
	int qnaSelect(QnaVO vo);
	
	
	
	
}
