package OOPS;
	class Color{
		void print() {
			System.out.println("Color is print");
		}
	}
	class Dog extends Color{
		void print() {
			System.out.println("Dog class");
			
		}
	}
	class Cat extends Color{
		void print() {
			System.out.println("Cat class");
		}
	}
	public class Polymorphism {

		public static void main(String[] args) {
			
			Color c1;
			
			c1=new Color();
			c1.print();
			
			c1=new Cat();
			c1.print();

			c1=new Dog();
			c1.print();

			
			
			
		}

	}

