package programs.learn.inheritance;

class A {
	int x;

	A(int x) {
		this.x = x;
	}
}

class B extends A {
	double y;

	B(int x, double y) {
		super(x);

		this.y = y;
	}

	B(int x) {
		super(x);
	}
}

class C extends B {
	int z;

	C(int x, double y, int z) {

		super(x);
		this.y = y;
		this.z = z;
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {

		A rv1 = new A(3);
		B rv2 = new B(4, 6.5);
		C rv3 = new C(2, 3.1, 9);
		System.out.println(rv1.x);
		System.out.print(rv2.x+",");
		System.out.println(rv2.y);
		System.out.print(rv3.x+",");
		System.out.print(rv3.y+",");
		System.out.println(rv3.z);
	}

}
