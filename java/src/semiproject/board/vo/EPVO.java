package semiproject.board.vo;

import lombok.Data;

@Data
public class EPVO {
	int ep_id;
	int ep_name;
	String ep_email;
	String ep_phone_num;
	int ep_dm_num;
	int ep_po_num;
	int ep_st_num;
	int ep_leave;
	String ep_salay;
	
	public EPVO(int ep_name, String ep_email, String ep_phone_num, int ep_dm_num, int ep_po_num, int ep_st_num,
			int ep_leave, String ep_salay) {
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
		return "ep_name" + "ep_email" + "ep_phone_num" + "ep_dm_num" + "ep_po_num"
				+ "ep_st_num" + "ep_leave" + "ep_salay";
	}
}
