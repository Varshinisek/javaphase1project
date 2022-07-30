package asisstedproject;
	public class SleepWaitExample {
		
		private static Object object = new Object();	

		public static void main(String[] args) throws InterruptedException {
			System.out.println("Thread Going to sleep...");
			Thread.sleep(1000);
			System.out.println("Thread woke up ");
			
			synchronized(object)
			{
				System.out.println("Thread will wait...");
				//object.wait();
				object.wait(100);
			}
			
			System.out.println("Thread woken up after notify() or timeout.");


			
		}

	}


