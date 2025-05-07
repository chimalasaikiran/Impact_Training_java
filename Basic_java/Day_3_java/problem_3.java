package Basic_java.Day_3_java;

import java.util.Scanner;

public class problem_3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
       while(n!=0){
        int r =n%10;
        System.out.println(r);
        n=n/10;
       }
}
}