package com.lec.mul;

import com.lec.sub.AddSub;

public class AddSubMul extends AddSub{
	
	public AddSubMul() {
		
	}
	
	public AddSubMul(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public int getMul2() {
		return num1 * num2;
	}
	
	public int getMul3() {
		return num1 * num2 * num3;
	}
	
	public int getFMul() {
		return num1 * num3 * num4;
	}
	
	public int getMul2(int num1, int num2) {
		return num1 * num2;
	}
	
	public int getMul3(int num1, int num2, int num3) {
		return num1 * num2 * num3;
	}
	
}
