package Basic_java.Day_14_java;

import java.util.Scanner;

public class smallAlphabet_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<alphabet.length();i++){
            char ch = alphabet.charAt(i);
            if(s.indexOf(ch) == -1){
                System.out.println(ch);
                break;
            }
        }
    }
}
