package Basic_java.Day_3_java;

import java.util.Scanner;

public class problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int sum =0;
        int temp =n;
        while(n!=0){
            int r = n%10;
            sum +=r;
            n=n/10;
        }
        if(temp%sum == 0){
            System.out.println("yes");
        }
        else{
            System.out.println("not");
        }
    }
}
