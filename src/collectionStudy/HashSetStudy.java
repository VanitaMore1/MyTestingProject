package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Object> h=new HashSet<Object>();
		h.add(5);
		h.add("erettr");
		h.add(45);
		h.add("vanita");
		h.add(5);
		h.add(null);
		System.out.println(h);
		
		HashSet<String> s=new HashSet<String>();
		s.add("test");
		s.add("gn");
		s.add("test");
		s.add(null);
		System.out.println(s);
		for(String ss:s) {
			System.out.println(ss);
		}
		
		System.out.println("--------------------");
		
		Iterator<String> s2 = s.iterator();
		while(s2.hasNext()) {
			System.out.println(s2.next());
		}
	}

}
