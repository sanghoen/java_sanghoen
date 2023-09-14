package semiproject.board.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import db.day3.board.vo.BoardVO;
import semiproject.board.dao.EPDAO;
import semiproject.board.vo.EPVO;

public class EPServiceImp implements EPService{

	private EPDAO epDao;
	
	private final String MYBATIS_CONFIG_PATH = "semiproject/board/config/mybatis-config.xml";
	
	public EPServiceImp() {
		try {
			InputStream is = Resources.getResourceAsStream(MYBATIS_CONFIG_PATH);
			SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(is);
			SqlSession session = sf.openSession(true);
			epDao = session.getMapper(EPDAO.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public EPServiceImp(EPDAO epDao) {
		this.epDao = epDao;
	}

	@Override
	public List<EPVO> getEPList() {
		return epDao.selectEPList();
	}

	@Override
	public boolean deleteEP(EPVO ep) {
		if(ep == null || ep.getEp_name() == null) {
			return false;
		}
		
		EPVO dbEp = epDao.selectEP(ep.getEp_id());
		
		if(dbEp == null) {
			return false;
		}

		if(epDao.deleteEP(ep.getEp_id())) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateEP(EPVO ep) {
		if(ep == null || ep.getEp_name() == null) {
			return false;
		}
		
		EPVO dbEp = epDao.selectEP(ep.getEp_id());
	
		if(dbEp == null) {
			return false;
		}

		dbEp.setEp_name(ep.getEp_name());
		dbEp.setEp_email(ep.getEp_email());
		dbEp.setEp_phone_num(ep.getEp_phone_num());
		dbEp.setEp_dm_num(ep.getEp_dm_num());
		dbEp.setEp_po_num(ep.getEp_po_num());
		dbEp.setEp_st_num(ep.getEp_st_num());
		dbEp.setEp_leave(ep.getEp_leave());
		dbEp.setEp_salay(ep.getEp_salay());
		
		if(epDao.updateEP(dbEp) != 0) {
			return true;
		}
		return false;
	}
}