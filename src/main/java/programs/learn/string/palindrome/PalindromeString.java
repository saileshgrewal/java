package programs.learn.string.palindrome;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		if (reverse.equals(str)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
		sc.close();

	}

}
