package programs.learn.method.overriding;

class A{
	public void wish() {
		System.out.println("good morning");
	}
}
class B extends A{
	public void wish() {
		System.out.println("good evening");
	}
}
public class Overriding {

	public static void main(String[] args) {
		B rv1=new B();
		rv1.wish();
         A rv2=new A();
         rv2.wish();
	}

}
