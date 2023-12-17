package com.lec.sub;

import com.lec.add.Add;

public class AddSub extends Add {

	// Field

	
				
	// Constructor
	
	public AddSub() {
		
	}
	
	public AddSub(int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;
		
	}		
				
				
	// Method
	
	public int fieldAddSub2(int num1, int num2) {
		return num1 + num2;
	}
	public int fieldAddSub3(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	public int constructorAddSub2() {
		return num1 + num2 + num3;
	}
	public int methodAddSub2(int num1, int num2) {
		return num1 + num2 + num3;
	}
	
}
