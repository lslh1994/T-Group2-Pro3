package com.lec.remainder;

import com.lec.div.AddSubMulDiv;

public class AddSubMulDivRemainder extends AddSubMulDiv {

	/*
	 Date : 2023.12.08
	 Author : Shin-Na-Ra 
	 Description : AddSubMulDivRemainder 
	 */
	
	
	public AddSubMulDivRemainder() {
		
	}
	
	public int getRemainder2(int num1, int num2) {
		return num1 % num2;
	}

	public int getRemainder3(int num1, int num2, int num3) {
		return num1 % num2 % num3;
	}

}
