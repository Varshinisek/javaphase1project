package practiseproject_4;
	import java.util.Scanner;

	public class LongestIncreasingSubsequence {
		
		private static int findLengthOf(int[] a) {
			int n = a.length;
			int[] LIS = new int[n];
			int subsequence = Integer.MIN_VALUE;

			for (int i = 0; i < n; i++) {
				LIS[i] = 1;
				for (int j = 0; j < i; j++) {
					if (a[i] > a[j] && LIS[i] < LIS[j] + 1) 
						LIS[i] = LIS[j] + 1;
					
				}
				if (subsequence < LIS[i]) {
					subsequence = LIS[i];
				}
			}

			return subsequence;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a size of the array : ");
			int n = sc.nextInt();
			System.out.println("Enter array Element : ");
			int[] a = new int[n];

			for (int i = 0; i < n; i++) 
				a[i] = sc.nextInt();
			sc.close();

			System.out.println("Length of longest increasing subsequence = "+findLengthOf(a));
				
		}

	}

