package variableTypes;

public class Test {

	int x=5;   //global variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t=new Test();
		t.demo1();
	}

	public void demo1() {
		int a=10;
		int sum=a+20;
		int mul=a*x;
		System.out.println(" "+mul);
	}
	public void demo2() {
		int b;
	}
}
