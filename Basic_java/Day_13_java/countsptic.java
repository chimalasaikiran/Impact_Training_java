package Basic_java.Day_13_java;

import java.util.Scanner;

public class countsptic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        char [] arr = s.toCharArray();
        int count = 0; 
        for(int i=0;i<arr.length;i++){
            if(arr[i] == ch){
                count++;
            }
        }        
        System.out.println(count);
    }
}
