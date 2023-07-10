package com.kh.model.vo;

import java.io.Serializable;

public class Test3 implements Serializable{
	
	private String name;
	private int kcal;

	public Test3(){}
	public Test3(String name, int kcal) {
		super();
		this.name = name;
		this.kcal = kcal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	@Override
	public String toString() {
		return "Test3 [name=" + name + ", kcal=" + kcal + "]";
	}
	
}
