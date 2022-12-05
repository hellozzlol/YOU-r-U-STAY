package co.stay.prj.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.stay.prj.test.mapper.TestMapper;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestMapper map;

	@Override
	public List<TestVO> findAll() {
		return map.findAll();
	}

	/*
	 * @Override public List<TestVO> findAll(TestVO vo) { System.out.println("테스트중"
	 * + map.findAll(vo)); return map.findAll(vo); }
	 */
	
	

}
