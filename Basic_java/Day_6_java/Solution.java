package Basic_java.Day_6_java;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int pos = sc.nextInt();
        if (pos > size) {
            System.out.println("Invalid Input");
        } else {
            int element = sc.nextInt();
            System.out.println("Array after insertion is");
            

            for (int i = 0; i < size; i++) {
                if (i == pos - 1) {
                    System.out.println(element);

                }
                System.out.println(arr[i]);

            }
        }
    }
}