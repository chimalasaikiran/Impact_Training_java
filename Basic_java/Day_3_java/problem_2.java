package Basic_java.Day_3_java;

import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = n; i < m; i++) {
            if ((i % 7 == 0) && (i % 9 == 0)) {
                System.out.println(i + " is divisible by both 7 and 9");
            }
        }

        sc.close();
    }
}
