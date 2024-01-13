package constructor;

public class ConstructorUse {

	int a,b,c;
	public ConstructorUse() {
		a=10;
		b=20;
		c=30;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorUse c=new ConstructorUse();
		c.addition();
		
	}
	
	public void addition() {
		int sum=a+b+c;
		System.out.println("sum is "+sum);
	}

}
