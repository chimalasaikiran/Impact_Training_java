package Basic_java.Day_11_java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr [] = new int[n];
         for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
         }
         int slarg =0;
         Arrays.sort(arr);
         for(int i=n-2;i>=0;i--){
            if(arr[i] != arr[n-1]){
               slarg = arr[i];
               break;
            }
         }
         System.out.println("Second Largest:" + slarg);
    }
}
