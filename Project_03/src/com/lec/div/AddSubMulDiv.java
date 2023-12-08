package com.lec.div;

import com.lec.mul.AddSubMul;

public class AddSubMulDiv extends AddSubMul{
	
	public AddSubMulDiv() {
		
	}
	
	public AddSubMulDiv(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public int getDiv2(int num1, int num2) {
		return num1/num2;
	}
	
	public int getDiv3(int num1, int num2, int num3) {
		return num1/num2/num3;
	}
	
	public int getDiv3() {
		return num1/num2/num3;
	}
	

	public double getFDiv() {
		return (double)num1/ num3 / num4;
	}
	
}
