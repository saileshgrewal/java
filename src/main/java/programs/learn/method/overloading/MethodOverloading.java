package programs.learn.method.overloading;

public class MethodOverloading {
	public static void test(int i, int j) {
		System.out.println(i + " " + j);
	}

	public static void test(double i, double j) {
		System.out.println(i + " " + j);
	}

	public static void main(String[] args) {
		test(3, 4);
		test(3.2, 4.5);

	}

}
