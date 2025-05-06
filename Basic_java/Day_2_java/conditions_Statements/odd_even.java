package Basic_java.Day_2_java.conditions_Statements;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 0){
            System.out.println("zero");
            return;
        }
        else if (a/2== 0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}
