package asisstedproject;


	public class CallbyValue {
		
		public static void swap(int num1,int num2) {
			num1=45;
			num2=85;
			
			System.out.println("Method inside a = "+num1+" and "+" b = "+num2+" value");

			
		}

		public static void main(String[] args) {
			int a=10;
			int b=30;
			System.out.println("Before Value : a ="+a+" and "+" b = "+b);
		
			swap(a,b);
			
			System.out.println("After value : a ="+a+" and "+" b = "+b);
			
		}
		

	}

