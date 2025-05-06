package Basic_java.Day_2_java.Control_Satements;

import java.util.Scanner;

public class problem_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i< 10;i++){
            System.out.print(num+" ");
           if(num == 1){
            break;
           }
           else if(num%2==0){
               num =num/2;
           }
           else{
            num =3 * num +1;
           }
        }
    }
}