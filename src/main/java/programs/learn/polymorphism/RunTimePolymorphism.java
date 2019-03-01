package programs.learn.polymorphism;

class A {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		A rv1 = new A();
		System.out.println(rv1.add(2, 5));
		System.out.println(rv1.add(2, 5, 8));
	}

}
