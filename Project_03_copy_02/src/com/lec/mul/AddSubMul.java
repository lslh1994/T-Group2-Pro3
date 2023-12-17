package com.lec.mul;

import com.lec.sub.AddSub;

public class AddSubMul extends AddSub{
	
//	Parents의 모든 기능을 가져온다!
	
//	Field

	
	
	
	
//	Constructor
	
	
	public AddSubMul() {
		
	}
	
	public AddSubMul(int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	
//	Method

	
	public int fieldAddSubMul2(int num1, int num2) {
		return num1 + num2;
	}
	public int fieldAddSubMul3(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	public int constructorAddSubMul2() {
		return num1 + num2 + num3;
	}
	public int methodAddSubMul2(int num1, int num2) {
		return num1 + num2 + num3;
	}
	
	

}
