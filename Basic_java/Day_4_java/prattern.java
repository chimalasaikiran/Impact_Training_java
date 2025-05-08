package Basic_java.Day_4_java;

import java.util.Scanner;

import javax.swing.text.Style;

public class prattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        r = sc.nextInt();
        int sum =1;
        for(int i =0;i<r;i++){
            for(int j =0;j<r;j++){
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();
        }
    }
}
