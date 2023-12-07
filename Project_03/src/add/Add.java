package add;

public class Add {
	// Field
		public String pStr="덧셈";
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
				
		
		
		// Constructor
		
		public Add() {
			
		}
		
		public Add(int num1,int num2,int num3,int num4) {
			this.num1=num1;
			this.num2=num2;
			this.num3=num3;
			this.num4=num4;
		}
				
		//Method
		public void getAdd() {
			System.out.println(num1+num2);
			System.out.println(num1+num2+num3);
			System.out.println(num1+num2+num3+num4);
		}

	}
