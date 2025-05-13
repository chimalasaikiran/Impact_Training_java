package Basic_java.Day_8_java;

import java.util.Scanner;

class Find_bus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        int count = 0;
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < m; j++) {
            if (j+1<m && arr[j] + arr[j + 1] <= n) {
                count++;
                j++; 
            } else if (arr[j] <= n) {
                count++;
            }
        }
        System.out.println(count);
    }
}
