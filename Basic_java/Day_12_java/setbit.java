package Basic_java.Day_12_java;

import java.util.Scanner;

public class setbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ith = sc.nextInt();

        if((n & (1<<ith)) != 0){
            System.out.println("set bit");
        }else{
            System.out.println("not a set bit");
        }

    }
}
