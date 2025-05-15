package Basic_java.Day_10_java;

import java.util.Scanner;

public class binary_con {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result =0;
        int base =1;
        while(n>0){
            int r = n%10;
            result = result + (r*base);
            base = base * 2;
            n = n/10;
        }
        System.out.println(result);
    }
}
