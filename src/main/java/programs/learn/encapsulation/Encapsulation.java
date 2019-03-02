package programs.learn.encapsulation;

class A {
	private int i;

	public void setI(int j) {
		i = j;
	}

	public int getI() {
		return i;
	}
}

public class Encapsulation {

	public static void main(String[] args) {

		A rv = new A();
		rv.setI(6);
		System.out.println(rv.getI());

	}

}
