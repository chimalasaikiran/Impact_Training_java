package Basic_java.Day_16_java;

import java.util.Scanner;

public class magic_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[][] = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum =0;
        int sum2 =0;
        for(int i=0;i<n;i++){
           sum+=arr[i][i];
        }
        for(int j=0;j<n;j++){
            sum2+=arr[j][n-1-j];
        }
       if(sum == sum2){
        System.out.println("its a magic square");
       }else{
        System.out.println("it's not a magic square");
       }
    }
}
