package Assisted4;

import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int Length=sc.nextInt();
		System.out.println("Enter the array elements");
		int[] array= new int[Length];
		for(int i=0;i<Length;i++) 
			array[i]=sc.nextInt();
		Mergesort(array,0,Length-1);
		// print sorted array
		for(int i=0;i<Length;i++)
			System.out.print(array[i]+" ");
	}

	public static void Mergesort(int[] array, int start, int end) {
		if(start<end) {
		int mid=(start+end)/2;
		Mergesort(array,start,mid);
		Mergesort(array,mid+1,end);
		Merge(array,start,mid,end);}
	  	
	}

	public static void Merge(int[] a, int start, int mid,int end) {
		int i, j, k;  
	    int n1 = (mid - start) + 1;   // Left array size 
	    int n2 = (end - (mid+1))+1;   // Right array size(length)
	    
	    //Temporary arrays
	    int LeftArray[] = new int[n1];  
        int RightArray[] = new int[n2];
        
        /* copy data to temp arrays */  
        for (i = 0; i < n1; i++)    
        LeftArray[i] = a[start + i];    
        for (j = 0; j < n2; j++)    
        RightArray[j] = a[mid + 1 + j];  
        
        i = 0; /* initial index of first sub-array */  
        j = 0; /* initial index of second sub-array */   
        k = start;  /* initial index of merged sub-array */  
        
        while(i<n1 && j<n2) {
        	if(LeftArray[i]<RightArray[j]) {
        		a[k]=LeftArray[i];
        		i++;
        	}
        	else if(LeftArray[i]>RightArray[j]){
        		a[k]=RightArray[j];
        	    j++;
            }
        	else {
        		a[k]=LeftArray[i];
        		i++;
        		j++;
        	}
        	k++;
        }
        
        while(i<n1) {
        	a[k]=LeftArray[i];
        	i++;
        	k++;
        }
        while(j<n2) {
        	a[k]=RightArray[j];
        	j++;
        	k++;
        }
	}

}
