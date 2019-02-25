package programs.learn.forloop;

public class Demo {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		for (int x : numbers) {
			System.out.print(x);
			System.out.print(",");
		}
		System.out.println("\n");
		String[] str = { "a", "b", "c" };
		for (String y : str) {
			System.out.print(y);
			System.out.print(",");
		}

	}
}
