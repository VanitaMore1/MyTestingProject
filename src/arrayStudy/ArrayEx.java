package arrayStudy;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name[]=new String[5];
		int a[]=new int[10];
		char[] gender=new char[7];
		
		String[] players=new String[10];
		players[0]="rahul";
		players[1]="KL";
		players[2]="virat";
		players[3]="sachin";
		players[4]="dhoni";
		players[5]="dravid";
		
		System.out.println(players[0]);
		System.out.println(players[1]);
		System.out.println(players[2]);
		System.out.println(players[3]);
		System.out.println(players[4]);
		System.out.println(players[5]);
		System.out.println(players[6]);
		System.out.println(players[7]);
		
		int rollnum[] = new int[10];
		for(int i=0;i<=players.length-1;i++) {
			System.out.println(players[i]);
		}
		
	}

}
