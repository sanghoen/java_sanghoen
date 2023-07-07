package day28.baseballGame.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Record implements Serializable{
	
	private static final long serialVersionUID = -815093153311994737L;
	private String name;
	private int count;
	@Override
	public String toString() {
		return "[" + name + " : " + count + "]";
	}
	
}
