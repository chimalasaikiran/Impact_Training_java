package Basic_java.Day_12_java;

import java.util.Scanner;

public class even_and_odd_bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         if((n & 1) ==0){
            System.out.println("Even");
         }else{
            System.out.println("odd");
         }
    }
}
