package casting;

public class UpCastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Father f=new Father();
		f.bike();
		f.car();
		
		Son s=new Son();
		s.bike();
		s.car();
		
		Father f1=new Son();
		f1.bike();
		f1.car();
		//f1.laptop();
		
	}

}
