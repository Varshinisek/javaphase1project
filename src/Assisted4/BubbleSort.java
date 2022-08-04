package Assisted4;

	import java.util.Scanner;

	public class BubbleSort {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the length of array");
			int Length=sc.nextInt();
			System.out.println("Enter the array elements");
			int[] array= new int[Length];
			for(int i=0;i<Length;i++) 
				array[i]=sc.nextInt();
			bubblesort(array, Length);
			// print sorted array
			for(int i=0;i<Length;i++)
				System.out.print(array[i]+" ");
			

	}

		public static void bubblesort(int[] a, int n ) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n-i-1;j++) {
					if(a[j]>a[j+1]) {
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
						
				}
				}
			}
		}
		}


