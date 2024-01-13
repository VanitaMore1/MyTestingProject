package collectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Object> l=new LinkedHashSet<Object>();
		l.add("pune");
		l.add(4);
		l.add("latur");
		l.add(4);
		l.add("latur");
		System.out.println(l);
		System.out.println(l.size());
		for(Object ll:l) {
			System.out.println(ll);
		}
		
		
		System.out.println("-------------------------");
		Iterator<Object> l2 = l.iterator();
		while(l2.hasNext()) {
			System.out.println(l2.next());
		}
	}

}
