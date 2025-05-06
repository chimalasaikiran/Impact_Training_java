package Basic_java.pratice_promblems_java;
import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the day:");
        int day = sc.nextInt();
       switch (day) {
        case 0:
        System.out.println("Sunday");
            
            break;
            case 1:
            System.out.println("Monday");

            break;
            case 2:
            System.out.println("tue");

            break;
            case 3:
            System.out.println("wesn");

            break;
            case 4:
            System.out.println("thu");

            break;
            case 5:
            System.out.println("firday");

            break;
            case 6:
            System.out.println("sat");

            break;
       
        default:
            break;
       }
    }
}
