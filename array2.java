//kept uncomplete after some time one by one
import java.util.*;
public class array2 {
    //Or print subarray
    public static void printSubarrays(int arr[]){
        int ts=0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
                sum=0;

                for(int k=i;k<=j;k++){    
                    sum+=arr[k];
                }
                ts++;
                System.out.print(sum);
                
                if(sum>max){
                    max=sum;
                }
                System.out.print("  ");

            }
            System.out.println();
        }
        System.out.println("Total Subarrays: "+ts);
        System.out.println("Max Array Sum: "+max);
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,-2,6,-1,3};
        printSubarrays(arr);
    }
    
}