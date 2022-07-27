package asisstedproject;

public class innerclass2 {

		private String msg="Inner Classes";

		 void display(){  
			 class Inner{  
				 void msg(){
					 System.out.println(msg);
				 }  
		  }  
		  
		  Inner l=new Inner();  
		  l.msg();  
		 }  

		 
		public static void main(String[] args) {
			innerclass2  ob=new innerclass2 ();  
			ob.display();  
			}
		}



