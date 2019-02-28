package programs.learn.exceptions;

public class TryCatch {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		} finally {
			System.out.println("close file");
		}

	}

}
