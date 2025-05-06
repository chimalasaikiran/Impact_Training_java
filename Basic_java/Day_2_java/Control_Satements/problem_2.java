// The Research team led by Bernadette Wolowitz at Cat sech University has ducovered a new Amocha that grows in the order of a Fibonacci series every month.They are exhibiting this amoebia at a national conference.They want to know the size of the amoeba at a particular time instant,If a panicular montits indes is given write a program to display the amoebas size

// For Example,the size of the amoeba in months 1,2,3,4,5,6 be 0.1,1.2.3.5respectively

// Input Format

// The input is an integer till denotes the count of the month.

// Constraints

// NA

// Output Format

// The output is an integer denoting the amoeba size

// Camnle Inent

// Submissio

// Max Scor

// Difficulty

// Rate Thi

// Mire

// 5

//input
//13
//output
//144







package Basic_java.Day_2_java.Control_Satements;

import java.util.Scanner;

public class problem_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a =0,b=1,sum=0;
        for(int i=2;i<num;i++){
            sum = a+b;
            a =b;
            b=sum;
            
        }
        System.out.println(sum);
        

    }
}