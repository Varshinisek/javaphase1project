package Assisted4;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int length=sc.nextInt();
		System.out.println("Enter the elements of array");
		int[] array=new int[length];
		for(int i=0;i<length;i++)
			array[i]=sc.nextInt();
		System.out.println("Enter the search element");
		int key=sc.nextInt();
		int result=searchElement(array,length,key);
		if(result==-1)
			System.out.println("Element is not present in the array");
		else
			System.out.println(key+" is found at index "+result);
			
	}

	public static int searchElement(int[] a,int l, int key) {
		for(int i=0;i<l;i++) {
			if(a[i]==key)
				return i;
		    }

		return -1;
	}}
		
		
	
