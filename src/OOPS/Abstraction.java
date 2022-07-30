package OOPS;


	abstract class Student{
		abstract void degree();
	}
	class Employee extends Student{
		void degree() {
			System.out.println("Student1 degree: B.E Electronics and Instrumentation");
		}
		void salary(int a) {
			System.out.println("Annual salary : "+a);
		}
	}
	class Parent extends Student{
		void degree() {
			System.out.println("Student2 Degree : Electronincs and communication");
		}
	}
	public class Abstraction {

		public static void main(String[] args) {
			Employee em=new Employee();
			em.degree();
			em.salary(400000);
			Parent parent = new Parent();
			parent.degree();
			
		}

	}


