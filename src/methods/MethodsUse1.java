package methods;

public class MethodsUse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsUse1 m=new MethodsUse1();
		m.a();
		b();
		m.c(1, 2, "Kings11");
		d(2,202,"Gharkul");
		
	}
	public void a() {
		System.out.println("non static method");
	}

	public static  void b() {
		System.out.println("static method");
	}
	public void c(int runs, int overs,String team) {
		System.out.println("my runs are "+runs);
		System.out.println("my overs are "+overs);
		System.out.println("my team is "+team);
	}
	
	public static void d(int floorNum,int flatNum, String flatName)
	{
		System.out.println("my floorNum is "+floorNum);
		System.out.println("my flatNum is "+flatNum);
		System.out.println("my flatName is "+flatName);
	}
}
