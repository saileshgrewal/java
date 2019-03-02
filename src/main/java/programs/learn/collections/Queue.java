package programs.learn.collections;

import java.util.LinkedList;

public class Queue {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(34);
		l1.add(83);
		l1.add(98);
		l1.add(20);
		while(l1.peek()!=null) {
		System.out.println(l1.poll());
		}
		boolean b1=l1.isEmpty();
		System.out.println(b1);
		System.out.println(l1);
		l1.clear();
		System.out.println(l1);
		boolean b2=l1.isEmpty();
		System.out.println(b2);
		

	}

}
