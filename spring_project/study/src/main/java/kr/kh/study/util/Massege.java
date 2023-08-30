package kr.kh.study.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Massege {
	private String url, msg;
	
	public String toString() {
		return "{url + msg}";
	}
}
