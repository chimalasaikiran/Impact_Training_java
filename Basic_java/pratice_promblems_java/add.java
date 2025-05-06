package Basic_java.pratice_promblems_java;

import java.util.Scanner;

public class add {

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Three digits:");
        int [] nums = new int[3];
          int sum =0;
          for(int i =0;i<3;i++){
             nums[i] =obj.nextInt();
            sum +=nums[i];
          } 
          System.out.println(sum);
        
        
    }
}
