package Basic_java.Day_12_java;

import java.util.Scanner;

public class swaptwonums_without_3rdvariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("A is :"+a+" B is :"+b);
    }
}
