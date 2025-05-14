package Basic_java.Day_8_java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        // Two-pointer segregation
        int left = 0, right = num - 1;
        while (left < right) {
            // Move left if it's already even
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            // Move right if it's already odd
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }

            // Swap if left is odd and right is even
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Output
        System.out.println("Array after Segregation");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        scanner.close();
    }
}
