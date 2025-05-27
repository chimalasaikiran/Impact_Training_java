package Basic_java.Day_18_java;

import java.util.Scanner;

public class sumofnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i =0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
