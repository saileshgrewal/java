package programs.learn.array.sort;

import java.util.Arrays;
import java.util.Scanner;

public class SocksPair {

    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter teh no of array");
        int n=sc.nextInt();
        System.out.print("enter the element");
        int [] c=new int[n];
        for(int j=0;j<n;j++){
            c[j]=sc.nextInt();
        }
        Arrays.sort(c);
        int count=0;
        for(int i=0;i<n;i++){
            if(c[i]==c[i+1]){
                count++;
                i+=1;
            }

        }
        System.out.println("no of pair are"+count);
        sc.close();
    }
}
