package Basic_java.Day_2_java.conditions_Statements;

import java.util.Scanner;

public class Day_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three digits:");
        int num = sc.nextInt();

        int last = num%10;
        int middle = ((num/10)%10);
        int frist = num/100;
        System.out.println("Reverse: " +last+middle+frist);
    }
}
