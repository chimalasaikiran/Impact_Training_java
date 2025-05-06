package Basic_java.pratice_promblems_java;

public class findarray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        int counteven =0;
        int countodd =0;
        for(int i =0;i<array.length;i++){
            if(array[i] %2==0){
                 counteven++;
            }
            else{
                countodd++;
            }
        }
        System.out.println("Total Evens: "+counteven);
        System.out.println("Total Odd: "+countodd);
    }
}
