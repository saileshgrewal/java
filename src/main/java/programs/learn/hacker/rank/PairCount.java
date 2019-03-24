package programs.learn.hacker.rank;

import java.util.Arrays;

public class PairCount {

	public static void main(String[] args) {

        int a[]= {1,1,1,2,2,1};
        Arrays.sort(a);
        int count=0;
        for(int i=0;i<a.length-1;i++) {
        	if(a[i]==a[i+1]) {
        		count++;
        		i=i+1;;
        	}
        	
        }
        System.out.println(count);

	}

}
