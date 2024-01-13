package controlStatements;

public class If_Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks=90;
		if(marks>=40) {
			System.out.println("pass ");
		}else
		{
			System.out.println("fail");
		}
		
		String colour="green";
		if(colour=="red") {
			System.out.println("stop");
		}
		
		char gender='M';
		if(gender=='M') {
			System.out.println("male");
		}else {
			System.out.println("female");
		}
	}

}
