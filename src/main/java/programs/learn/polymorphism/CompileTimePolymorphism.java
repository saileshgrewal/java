package programs.learn.polymorphism;

interface Animal {
	public void eat();
}

class Tiger implements Animal {
	public void eat() {
		System.out.println("eat meat");
	}

	public void hunt() {
		System.out.println("hunt heer");
	}
}

class Dog implements Animal {
	public void eat() {
		System.out.println("eat grains");
	}

	public void bark() {
		System.out.println("dog bark in night");
	}
}

class Cat implements Animal {
	public void eat() {
		System.out.println("take milk");
	}

	public void play() {
		System.out.println("cat play");
	}
}

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		allAnimalBehave(new Tiger());
		allAnimalBehave(new Cat());
		allAnimalBehave(new Dog());

	}

	public static void allAnimalBehave(Animal rv) {
		rv.eat();
		if (rv instanceof Tiger) {
			Tiger t1 = (Tiger) rv;
			((Tiger) rv).hunt();

		} else if (rv instanceof Dog) {
			Dog d1 = (Dog) rv;
			((Dog) rv).bark();

		} else {
			Cat c1 = (Cat) rv;
			((Cat) rv).play();
		}
	}

}
