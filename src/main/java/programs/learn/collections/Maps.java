package programs.learn.collections;

import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		HashMap m1 = new HashMap();
		m1.put(20, "avf");
		m1.put(22, "njm");
		m1.put(34, 45);
		m1.put(67, 56);
		System.out.println(m1);
		System.out.println(m1.keySet());
		System.out.println(m1.values());
		// System.out.println(containsKey(20));
		// System.out.println(containsValue(45));

	}

}
