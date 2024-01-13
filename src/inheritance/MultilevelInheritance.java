package inheritance;

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GrandMother g=new GrandMother();
		g.receip();
		GrandMother.keys();
		
		Mother m=new Mother();
		m.look();m.receip();
		Mother.nature();
		Mother.keys();
		
		Daughter d=new Daughter();
		d.scooty();
		d.look();
		d.receip();
		Daughter.laptop();
		Daughter.keys();
		Daughter.nature();
	}

}
