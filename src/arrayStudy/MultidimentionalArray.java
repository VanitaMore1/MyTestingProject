package arrayStudy;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//10 20
		//30 40
		/*
		 * int num[][]= new int[2][2]; num[0][0]=10; num[0][1]=20; num[1][0]=30;
		 * num[1][1]=40;
		 */
		
		int num[][]= {{10,20},{30,40}};
		
		for(int i=0;i<=num.length-1;i++)		{
			for(int j=0;j<=num.length-1;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
		
		String[][] player=new String[3][3];
		
		player[0][0]="sachin";
		player[0][1]="rahul";
		player[0][2]="dravid";
		
		player[1][0]="dsf";
		player[1][1]="dsf";
		player[1][2]="juyi";

		player[2][0]="grtuty";
		player[2][1]="dsfwset";
		player[2][2]="uiou";
		
		String a[][]= {{"sachin","rahul","dravid"},{"dsf","dfh","juyi"},{"grtuty","dsfwset","uiou"}};
		
		System.out.println("=================");
		for(int i=0;i<=player.length-1;i++) {
			for(int j=0;j<=player.length-1;j++) {
				System.out.print(player[i][j]+" ");
			}
			System.out.println();
		}
		
		
		boolean b[][]= {{true,false,true},{false,true,true},{false,true,true}};
		
		for(int i=0;i<=b.length-1;i++) {
			for(int j=0;j<=b.length-1;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
