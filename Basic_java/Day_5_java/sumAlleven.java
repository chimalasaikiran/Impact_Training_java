package Basic_java.Day_5_java;

public class sumAlleven {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i/2!=0){
                sum+=arr[i];
                System.out.println(sum);
            }
        }
        
    }
}
