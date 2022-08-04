package Assisted4;

	import java.util.Scanner;

	public class InsertionSort {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the length of array");
			int Length=sc.nextInt();
			System.out.println("Enter the array elements");
			int[] array= new int[Length];
			for(int i=0;i<Length;i++) 
				array[i]=sc.nextInt();
			insertionsort(array, Length);
			// print sorted array
			for(int i=0;i<Length;i++)
				System.out.print(array[i]+" ");

	}

		public static void insertionsort(int[] a, int n) {
			for(int i=1;i<n;i++) {
				int key = a[i];
				int j=i-1;
				while ((j>=0) && (a[j]>key)){
				   a[j+1]=a[j];
				   j--;
				   }
				   a[j+1]=key;
				 }
			}
}
