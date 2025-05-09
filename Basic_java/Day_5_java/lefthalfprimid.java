package Basic_java.Day_5_java;

import java.util.Scanner;

public class lefthalfprimid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j =0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
