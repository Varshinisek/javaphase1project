package asisstedproject;


	interface Car{
		public default void color() {
			System.out.println("Car color is : red");
		}
	}
	interface SportCar {
		public default void color() { 
		System.out.println("Sport car: Black");
		}
	}
	public class Diamond implements Car,SportCar {
	    public void color() {
	    	Car.super.color();
	    	SportCar.super.color();
	    }
		public static void main(String[] args) {
			Diamond diamond=new Diamond();
			diamond.color();
		}

	}

