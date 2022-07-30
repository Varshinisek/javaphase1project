package asisstedproject;

public class ExceptionHadlingExample {

	public static void main(String[] args) {
		try {
            int a = 100, b = 0;
            int c = a/b;  // cannot divide by 0
            System.out.println ("Result = " + c);
        }
        catch(ArithmeticException e) {
            System.out.println ("A number Can't divided by 0");
        }
	}

}
