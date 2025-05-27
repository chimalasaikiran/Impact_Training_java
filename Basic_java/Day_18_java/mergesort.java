package Basic_java.Day_18_java;

public class mergesort {
    public static void merge(int [] arr,int left,int right,int mid){
        int n1 =mid - left+1;
        int n2 = right - mid;
        int [] l = new int [n1];
        int [] r = new int [n2];
        for(int i=0;i<n1;i++){
            l[i] = arr[left+i];
            for(int j=0;j< n2;j++){
                
            }
            while(i <n1 && j<n2){
                if(l[i] <= r[j]){
                    arr[k] = l[i];
                    i++;
                }else {
                    arr[k] = r[j];
                    j++;
                }
                k++;
            }
            while(i<n1){
                arr[k] =l[i]
            }
        }
       
    }
    public static void main(String[] args) {
        
    }
}
