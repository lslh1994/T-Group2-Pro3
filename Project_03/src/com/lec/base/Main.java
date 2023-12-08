package com.lec.base;

import java.util.Scanner;

import com.lec.add.Add;
import com.lec.div.AddSubMulDiv;
import com.lec.mul.AddSubMul;
import com.lec.remainder.AddSubMulDivRemainder;
import com.lec.sub.AddSub;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2, num3, num4;
		
		//사용자에게 숫자 입력 받음
		System.out.print("1번의 숫자를 입력하세요 : ");
		num1 = scanner.nextInt();
		
		System.out.print("2번의 숫자를 입력하세요 : ");
		num2 = scanner.nextInt();
		
		System.out.print("3번의 숫자를 입력하세요 : ");
		num3 = scanner.nextInt();
		
		System.out.print("4번의 숫자를 입력하세요 : ");
		num4 = scanner.nextInt();

		//생성자로 데이터 불러오기 위해 생성자 객체를 만들고 인자를 넣어줌
		Add ad2 = new Add(num3, num4);
		AddSub sub2 = new AddSub(num3, num4);
		AddSub sub3 = new AddSub(num1, num2, num3);
		AddSubMul asm2 = new AddSubMul(num1, num2, num3);
		
		//제일 마지막 ㅂ
		AddSubMulDivRemainder asdr = new AddSubMulDivRemainder();
		
		asdr.num1 = num1;
		asdr.num2 = num2;
		asdr.num3 = num3;
		asdr.num4 = num4;
		
		
		System.out.println();
		System.out.println(">>>>Field를 사용");
		System.out.println("1. 1번과 2번의 숫자의 합은 "+asdr.getAdd2()+"입니다.");
		System.out.println("2. 1번과 3번, 4번의 덧셈 뺄셈 곱셈 나눗셈의 결과는 덧셈 : "+asdr.getFAdd3()+ ", 뺄셈 : "+ asdr.getFSub() + ", 곱셈 : "+asdr.getFMul() + ", 나눗셈 : "+asdr.getFDiv());
		System.out.println();
		
		System.out.println(">>>>Constructor 사용");
		System.out.println("1. 3번과 4번의 덧셈, 뺄셈, 곱셈의 결과는 덧셈 : "+ad2.getAdd2()+", 뺄셈 : "+sub2.getSub2() + ", 곱셈 : "+asm2.getMul2());
		System.out.println("2. 1,2,3번의 뺄셈과 곱셈의 결과는 뺄셈 : "+sub3.getSub3()+", 곱셈 : "+asm2.getMul3());
		System.out.println();
		
		System.out.println(">>>>Method 사용");
		System.out.println("1. 1번과 2번, 4번의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지의 결과는 덧셈 : "+asdr.getAdd3(num1, num2, num4)+",  뺄셈 : "+asdr.getSub3(num1, num2, num4)+", 곱셈 : "+asdr.getMul3(num1, num2, num4)+", 나눗셈 : "+asdr.getDiv3(num1, num2, num4)+", 나머지 : " +asdr.getRemainder3(num1, num2, num4));
		System.out.println("1. 2번과 4번의 뺄셈과 나눗셈의 결과는 뺄셈 : "+asdr.getSub2(num2, num4)+" , 나눗셈 : "+asdr.getDiv2(num2, num4)+"입니다.");
	}

}
