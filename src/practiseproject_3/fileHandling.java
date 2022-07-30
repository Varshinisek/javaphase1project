package practiseproject_3;


	import java.io.BufferedReader;

	import java.io.File;

	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.OutputStream;
	import java.util.Scanner;

	public class fileHandling {

		public static void main(String[] args) throws FileNotFoundException, IOException {
			
			System.out.println("Please select one of the below operations");
	        System.out.println("1.Write to file\n2.Read File\n3.Append file ");
	        String path="C:\\Users\\Administrator\\Desktop\\nithish\\varshini.txt";
	    	Scanner sc =new Scanner(System.in);
	    	int choose=sc.nextInt();
	    	switch(choose) {
	       
	        case 1: WriteTofile(path);
	                break;
	        case 2:ReadTofile(path);
	               break;
	        case 3:Appendtofile(path);
	               break;
	        default:System.out.println("You are trying to create other oerations hich is not in the project");
	        }
	       }
		
		public static void WriteTofile(String filepath) {
			// TODO Auto-generated method stub

			Scanner sc =new Scanner(System.in);
			System.out.println("CAUTION >> Please understand it will overwrite the content of the file ");
	        System.out.println("Type 'no' to exit");
	        System.out.println("Do you want to proceed :type 'yes' ");
	        String s1=sc.nextLine();
	        if(s1.equals("no"))
	         System.exit(0);

			System.out.println("Enter the data which you want to write on the file");
			String data=sc.nextLine();
		    
		    try {
		      // Step 1: Creates a Writer using FileWriter
		      FileWriter output = new FileWriter(filepath);
		      
		      // Step 2: Writes string to the file
		      output.write(data);
		      System.out.println("Data is written to the file.");

		      // Step 3: Closes the writer
		      output.close();
		    }
		    catch (Exception e) {
		      e.getStackTrace();
		    }
		 }
		
		public static void ReadTofile(String filepath) {

		    char[] array = new char[500];
		    
		    try {
		      // Step 1: Creates a reader using the FileReader
		      FileReader input = new FileReader(filepath);

		      // Step 2: Reads characters
		      input.read(array);
		      
		      System.out.println("Data in the file:\n");
		      System.out.println(array);

		      // Step 3: Closes the reader
		      input.close();
		    }
		    catch(Exception e) {
		      e.getStackTrace();
		    }
		  }
		

		public static  void Appendtofile(String filepath) {
			// TODO Auto-generated method stub
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the data which you want to add on the existing  file");
			String data=sc.nextLine();
			OutputStream os = null;
			try {
				// below true flag tells OutputStream to append
				os = new FileOutputStream(new File(filepath), true);
				os.write(data.getBytes(), 0, data.length());

			      System.out.println("Data is added to the file.");
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		}


