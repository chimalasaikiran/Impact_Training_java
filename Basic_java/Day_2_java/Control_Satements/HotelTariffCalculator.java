// package Basic_java.Day_2_java.Control_Satements;
// import java.util.Scanner;

// public class HotelTariffCalculator {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int month = scanner.nextInt();
//         int rentPerDay = scanner.nextInt();
//         int numberOfDays = scanner.nextInt();
//         scanner.close();

//         if (month < 1 || month > 12) {
//             System.out.println("Invalid Input");
//             return;
//         }

//         boolean isPeakSeason = (month == 4 || month == 6 || month == 11 || month == 12);

//         double finalRent = rentPerDay;
//         if (isPeakSeason) {
//             finalRent *= 1.2;
//         }

//         int totalTariff = (int) (finalRent * numberOfDays);
//         System.out.println(totalTariff);
//     }
// }

package Basic_java.Day_2_java.Control_Satements;

import java.util.Scanner;

public class HotelTariffCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int rentperday = sc.nextInt();
        int noofdays = sc.nextInt();
        int finalrent = rentperday *noofdays;

         if(month < 1 || month > 12){
            System.out.println("Invalid Month");
         }else if (month == 4 || month == 6 || month == 11 || month == 12){
            finalrent = (int) (finalrent * 1.2);
            System.out.println(finalrent);
         }
         else{
            System.out.println("FianlReant:"+finalrent);
         }
    }
}