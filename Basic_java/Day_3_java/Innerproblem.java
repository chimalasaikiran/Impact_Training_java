package Basic_java.Day_3_java;

import java.util.Scanner;

public class Innerproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = sc.nextInt();

        int q = num / m;
        int lower = m * q;
        int upper = m * (q + 1);

        if (num - lower <= upper - num) {
            System.out.println(lower);
        } else {
            System.out.println(upper);
        }

        sc.close();
    }
}
