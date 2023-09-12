package semiproject.board.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

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
	/*
	public EPServiceImp(EPDAO epDao) {
		this.epDao = epDao;
	}
	*/
	@Override
	public List<EPVO> getEPList() {
		System.out.println("Imp작동");
		return epDao.selectEPList();
	}
}