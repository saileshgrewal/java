package programs.learn.abstraction;

abstract class A {
	abstract public void play();

	abstract public void hunt();
}

abstract class B extends A {
	public void play() {
		System.out.println("dog play");

	}

}

class C extends B {
	public void hunt() {
		System.out.println("tiger hunt");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		C rv = new C();
		rv.play();
		rv.hunt();

	}

}
