package Basic_java.Day_2_java.conditions_Statements;

import java.util.Scanner;

public class joey_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int middle = ((a/10)%10);
            System.out.println(middle%3==0?"Trendy":"Not a trendy");

        
    }
}
