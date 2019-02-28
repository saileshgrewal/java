package programs.learn.exceptions;

class Sample {
	static void demo() {
		try {
			throw new NullPointerException("exception data");
		} catch (NullPointerException ne) {
			System.out.println(ne);
		}
	}
}

public class Throw {

	public static void main(String[] args) {
		Sample.demo();

	}

}
