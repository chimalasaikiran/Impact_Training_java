package Basic_java.Day_8_java;

import java.util.Scanner;

public class HigWe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int[] arr = new int[n*2]; 
        for (int i=0;i<n*2;i++) {
            arr[i] = sc.nextInt(); 
        }
        int maxHeight = 0, maxHeightPerson = -1;
        int maxWeight = 0, maxWeightPerson = -1;
        for (int i=0;i<n;i++) {
            int height = arr[2*i];
            int weight = arr[2*i+1];

            if (height>maxHeight) {
                maxHeight = height;
                maxHeightPerson = i + 1; 
            }
           if (weight > maxWeight) {
                maxWeight = weight;
                maxWeightPerson = i + 1;
            }
        }

        System.out.println( "Person: " + maxHeightPerson);
        System.out.println("Person: " + maxWeightPerson);
    }
}
