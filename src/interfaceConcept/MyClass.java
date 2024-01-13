package interfaceConcept;

public class MyClass implements MyInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass m=new MyClass();
		m.test();
		m.test2();
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("test");
	}

	public void test2() {
		System.out.println("test2");
	}
	

}
