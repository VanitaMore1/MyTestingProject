package collectionStudy;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Object> ts=new TreeSet<Object>();
		ts.add("pune");
		//ts.add(65465);
		//ts.add(null);
		ts.add("ausa");

		ts.add("latur");
		ts.add("nilang");
		
		TreeSet<Integer> ts1=new TreeSet<Integer>();
		//ts1.add(5);
		ts1.add(7);
		//ts1.add(2);
		ts1.add(8);
		ts1.add(0);
		ts1.add(11);
		System.out.println(ts1.ceiling(2));//upper
		System.out.println(ts1.floor(5));//lower
		System.out.println(ts1.first());//first element
		System.out.println(ts1.last());
		System.out.println(ts1.remove(9));
		System.out.println(ts1.higher(7));
		System.out.println(ts1.lower(11));

     for(Integer t2:ts1) {
    	 System.out.println(t2);
     }
     
     System.out.println("------------iterator------------------------------------");
     Iterator<Integer> t3 = ts1.iterator();
     while(t3.hasNext()) {
    	 System.out.println(t3.next());
     }
     

     System.out.println("--------decending----iterator------------------------------------");
    Iterator<Integer> t4 = ts1.descendingIterator();
     while(t4.hasNext()) {
    	 System.out.println(t4.next());
     }
     
	}

}
