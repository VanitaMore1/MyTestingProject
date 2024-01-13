package methods;

public class NonStaticMethodFromSameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticMethodFromSameClass t=new NonStaticMethodFromSameClass();
    t.test1();
	}
	public void test1() {
		System.out.println("test1");
	}

	public void test2() {
		System.out.println("test2");
	}

}
