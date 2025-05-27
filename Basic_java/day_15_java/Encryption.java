package Basic_java.day_15_java;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        int n = code.length();
        StringBuilder encrypted = new StringBuilder(code);

        for (int i = 0; i < n - 1; i += 2) {
            char ch1 = encrypted.charAt(i);
            char ch2 = encrypted.charAt(i + 1);
            encrypted.setCharAt(i, ch2);
            encrypted.setCharAt(i + 1, ch1);
        }

        System.out.println(encrypted.toString());
    }
}
