package assisted3;

import java.util.Scanner;

public class fourthSmallElement {
	
	static void sortElement(int a[],int l) {
		
		for(int i=0;i<l;i++) {
			int temp=i;
			for(int j=i+1;j<l;j++) {
				if(a[temp]>a[j]) 
					temp=a[j];
				
			if(temp!=i) {
				int t = a[i];  
				a[i] = a[temp];  
				a[temp] = t; 
					
			}
			}
		}
	}
	
	public static int findKthSmallest(int a[], int l, int k)  {  
		sortElement(a, l);   
		return a[k - 1];  
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int Length=sc.nextInt();
        System.out.println("Enter the elements of an array");
        int[] array=new int[50];
        for(int i=0;i<Length;i++) {
        	 array[i]=sc.nextInt();
        }
        
        int a=findKthSmallest(array,Length,4);
        System.out.println("Fourth Smallest element is "+a);
	}

}


