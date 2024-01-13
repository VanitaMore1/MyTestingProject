package constructor;

public class ConstructorString {

	String name;
	public ConstructorString() {
		name="vanita";
	}
	
	public ConstructorString(String a) {
		name=a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorString cs=new ConstructorString();
		cs.display();
		
		ConstructorString cs1=new ConstructorString("vishal");
		cs1.display();
	}

	public void display() {
		System.out.println(" name is "+name);
	}
}
