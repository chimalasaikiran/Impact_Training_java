package Basic_java.Day_9_java;

import java.util.Arrays;
import java.util.Scanner;

public class missing_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
         int temp =1;
         for(int i =0;i<n;i++){
            if(arr[i] == temp){
                temp++;
                i=0;
            }
         }
         System.out.println(temp);
    }
}
