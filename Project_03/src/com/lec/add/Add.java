package com.lec.add;

public class Add {

	public int num1;
	public int num2;
	public int num3;
	public int num4;

	public Add() {
		
	}

	public Add(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	

	public int getAdd2() {
		return num1 + num2;
	}
	
	public int getAdd3() {
		return num1 + num2 + num3;
	}
	
	public int getFAdd3() {
		return num1 + num3 + num4;
	}
	
	public int getAdd2(int num1, int num2) {
		return num1 + num2;
	}
	
	public int getAdd3(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
}
