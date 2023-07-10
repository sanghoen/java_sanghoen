package com.kh.model.vo;

import java.io.ObjectOutputStream;

public class Test4 {

	public void fileSave(String fileName) {

		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputString(fileName));){

		objOut.writeObject(new Food("사과", 20));

		}catch(Exception e){

		e.printStackTrace();

		}

		} //fileSave() close
