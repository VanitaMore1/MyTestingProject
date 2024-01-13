package accessTest;

import accessSpecifier.MyClass;

public class MyTestClass2 extends MyClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass m=new MyClass();
		System.out.println(m.d);
		 
		MyTestClass2 m2=new MyTestClass2();
		m2.test3();
		m2.test4();
	}

}
