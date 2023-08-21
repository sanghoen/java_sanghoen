package db.day3.board.vo;

import lombok.Data;

@Data //게터 세터 쓰기 위해
public class MemberVO {
	private String me_id;
	private String me_pw;
	private int me_board_count;
	
	//생성자가 추가 될 수 있다.(객체를 편하게 만들기 위하여)
	public MemberVO(String id, String pw) {
		this.me_id = id;
		this.me_pw = pw;
	}
	
	//다른 setter와 getter가 필요할 때 추가 가능 : EX)날짜 관련해서 
}