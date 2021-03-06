package com.java.persistence;

import java.util.List;

import com.java.domain.BoardVO;
import com.java.domain.Criteria;
import com.java.domain.SearchCriteria;

public interface BoardDAO {
	
	public void create(BoardVO vo);
	public BoardVO read(Integer bno);
	public void update(BoardVO vo);
	public void delete(Integer bno);
	public List<BoardVO> listAll();
	public List<BoardVO> listPage(int page);
	public List<BoardVO> listCriteria(Criteria cri);
	public int countPaging(Criteria cri);
	public List<BoardVO> listSearch(SearchCriteria cri);
	public int listSearchCount(SearchCriteria cri);
	
}
