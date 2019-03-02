package programs.learn.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Traversing {
	public static void main(String args[]) {
		TreeSet t1=new TreeSet();
		t1.add(23);
		t1.add(13);
		t1.add(54);
		t1.add(67);
		Iterator i1=t1.iterator();
		while(i1.hasNext()){
			System.out.println(i1.next());
		}
		
		
	}

}
