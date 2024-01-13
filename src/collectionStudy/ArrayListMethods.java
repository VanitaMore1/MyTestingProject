package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> al=new ArrayList<Object>();
		System.out.println(al.add("vanita"));
		al.add(0, 10);
		System.out.println(al);
		//al.clear();
		//System.out.println(al);
		Object al2 = al.clone();
		System.out.println(al2);
		
		System.out.println(al.contains(198));
		al.ensureCapacity(5);
		//al.add(34);
	//	al.add(55);
		System.out.println(al);
		al.add(344);
		al.add(565);
		System.out.println(al);
		System.out.println("===================================");
		System.out.println(al);
		System.out.println(al2);
		System.out.println(al.equals(al2));
		System.out.println(al.get(2));
		System.out.println(al.indexOf(5657));
		System.out.println(al.isEmpty());
		
		//al.clear();
		//System.out.println(al.isEmpty());
		al.remove(3);
		System.out.println(al);
		al.set(0, 67);
		System.out.println(al);
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("========================");
		
		for(Object a:al) {
			System.out.println(a);
		}
		System.out.println("========================");
		Iterator<Object> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
		System.out.println("========================");
		ListIterator<Object> listIt = al.listIterator();
		while(listIt.hasNext()) {
			System.out.println(listIt.next());
		}
		
		System.out.println("==========rev order==============");
		while(listIt.hasPrevious()) {
			System.out.println(listIt.previous());
		}
	}

}
