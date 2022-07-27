package asisstedproject;

public class innerclass1 {

		 private String msg="Welcome to Java"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
		 }  


		public static void main(String[] args) {

			innerclass1 obj=new innerclass1();
			innerclass1.Inner in=obj.new Inner();  
			in.hello();  
		}
	}


