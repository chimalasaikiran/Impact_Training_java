package Basic_java.Day_4_java;

import java.util.Scanner;

public class kaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count =0;
        int temp =n;
        int squ = n * n;
        while(n !=0){
            n =n/10;
            count++;
        }
        int power = (int) Math.pow(10,count);
        int left = squ%power;
        int right = squ/power;
        int sum = left + right;
        if(sum == temp){
            System.out.println("kaprekarNumber");
        }else{
            System.out.println("Not a kaprekarNumber");
        }
         

        
         

        
    }
}
