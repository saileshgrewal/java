package programs.learn.array.sort;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		int temp, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of array element");
		n = sc.nextInt();
		int[] var = new int[n];
		System.out.println("enter element");
		for (int i = 0; i < n; i++) {
			var[i] = sc.nextInt();
		}
		for (int i= 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {
				if (var[i] > var[j]) {
					temp = var[i];
					var[i] = var[j];
					var[j] = temp;
				}
			}
		}
		for (int i = 0; i < n-1; i++) {

			System.out.print(var[i]);
		}
		System.out.print(var[n - 1]);
		sc.close();
	}

}
