package Assisted4;

	import java.util.Arrays;
	import java.util.Scanner;

	public class ExponentialSearch {

		static int exponentialSearch(int arr[],int n, int x)
		{
			if (arr[0] == x)
				return 0;
			
			int i = 1;
			while (i < n && arr[i] <= x)
				i = i*2;
			return Arrays.binarySearch(arr, i/2, Math.min(i, n-1), x);
	}
		public static void main(String args[]) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of the array");
			int length=sc.nextInt();
			System.out.println("Enter the elements of array in sorted order");
			int[] array=new int[length];
			for(int i=0;i<length;i++) {
				array[i]=sc.nextInt();}
			
			System.out.println("Enter the element to search");
			int search=sc.nextInt();
			int result = exponentialSearch(array, array.length, search);
			System.out.println((result <0) ? "Element is not present in array" :"Element is present at index " + result);
			}
	}

