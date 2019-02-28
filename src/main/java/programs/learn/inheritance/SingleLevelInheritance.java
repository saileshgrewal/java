package programs.learn.inheritance;

class Super {
	int i;

	Super(int i) {
		this.i = i;
	}
}

class Sub extends Super {
	int j;

	Sub(int i, int j) {
		super(i);
		this.j = j;
	}

}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		Super s = new Super(4);
		System.out.println(s.i);
		Sub s2 = new Sub(7, 9);
		System.out.println(s2.i);
		System.out.println(s2.j);

	}

}
