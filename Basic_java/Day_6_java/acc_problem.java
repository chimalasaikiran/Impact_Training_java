package Basic_java.Day_6_java;

import java.util.Scanner;

public class acc_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int x = 1; 
        int count = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            int y = (int) Math.cbrt(arr[i]);
            int z = (int) (Math.pow(x, 3) + Math.pow(x, 3));
              
            while(x<=y){
                if (arr[i] == z) {
                    count++;
                } else if (z > arr[i]) {
                    y--;
                } else {
                    x++;
                }
            }
             
            }
            System.out.println(count);
        }

    }

