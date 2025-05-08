package Basic_java.Day_4_java;

import java.util.Scanner;

public class AdamNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int squ1 = n * n;
        int rev =0;
        while(n!=0){
            int r = n%10;
            rev = (rev * 10 +r);
            n=n/10;
        }
        int squ2 = rev * rev;
        int rev2=0;
        while (squ2 != 0) {
            int r = squ2 % 10;
            rev2 = (rev2 * 10 + r);
            squ2 = squ2 / 10;
        }
        
        if(squ1 == rev2){
            System.out.println("AdamNumber");
        }else{
            System.out.println("Not a AdamNumber");
        }

    }
}