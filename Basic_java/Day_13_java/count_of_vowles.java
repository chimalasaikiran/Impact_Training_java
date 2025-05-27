package Basic_java.Day_13_java;

import java.util.Scanner;

public class count_of_vowles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String vowels ="aeiouAEIOU";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
           char v = s.charAt(i);
           if(vowels.indexOf(v) != -1){
             count++;
           }
        }
        System.out.println(count);
    }
}
