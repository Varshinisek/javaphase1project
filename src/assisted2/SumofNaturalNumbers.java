package assisted2;

	import java.util.*;

	public class SumofNaturalNumbers{
		
		public static void main(String[] args){
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the range");
			int start = sc.nextInt();
			int end = sc.nextInt();
			int sum = 0;
			for(int i = start; i <= end; i++)
			{
				sum = sum + i;
			}
			System.out.println(sum);
		}
	}
