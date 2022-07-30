package OOPS;


	class College{
		private String Student_name;
		private int Rollno;
		private String EmailId;
		private int mark;

		public String getStudent_name() {
			return Student_name;
		}

		public void setStudent_name(String student_name) {
			this.Student_name = student_name;
		}

		public int getRollno() {
			return Rollno;
		}

		public void setRollno(int Rollno) {
			this.Rollno = Rollno;
		}

		public String getEmailId() {
			return EmailId;
		}

		public void setEmailId(String emailId) {
			this.EmailId = emailId;
		}

		public int getmark() {
			return mark;
		}

		public void setmark(int mark) {
			this.mark = mark;
		}
		
	}
	public class EncapsulationExample {

		public static void main(String[] args) {
			College student=new College();
			student.setStudent_name("varshini");
			student.setRollno(101);
			student.setEmailId("varshinisekar@gmail.com");
			student.setmark(100);

			System.out.println(student.getStudent_name()+" "+student.getRollno()+" "+student.getEmailId()+" "+student.getmark());  
		}

	}

