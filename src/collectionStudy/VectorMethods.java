package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<String>();
		v.add("vanita");
		v.add("pune");
		v.add(1, "abc");
		v.add("dsfsd");
		v.add("vanita");
		v.add("pune");
		v.add(null);
		v.add(null);
		v.add("dsfsd");
		v.add("vanita");
		v.add("pune");
		v.add(null);
		v.add(null);
		v.set(12, "aadu");
		v.clone();
		v.insertElementAt("frew", 0);
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
   System.out.println(v.capacity());
   System.out.println(v.size());
   
   for(String vv:v) {
	   System.out.println(vv);
   }
   
   Iterator<String> v2 = v.iterator();
   while(v2.hasNext()) {
	   System.out.println(v2.next());
   }
   System.out.println("==============");
   Enumeration<String> v3 = v.elements();
   while(v3.hasMoreElements()) {
	   System.out.println(v3.nextElement());
	   
   }
   
   
	}

}
