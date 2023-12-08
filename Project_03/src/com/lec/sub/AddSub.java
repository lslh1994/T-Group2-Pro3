package com.lec.sub;

import com.lec.add.Add;

public class AddSub extends Add{
	
	public AddSub() {
		
	}
	
	public AddSub(int num1, int num2) {
		this.num3 = num1;
		this.num4 = num2;
	}
	
	public AddSub(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	public int getSub2() {
		return num3 - num4;
	}
	
	public int getSub3() {
		return num1 - num2 - num3;
	}

	public int getSub3(int a, int b, int c) {
		return a - b - c;
	}

	public int getSub2(int a, int b) {
		return a - b;
	}
	

	public int getFSub() {
		return (num1 - num3) - num4;
	}
	
}
