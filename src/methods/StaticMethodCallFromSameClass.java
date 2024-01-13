package methods;

public class StaticMethodCallFromSameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test1();
	}
	public static void test() {
		System.out.println("this is static regular method test");
	}

	public static void test1() {
		System.out.println("this is static regular method test1");
	}
}
