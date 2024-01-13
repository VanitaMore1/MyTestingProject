package arrayStudy;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] a= {'b','c','g','j'};
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		
		
		System.out.println("----------------------");
		for(int j=a.length-1;j>=0;j--) {
			System.out.println(a[j]);
		}
		
		System.out.println("----------------------");
		Arrays.sort(a);
		for(int k=0;k<=a.length-1;k++) {
			System.out.println(a[k]);
		}
		System.out.println("----------------------");
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
		String[] name= {"Sandeep","Advait","vanita","rahulk"};
		for(int i=0;i<=name.length-1;i++) {
			System.out.println(name[i]);
		}
		System.out.println("----------------------");
		
		Arrays.sort(name);//Ascending
		for(int i=0;i<=name.length-1;i++) {
			System.out.println(name[i]);
		}
		System.out.println("----------------------");
		
		for(int i=name.length-1;i>=0;i--) {
			System.out.println(name[i]);
		}
	}

}
