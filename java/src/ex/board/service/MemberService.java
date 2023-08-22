package ex.board.service;

import ex.board.vo.MemberVO;

public interface MemberService {

	boolean signup(MemberVO member);

	boolean withdraw(MemberVO member);

}
