package Basic_java.Day_8_java;

import java.util.Scanner;
import java.util.ArrayList;

public class arrage_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            int temp = arr[i];
            if (temp % 2 == 0) {
                even.add(arr[i]); 
            } else {
                odd.add(arr[i]); 
            }
        }

        System.out.println(even+" "+odd);
    }
}
