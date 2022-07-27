package practiseproject2;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class emailvalidation {

	   public static void main(String[] args) {
	       
	       ArrayList<String> emailID = new ArrayList<String>();
	       
	       emailID.add("suba.45@yahoo.com");
	       emailID.add("swetha.4@yahoo.com");
	       emailID.add("varshini.s@gmail.com");
	       emailID.add("dhiviya.5@gmail.com");
	       emailID.add("then.8@gmail.com");
	 
	       
	        String searchEmail = null;
	        System.out.println("Enter the email to search");
	       
	        try (Scanner sc = new Scanner(System.in)) {
	System.out.println("Enter email Id : ");
	         searchEmail = sc.nextLine();
	}
	            if(emailID.contains(searchEmail)){
	         System.out.println("email ID " + searchEmail + " found");
	     }
	     else{
	         System.out.println( "email ID " + searchEmail + " not found");
	     }

	       
	   }

	}




