package Assisted4;


	import java.util.Arrays;

	public class BinarySearch1{

		public static void main(String[] args) {
			int numArray[] = {9,12,64,32,90,76}; 
		    System.out.println("The input array: " + Arrays.toString(numArray));
		   
		    int key = 90;
		    System.out.println("\nKey to be searched=" + key);
		
		    int first = 0;
		  
		    int last=numArray.length-1; 
		  
		    int mid = (first + last)/2;  
		   
		    while( first <= last ){  
		       
		        if ( numArray[mid] < key ){  
		            first = mid + 1;     
		        }else if ( numArray[mid] == key ){ 
		           
		            System.out.println("Element is found at index: " + mid);  
		            break; }
		        else{  
		            
		            last = mid - 1;  
		        }  
		        mid = (first + last)/2;  
		   }  
		   
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }       

		}

	}


