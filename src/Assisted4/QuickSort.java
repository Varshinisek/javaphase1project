package Assisted4;
	import java.util.Scanner;

	public class QuickSort {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the length of array");
			int Length=sc.nextInt();
			System.out.println("Enter the array elements");
			int[] array= new int[Length];
			for(int i=0;i<Length;i++) 
				array[i]=sc.nextInt();
			quickSort(array,0,Length-1);
			// print sorted array
			for(int i=0;i<Length;i++)
				System.out.print(array[i]+" ");

	}

		public static void quickSort(int[] a, int start, int end) {
			if(start<end) {
				// find pivot element such that
			      // elements smaller than pivot are on the left
			      // elements greater than pivot are on the right
			      int pi = partition(a, start, end);
			      
			      // recursive call on the left of pivot
			      quickSort(a, start, pi - 1);

			      // recursive call on the right of pivot
			      quickSort(a, pi + 1, end);
			}
			
		}

		public static int partition(int[] a, int start, int end) {
			int pivot=a[end];
			int i=start-1;
			
		    for (int j = start; j < end; j++) {
		      if (a[j] <= pivot) {

		        // if element smaller than pivot is found
		        // swap it with the greater element pointed by i
		        i++;

		        // swapping element at i with element at j
		        int temp = a[i];
		        a[i] = a[j];
		        a[j] = temp;
		      }

		    }

		    // swap the pivot element with the greater element specified by i
		    int temp = a[i + 1];
		    a[i + 1] = a[end];
		    a[end] = temp;

		    // return the position from where partition is done
		    return (i + 1);
		}
	}

