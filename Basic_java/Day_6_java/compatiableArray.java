package Basic_java.Day_6_java;

import java.util.Scanner;

public class compatiableArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int count =0;
        int arr1[] = new int[n1];
        int arr2[] = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();

        }
        for(int j=0;j<n1;j++){
            arr2[j] = sc.nextInt();
        }
        for(int k=0;k<n1;k++){
            if(arr1[k] >= arr2[k]){
                count++;
            }
        }
        if(count == n1){
            System.out.println("compatiableArray");
        }else{
            System.out.println("not compatiableArray");
        }

    }
}
