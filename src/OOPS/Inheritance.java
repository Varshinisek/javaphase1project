package OOPS;

	class Person{
		String name="varshini";
		int age=21;
		String city="TamilNadu";
		void display() {
			System.out.println("Person class is a super class");
		}
		
	}
	public class Inheritance extends Person {
		
		String dob="June 19";

		public static void main(String[] args) {
			
			Inheritance inher=new Inheritance();
			inher.display();
			
			System.out.println("Person Detail");
			System.out.println("Person Name : "+inher.name);
			System.out.println("Person Age : "+inher.age);
			System.out.println("Person City : "+inher.city );
			System.out.println("Person DOB : "+inher.dob);

			
			
		}

	}


