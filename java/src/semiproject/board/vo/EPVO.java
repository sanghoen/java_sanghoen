package semiproject.board.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EPVO {
	int ep_id; // 직원ID
	String ep_name; // 이름
	String ep_email; // 이메일
	String ep_phone_num; // 연락처
	int ep_dm_num; // 부서 번호
	int ep_po_num; // 직급 번호
	int ep_st_num; // 근무 상태 번호
	int ep_leave; // 남은 연차
	int ep_salay; // 급여
	
	String dm_name; // 부서 이름
	String po_name; // 직급 이름
	String st_type; // 근무 상태 이름
	
	public EPVO(int ep_id, String ep_name, String ep_email, String ep_phone_num,
			int ep_dm_num, int ep_po_num, int ep_st_num, int ep_leave, int ep_salay,
			String dm_name, String po_name, String st_type) {
		this.ep_id = ep_id;
		this.ep_name = ep_name;
		this.ep_email = ep_email;
		this.ep_phone_num = ep_phone_num;
		this.ep_dm_num = ep_dm_num;
		this.ep_po_num = ep_po_num;
		this.ep_st_num = ep_st_num;
		this.ep_leave = ep_leave;
		this.ep_salay = ep_salay;
		
		this.dm_name = dm_name;
		this.po_name = po_name;
		this.st_type = st_type;
	}
	
	public EPVO(int ep_id, String ep_name, String ep_email, String ep_phone_num,
			int ep_dm_num, int ep_po_num, int ep_st_num, int ep_leave, int ep_salay) {
		this.ep_id = ep_id;
		this.ep_name = ep_name;
		this.ep_email = ep_email;
		this.ep_phone_num = ep_phone_num;
		this.ep_dm_num = ep_dm_num;
		this.ep_po_num = ep_po_num;
		this.ep_st_num = ep_st_num;
		this.ep_leave = ep_leave;
		this.ep_salay = ep_salay;
	}
	
	@Override
	public String toString() {
		 return  "직원 번호 "+ ": " + ep_id +"\n"
				 + "이름 "+ ": " + ep_name +"\n"
		         + "이메일 "+ ": " +ep_email +"\n"
		         + "연락처 "+ ": " +ep_phone_num +"\n"
		         + "부서 "+ ": " +dm_name +"\n"
		         + "직급 "+ ": " +po_name +"\n"
		         + "근무 상태 "+ ": " +st_type +"\n"
		         + "남은 연차 "+ ": " +ep_leave +"\n"
		         + "급여 "+ ": " +ep_salay +"\n";
		}
}
