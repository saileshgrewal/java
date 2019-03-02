package programs.learn.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyClass {

	private String name;

	public void accept() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		this.name = br.readLine();
		System.out.println("enter name");
	}

	public void display() {
		System.out.println(name);
	}
}

public class Throws {

	public static void main(String[] args) throws IOException {
		MyClass s = new MyClass();
		//s.name ="Deepak";
		s.accept();
		s.display();

	}

}
