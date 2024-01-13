package methods;

public class MathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperations m=new MathOperations();
		m.addition();
		m.substraction(30, 10);
	}

	public void addition() {
		int a=10;
		int b=20;
		int add=a+b;
		System.out.println(add);
		
	}
	public void substraction(int a,int b) {
		int sub;
		sub=a-b;
		System.out.println(sub);
	}
}
