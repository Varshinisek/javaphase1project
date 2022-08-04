package assisted3;

	import java.util.Stack;

	public class stackExample {
		
		static final int MAX = 1000; 
		int top; 
		int a[] = new int[MAX];  
		
		boolean isEmpty(){ 
	    		return (top < 0); 
		} 
		
		stackExample(){ 
	    		top = -1; 
		} 
		
		boolean push(int x) { 
	    		if (top >= (MAX-1)) { 
	        		System.out.println("Stack Overflow"); 
	        		return false; 
	    		} 
	    		else{ 
	        		a[++top] = x; 
	        		System.out.println(x + " pushed into stack"); 
	        		return true; 
	    		} 
		} 
		
		
		public int pop(){ 
	    	if (top < 0){ 
	        	System.out.println("Stack Underflow"); 
	        	return 0; 
	    		} 
	    	else{ 
	        	int x = a[top--]; 
	        	return x; 
	    		} 
		} 


		public static void main(String[] args) {
			Stack<String> s = new Stack<String>(); 
			s.push("Apple"); 
			s.push("Mango"); 
			s.push("Orange"); 
			System.out.println(s.pop() + " Popped from stack"); 

		}

	}

