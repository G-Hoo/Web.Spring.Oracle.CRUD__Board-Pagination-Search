package com.board.web.service;

import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.board.web.domain.Board;
import com.board.web.mapper.BoardMapper;

@Service
public class BoardService {
	private static final Logger logger = LoggerFactory.getLogger(BoardService.class);
	
	@Autowired
	BoardMapper mapper;
	
	@SuppressWarnings("unchecked")
	public List<Board> getArticleList(Map<?,?> paramMap) throws Exception {
		logger.info("BoardService - getArticleList (){}", "ENTERED");
		IGetService service = (map) -> mapper.getArticleList(map);
		return (List<Board>) service.execute((Map<String, Object>) paramMap);
	}
	
	@SuppressWarnings("unchecked")
	public int count(Map<?,?> paramMap) throws Exception {
		logger.info("BoardService - count (){}", "ENTERED");
		IGetService service = (map) -> mapper.count(map);
		return (int) service.execute((Map<String, Object>) paramMap);
	}
}