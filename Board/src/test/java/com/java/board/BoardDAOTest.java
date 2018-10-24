package com.java.board;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.java.domain.BoardVO;
import com.java.domain.Criteria;
import com.java.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDAOTest {
	
	@Autowired
	private BoardDAO dao;
	
	private static Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	
	@Test
	public void testCreate() throws Exception {
		BoardVO vo = new BoardVO();
		vo.setTitle("����2");
		vo.setContent("����");
		vo.setWriter("�ۼ���");
		
		dao.create(vo);
	}
	
	@Test
	public void testListPage() {
		int page = 3;
		
		List<BoardVO> list = dao.listPage(page);
		
		for(BoardVO vo : list) {
			logger.info(vo.getBno() + ": " + vo.getTitle());
		}
	}
	
	@Test
	public void testListCriteria() {
		Criteria cri = new Criteria();
		cri.setPage(2);
		cri.setPerPageNum(20);
		
		List<BoardVO> list = dao.listCriteria(cri);
		
		for(BoardVO vo : list) {
			logger.info(vo.getBno() + ": " + vo.getTitle());
		}
	}

}
