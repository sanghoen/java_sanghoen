package db.day1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //모든 속성이 다 들어가는 생성자는 이거만 있으면 대체 가능
public class Member {
	private String me_id;
	private String me_pw;
	private int me_board_count;
}
