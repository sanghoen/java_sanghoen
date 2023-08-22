package ex.board.vo;

import lombok.Data;

@Data
public class MemberVO {

	private String me_id;
	private String me_pw;

	public MemberVO(String id, String pw) {
		this.me_id = id;
		this.me_pw = pw;
	}
}
