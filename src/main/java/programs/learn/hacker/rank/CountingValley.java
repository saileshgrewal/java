package programs.learn.hacker.rank;

import java.util.Scanner;

public class CountingValley {

	public static void main(String[] args) {

		 
		        
		        Scanner sc=new Scanner(System.in);
		        int n =sc.nextInt();
		        String str=sc.nextLine();
		        str=sc.nextLine();
		        int valleyCounter = 0;
		        int altitude = 0;
		        for (int i = 0; i < n; i++) {
		            char ch = str.charAt(i);
		            if (ch == 'U') {
		                altitude++;
		                if (altitude == 0) {
		                    valleyCounter++;
		                }
		            } else {
		                altitude--;
		            }
		        }
		        System.out.println(valleyCounter);
		        sc.close();
		    }

}
