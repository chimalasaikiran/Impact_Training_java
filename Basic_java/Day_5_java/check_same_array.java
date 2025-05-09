package Basic_java.Day_5_java;

import java.util.Scanner;

public class check_same_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        int sum1 =0;
        int sum2 =0;
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
            sum1+=arr1[i];
        }
        System.out.println(sum1);
        for (int j = 0; j < m; j++) {
            arr2[j] = sc.nextInt();
            sum2 +=arr2[j];
        }
        System.out.println(sum2);
        if(n == m && sum1 == sum2){
            System.out.println("Same");
        }else{
            System.out.println("not Same");
        }
        sc.close();
        
        
    }
}
