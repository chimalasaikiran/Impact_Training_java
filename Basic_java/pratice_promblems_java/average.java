package Basic_java.pratice_promblems_java;

public class average {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6,7,8};
        int sum =0;
        for(int i=0;i<array.length;i++){
            sum +=array[i];
        }
        System.out.println("Total Sum: "+sum);
        float avg = sum/array.length;
        System.out.println("Total avg: "+avg);
        
    }
}
