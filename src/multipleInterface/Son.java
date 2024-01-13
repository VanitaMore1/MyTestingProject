package multipleInterface;

public class Son implements Father,Mother{

	public static void main(String[] args) {
		Son s=new Son();
		s.look();
		s.nature();
		s.hardwork();
		s.honesty();
		s.love();
		Father.test();
		Mother.test();
	}
	@Override
	public void look() { 
		System.out.println("look");
		
	}

	@Override
	public void nature() {
		System.out.println("nature");
		
	}

	@Override
	public void hardwork() {
		System.out.println("hardwork");
		
	}

	
	public void honesty() {
		
		System.out.println("honesty");
		
		
	}
	@Override
	public void love() {
		Father.super.love();
		Mother.super.love();
		
		
	}

}
