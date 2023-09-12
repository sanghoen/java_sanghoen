package semiproject.board.service;

import java.util.List;

import semiproject.board.dao.EPDAO;
import semiproject.board.vo.EPVO;

public class EPServiceImp implements EPService{

	private EPDAO epDao;
	
	public EPServiceImp() {
		this.epDao = epDao;
	}
	
	private final String MYBATIS_CONFIG_PATH = "semiproject/board/config/mybatis-config.xml";
	
	@Override
	public List<EPVO> getEPList() {
		return epDao.selectEPList();
	}
}