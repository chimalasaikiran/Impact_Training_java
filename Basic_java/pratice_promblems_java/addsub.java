package Basic_java.pratice_promblems_java;
import java.util.Scanner;

public class addsub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first & second number");
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter a opteror:");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
            System.out.println(a+b);
                
                break;
                case '-':
                System.out.println(a - b);

                break;
                case '*':
                System.out.println(a * b);

                break;
                case '/':
                System.out.println(a / b);

                break;
                case '%':
                System.out.println(a % b);

                break;
        
            default:
                break;
        }
    }
}
