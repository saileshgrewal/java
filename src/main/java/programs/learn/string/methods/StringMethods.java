package programs.learn.string.methods;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "main";
		String s2 = new String("course java");
		char[] c1 = { 'd', 'o', 'n', 'e' };
		String s3 = new String(c1);
		System.out.println(s1.length());
		System.out.println(s1.concat(s2));
		String p = s2.substring(0, 5);
		String s = s3.substring(0, 4);
		System.out.println(p + s);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		String[] s4 = s2.split(" ");
		System.out.println(s4);
		s3.replace('d', 'p');
		System.out.println(s3);

	}

}
