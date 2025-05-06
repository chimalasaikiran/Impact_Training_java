package Basic_java.pratice_promblems_java;
import java.util.Scanner;

public class findtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a+b>c || b+c > a || c+a >b ){
            System.out.println("triangle is fromed");
        }
        else{
            System.out.println("triangle is not fromed!!");
        }
    }
}
