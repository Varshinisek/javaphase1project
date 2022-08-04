package Assisted4;

	import java.util.Scanner;

	public class SelectionSort {	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the length of array");
			int Length=sc.nextInt();
			System.out.println("Enter the array elements");
			int[] array= new int[100];
			for(int i=0;i<Length;i++)
				array[i]=sc.nextInt();
			selectionsort(array, Length);
			for(int i=0;i<Length;i++)
				System.out.print(array[i]+" ");
			
	}

	public static void selectionsort(int[] array, int n) {
		
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		        if(array[i]>array[j]){
		            int temp=array[i];
		            array[i]=array[j];
		            array[j]=temp;
		        }
		    }    
		
	}
	}
	}

