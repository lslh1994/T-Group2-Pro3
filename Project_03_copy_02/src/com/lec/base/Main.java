package com.lec.base;

import java.util.Scanner;

import com.lec.add.Add;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num1, num2, num3, num4 = 0;
		
		
		System.out.print("1번 숫자를 입력하세요 : ");
		num1 = scanner.nextInt();
		
		System.out.print("2번 숫자를 입력하세요 : ");
		num2 = scanner.nextInt();
		
		System.out.print("3번 숫자를 입력하세요 : ");
		num3 = scanner.nextInt();
		
		System.out.print("4번 숫자를 입력하세요 : ");
		num4 = scanner.nextInt();
		
		Add addField = new Add(); // 1-1번 : com.lec.add 패키지에서 빈 Add 클레스 호출.
		Add addConstructor = new Add(num3, num4); // 2-1 : com.lec.add 패키지에서 Constructor Add 클레스 호출 후 변수 지정.
		Add method = new Add(); // 3-1번 : com.lec.add 패키지에서 빈 Add 클레스 호출.
		
		addField.num1 = num1; //  1-2번 : 메인에 있는 num1을 변수 add 에서 num1로 입력
		addField.num2 = num2; //         메인에 있는 num2을 변수 add 에서 num2로 입력
		
//		>>>Field 를 사용하여 Data 전달
		System.out.println("\n>>>Feid를 사용하여 Data 전달");
		System.out.println("1. 1번과 2번의 숫자의 합은 " + addField.fieldAdd2(num1, num2) + "입니다."); // 1-6번 : Add 클레스 호출, 계산기 이름 쳐서 호출, 매개변수 순서대로 입력 
		System.out.println("2. 1번과 3번, 4번의 덧셈, 뺄셈, 곱셈, 나눗셈의 결과는 덧셈 : " + addField.fieldAdd3(num1, num3, num4));
		
		
//		>>>Constructor 를 사용하여 Data 전달
		System.out.println("\n>>>Constructor를 사용하여 Data 전달");
		System.out.println("1. 3번과 4번의 숫자의 합은 " + addConstructor.constructorAdd2() + "입니다."); // 2-8번 : Add 클레스 호출, 계산기 이름 쳐서 호출
		
		
//		>>>Method 를 사용하여 Data 전달
		System.out.println("\n>>>Method를 사용하여 Data 전달");
		System.out.println("1. 2번과 3번의 숫자의 합은 " + method.methodAdd2(num2, num3) + "입니다."); // 3-2번 : Add 클레스 호출, 매개 변수 입력, 3-5번 : 출력

	}

}
