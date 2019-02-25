package programs.learn.constructor;

class MyClass {
	int x;

	MyClass(int i) {
		x = i;
	}
}

public class LearningConstructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj1 = new MyClass(10);
		MyClass obj2 = new MyClass(20);
		System.out.println(obj1.x + " " + obj2.x);

	}

}
