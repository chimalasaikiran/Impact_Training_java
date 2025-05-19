package Basic_java.Day_12_java;

import java.util.Scanner;

public class clearsetbit {
    public static int clearsetbit(int n,int ith){
        int m = ~(1<<ith);
        return n & m; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int ith = sc.nextInt();
         int result = clearsetbit(n, ith);
         System.out.println("the result is :"+result);
    
    }
}
