package Basic_java.Day_18_java;

import java.util.Scanner;

public class factorial {
    public static int factorialnum(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n * factorialnum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorialnum(n));

    }
}
