package programs.learn.interfacebasic;

interface A {
	public void move1();

}

interface B {
	public void move2();

}

interface C extends A, B {
	public void move3();
}

class K implements A, B {
	public void move3() {
		System.out.println("move rohtak");
	}

	public void move2() {
		System.out.println("move jind");
	}

	public void move1() {
		System.out.println("move hyderabad");
	}

}

public class InterfaceLearn {

	public static void main(String[] args) {
		K rv = new K();
		rv.move1();
		rv.move2();
		rv.move3();

	}

}
