package Basic_java.pratice_promblems_java;
import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first num:");
        int num1 = sc.nextInt();
        System.out.println("ENter the second num:");
        int num2 = sc.nextInt();
        if(num1 < num2){
            System.out.println(num1+ "is min");
        }
        else if (num1 > num2){
            System.out.println(num2+ " is min");
        }
    }
}
