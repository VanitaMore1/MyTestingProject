package accessSpecifier;

public class MyClass {

	private int a=10;
	int b=20;
	protected int c=30;
	public int d=60;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m=new MyClass();
		System.out.println(""+m.a);
		System.out.println(""+m.b);
		System.out.println(""+m.c);
		System.out.println(""+m.d);
		m.test1();
		m.test2();
		m.test3();
		m.test4();
	}
	private void test1() {
		System.out.println("private");
		
	}
	void test2() {
		System.out.println("default");
	}
	protected void test3() {
		System.out.println("protected");
	}

	public void test4() {
		System.out.println("public");
	}
}
