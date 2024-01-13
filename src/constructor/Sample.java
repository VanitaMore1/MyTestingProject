package constructor;

public class Sample {

	int a;
	String name;
	float b;
	char gender;
	 public Sample() {
		 a=10;
		 name="vanita";
		 b=1.8f;
		 gender='F';
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample();
		s.display();
		
	}
 public void display() {
	 System.out.println(" "+a);
	 System.out.println(" "+name);
	 System.out.println(" "+b);
	 System.out.println(" "+gender);
	
 }
}
