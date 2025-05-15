package Basic_java.Day_10_java;

import java.util.Scanner;

public class AddTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size:");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        // Convert arrays to numbers
        int num1 = 0, num2 = 0;
        for (int i = 0; i < n; i++) {
            num1 = num1 * 10 + arr1[i];
            num2 = num2 * 10 + arr2[i];
        }

        int sum = num1 + num2;

        System.out.println("Result: " + sum);

        System.out.print("Reverse order: ");

        if (sum == 0) {
            System.out.print(0);
        } else {
            int temp = sum;
            while (temp > 0) {
                int digit = temp % 10;
                System.out.print(digit);
                temp /= 10;
            }
        }
        System.out.println();

    }
}