package semiproject.board.service;

import java.util.List;

import semiproject.board.dao.EPDAO;
import semiproject.board.vo.EPVO;

public class EPServiceImp implements EPService{

	private EPDAO epDao;
	
	@Override
	public List<EPVO> getEPList() {
		return epDao.selectBoardList();
	}
}
