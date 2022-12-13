package co.stay.prj.qna.mapper;

import java.util.List;

import co.stay.prj.qna.service.QnaVO;

public interface QnaMapper {

	List<QnaVO> qnaList();
	
	int qnaInsert(QnaVO vo);
	
}
