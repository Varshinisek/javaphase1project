package practiseproject_1;

import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
      int n1;
      int  n2;
      int  ans;
      char op;
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      n1 = reader.nextInt ();
      n2 = reader.nextInt ();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      op = reader.next().charAt(0);
      switch(op) {
         case '+': ans = n1+ n2;
            break;
         case '-': ans = n1 - n2;
            break;
         case '*': ans = n1 * n2;
            break;
         case '/': ans = n1 / n2;
            break;
      default: System.out.printf("Error! Enter correct operator");
         return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(n1 + " " + op + " " + n2 + " = " + ans);
   }
}
