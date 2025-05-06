package Basic_java.Day_2_java.Control_Satements;

import java.util.Scanner;

public class problem_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int nums[] = new int[b + 1];
        for(int i=a;i<=b;i++){
            int first = i/10;
            int second = i%10;
            int sum = first + second;
            int product = first * second;
            if((sum+product) == i){
                System.out.println(i);
            }
        }
    }
}