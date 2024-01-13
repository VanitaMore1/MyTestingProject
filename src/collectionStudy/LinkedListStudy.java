package collectionStudy;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Character> l=new LinkedList<Character>();
		l.add('V');
		l.add('M');
		l.add('T');
		l.add(null);
		l.add(null);
		l.add('T');
		l.addFirst('G');
		l.addLast('H');
		System.out.println(l);
		System.out.println(l.element());
		System.out.println(l);
		System.out.println(l.poll());
		System.out.println(l);
		l.offer('i');
		System.out.println(l);
		l.offerFirst('s');
		System.out.println(l);
		l.offerLast('k');
		System.out.println(l);
		l.push('A');
		System.out.println(l);
		for(int a=0;a<=l.size()-1;a++) {
			System.out.print(l.get(a));
		}
		System.out.println("====================");
		ListIterator<Character> ll = l.listIterator();
		while(ll.hasNext()) {
			System.out.print(ll.next());
		}
	}

}
