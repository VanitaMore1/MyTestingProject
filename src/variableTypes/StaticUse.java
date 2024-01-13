package variableTypes;

public class StaticUse {

	
	static int a=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticUse s=new StaticUse();
		s.add();
        
	}

	public void add() {
		int a=30;
		int b=44;
		System.out.println("local variable value is "+a);
		System.out.println("global variable valu is "+StaticUse.a);
		//static int x=40;  static variables should be always global variables
	}
}
