package polymorphisam;

public class B extends A{

	public static void main(String[] args) {
		A a=new A();
		a.test();
		
		B b=new B();
		b.test();
	}
	public void show() {
		
		System.out.println("show");
	}
	public void test() {
		System.out.println(" B test");
	}
}
