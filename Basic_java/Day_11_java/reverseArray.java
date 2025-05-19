package Basic_java.Day_11_java;

import java.util.Scanner;

public class reverseArray {

    public static void reversearray(int arr[],int n){
       int start =0;
       int end = n-1;
       while(start < end){
         int temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
       }
       for(int i=0;i<n;i++){
        System.out.print(arr[i]);
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reversearray(arr, n);
       

    }
}
