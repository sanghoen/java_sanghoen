package ex.board.service;

import ex.board.dao.MemberDAO;
import ex.board.vo.MemberVO;

public class MemberServiceImp implements MemberService{

	private MemberDAO memberDao;
	private final String MYBATIS_CONFIG_PATH = "ex/board/config/mybatis-config.xml";
	
	@Override
	public boolean signup(MemberVO member) {
		return false;
	}

	@Override
	public boolean withdraw(MemberVO member) {
		return false;
	}

}
