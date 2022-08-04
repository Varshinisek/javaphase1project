package assisted3;
	import java.util.Scanner;

	public class rotateArray {
		
		static void rightRotate(int Array[],int Length, int k) {
			for(int i=0;i<Length;i++) {
				if(i<k)
					System.out.println(Array[Length+i-k]);
				else
					System.out.println(Array[i-k]);
				}
		}
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of the array");
			int Length=sc.nextInt();
			System.out.println("Enter the Elements of an Array");
			int[] rotate= new int[50];
			
			for(int i=0;i<Length;i++){
				rotate[i]=sc.nextInt();
			}
			rightRotate(rotate,Length,5);
			
		}
	}

