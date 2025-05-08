package Basic_java.Day_4_java;

import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev =1;
        int binary =0;
        while(n>0){
            int r = n%2;
            binary += r * rev;
            rev *= 10;
            n/=2;
        }
        sc.close();
        System.out.println(binary);

    }
}
