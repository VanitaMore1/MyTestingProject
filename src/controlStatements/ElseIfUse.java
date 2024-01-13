package controlStatements;

public class ElseIfUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char gender='F';
		if(gender=='F') {
			System.out.println("female");
		}else if(gender=='M') {
			System.out.println("male");
		}else {
			System.out.println("enter gender");
		}
		
		
		
		
		int marks=66;
		if(marks>=80 && marks<=100) {
			System.out.println("distinction");
		}else if(marks>=66 && marks<80) {
			System.out.println("1st class");
		}
		else if(marks>=50 && marks<66) {
			System.out.println("2nd class");
		}else {
			System.out.println("fail");
		}
	}

}
