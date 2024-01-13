package constructor;

public class CS {

	int a,b,c;
	public CS() {
		a=1;
		b=2;
		c=3;
	}
	public CS(int x) {
		a=x;
	}
	public CS(int x,int y) {
		a=x;
		b=y;
		
	}
	public CS(int x,int y,int z) {
		a=x;
		b=y;
		c=z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CS c=new CS();
    c.add();
    c.sub();
    
    CS c1=new CS(300);
    c1.add();
    c1.sub();
    
    CS c2=new CS(10,20);
    c2.add();
    c2.sub();
    
    CS c3=new CS(10,20,30);
    c3.add();
    c3.sub();
	}

	public void add() {
		int sum=a+b+c;
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		System.out.println("c value is "+c);
		System.out.println("sum value is "+sum);
	}
	
	public void sub() {
		int sub=a-b-c;
		System.out.println("sub is "+sub);
	}
}
