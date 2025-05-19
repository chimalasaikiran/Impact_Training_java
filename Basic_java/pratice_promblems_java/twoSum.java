package Basic_java.pratice_promblems_java;

import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {     //Input: nums = [2,7,11,15], target = 9
                                                 //Output: [0,1]
                                                 //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]
        Scanner sc = new Scanner(System.in);      //Input: nums = [3,2,4], target = 6 Output: [1,2]
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i =0;i<n;i++){
          for(int j=i+1;j<n;j++){
            if(arr[i] + arr[j] == target){
                System.out.printf(i+" "+j);
            }
          }
        }
    }
}
