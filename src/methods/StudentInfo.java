package methods;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo student= new StudentInfo();
		student.studentDetails();
		student.studentDetails("Advait", 01, 'M', 10.9f);
	}

	public void studentDetails() {
		String name="vanita";
		int rollNum=10;
		char gender='F';
		float avg=12.6f;
		
		System.out.println("my name is "+name);
		System.out.println("my rollNum is "+rollNum);
		System.out.println("my gender is "+gender);
		System.out.println("my avg is "+avg);
		
	}
	public void studentDetails(String name,int rollNum,char gender,float avg) {
		System.out.println("my name is "+name);
		System.out.println("my rollNum is "+rollNum);
		System.out.println("my gender is "+gender);
		System.out.println("my avg is "+avg);
	}
}
