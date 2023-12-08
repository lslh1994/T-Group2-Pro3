package com.lec.remainder;

import com.lec.div.AddSubMulDiv;

public class AddSubMulDivRemainder extends AddSubMulDiv {

	public AddSubMulDivRemainder() {
		
	}
	
	public int getRemainder2(int num1, int num2) {
		return num1 % num2;
	}

	public int getRemainder3(int num1, int num2, int num3) {
		return num1 % num2 % num3;
	}

}
