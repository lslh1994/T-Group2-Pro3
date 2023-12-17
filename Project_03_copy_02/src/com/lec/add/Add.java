package com.lec.add;

public class Add {
	
		// Field
		public int num1, num2, num3, num4 = 0; // 1-4, 2-5번 : num1~4 초기화
				
		
		
		// Constructor
		
		public Add() { // 1-3, 2-2번 : Add 생성자를 초기화. 
			
		}
		
		public Add(int num1, int num2) { // 2-3번 : 생성자 이름을 무조건 위와 동일하게 만들어야함(메인에서 매개변수 차이로 생성자 차이 알아야함.)
			
			this.num1 = num1; // 2-4 : 받은 매개변수 num1를 Field 에 있는 num1로 초기화.
			this.num2 = num2; //       받은 매개변수 num2를 Field 에 있는 num2로 초기화.
	
//		public 뒤에 나오는 return type 이 없으므로 return 안해도 됨.
			
		}
		
		
		//Method
		public int fieldAdd2(int num1, int num2) { // 1-5번 : return 타입 정해주고 계산기 이름 정해주고 전달할 값을 정해주기
			return num1 + num2; // 1-5번 : 계산 후 fieldAdd2(int num1, int num2)에 다시 return 값으로 보냄.
		}
		
		public int fieldAdd3(int num1, int num2, int num3) {
			return num1 + num2 + num3;
		}
		
		public int constructorAdd2() { // 2-6번 : 초기화한 num1, num2 값을 받음.
			return num1 + num2; // 2-7번 : 계산 후 constructorAdd2()에 return 값으로 보냄.
		}
		public int methodAdd2(int num1, int num2) { // 3-3번 : 2개 매개변수를 다이렉트로 받음.
			return num1 + num2; // 3-4번 : 계산 후 methodAdd2(int num1, int num2)에 return 값으로 보냄.
		}

	}
