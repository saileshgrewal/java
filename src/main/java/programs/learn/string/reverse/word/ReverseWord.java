package programs.learn.string.reverse.word;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {

		String reverseAll = " ";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String str = sc.nextLine();
		String words[] = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = " ";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseAll = reverseAll + reverseWord + " ";
		}
		System.out.println(reverseAll);
		sc.close();
	}

}
