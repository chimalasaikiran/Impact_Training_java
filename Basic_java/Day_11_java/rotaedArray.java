package Basic_java.Day_11_java;

import java.util.Scanner;

public class rotaedArray {
    public static void reverse(int arr[],int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftrotaed(int arr[],int n ,int k){
        k =k%n;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       leftrotaed(arr, n, k);
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
    

    }
}
