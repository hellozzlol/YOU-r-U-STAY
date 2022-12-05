package co.stay.prj.test.mapper;

import java.util.List;

import co.stay.prj.test.service.TestVO;



/*public interface TestMapper {
	public List<TestVO> findAll(TestVO vo); // public 생략 가능
}*/


public interface TestMapper {
	public List<TestVO> findAll(); // public 생략 가능
}
