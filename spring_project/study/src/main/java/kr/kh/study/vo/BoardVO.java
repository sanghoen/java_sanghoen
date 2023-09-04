package kr.kh.study.vo;

import lombok.Data;

@Data
public class BoardVO {
	private int bo_num;
	private String bo_title;
	private String bo_contents;
	private int bo_views;
	private Data bo_reg_date;
	private Data bo_up_date;
	private int bo_ori_num;
	private String bo_me_id;
	private int bo_up;
	private int bo_down;
	private int bo_coment;
	private int bo_bt_num;
}