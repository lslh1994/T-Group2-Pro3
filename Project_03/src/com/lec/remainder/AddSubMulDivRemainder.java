package com.lec.remainder;

import com.lec.div.AddSubMulDiv;

public class AddSubMulDivRemainder extends AddSubMulDiv{

	public void getRemainder4(int num1, int num2, int num3, int num4) {
		System.out.println(num1%num2%num3%(double)num4);
	}
	
	public void getRemainder3(int num1, int num2, int num3) {
		System.out.println(num1%num2%(double)num3);
	}
	
	public void getRemainder2(int num1, int num2) {
		System.out.println(num1%num2);
	}
	
}
