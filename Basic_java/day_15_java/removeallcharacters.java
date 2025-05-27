package Basic_java.day_15_java;

import java.util.Scanner;

public class removeallcharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        for(int i=0;i<s1.length();i++){
            char s3 = s2.charAt(i);
            if(s2.indexOf(s1)== -1){
                System.out.println(s3);
            }
        }
    }
}
