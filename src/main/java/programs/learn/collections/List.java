package programs.learn.collections;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(4);
		a1.add(3.4);
		a1.add("d");
		a1.add(null);
		int s = a1.size();
		System.out.println(s);
		System.out.println(a1.get(1));
		System.out.println(a1);
        a1.set(2, 4.5);
        a1.add(0,8);
        a1.remove(3);
        System.out.println(a1);
        a1.clear();
        System.out.println(a1);
	}

}
