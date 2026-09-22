import java.util.*;

public class array {
    public static void update(int num[]){
        for(int i=0;i<num.length;i++){
            num[i]+=1;
        }
    }

    //Linear Search
    public static int linearSearch(int numbers[],int key){
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                
                return i;
            }
        }
        return -1;
    }

    //Binary Search
    public static int binary(int listB[],int key){
        int n=listB.length;
        int start=0;int end=n-1;
        int mid;
        
            while(start<=end){
                mid=(end+start)/2;
                if(listB[mid]==key){
                    return mid;
                }
                if(listB[mid]<key){
                    start=mid+1;
                }
                if(listB[mid]>key){
                    end=mid-1;
                }
            }     
        return -1;
    }

    //Reverse an array (Swap first and last index then second and second last so on)
    public static void reverseArr(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            
        }
        //System.out.print(Arrays.toString(arr));
    }

    //Pair in array
    public static void pair(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    //Largest no
    public static int largest(int list[]){
        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<list.length;i++){     //Time complexity=O(n)
            if(large<list[i]){
                large=list[i];
            }
            if(small>list[i]){
                small=list[i];
            }
        }
        System.out.println("Largest in list: "+large);
        System.out.println("Smallest in list: "+small);
        return large;
    }

    //print Subarray
    public static void subArray(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length+1;i++){
            
            for(int j=i+1;j<arr.length+1;j++){
                System.out.print(arr[i]+" ");
                for(int k=i+1;k<j;k++){
                    System.out.print(arr[k]+" ");
                }ts++;
                System.out.print("  ");
            }System.out.println();
        }
        System.out.println(ts+ "\n");
    }

    //Or print subarray
    public static void printSubarrays(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){

                for(int k=i;k<=j;k++){
                    
                    System.out.print(arr[k]+" ");
                    
                }ts++;

                System.out.print("  ");  
               
            }
            

            System.out.println();
            
        }
        System.out.println(ts);
    }

    public static void main(String[]Args){
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[50];    //this array occupy 50 int space having null values

        //Input
        System.out.print("Enter the number1: ");
        marks[0]=sc.nextInt();
        System.out.print("Enter the number2: ");
        marks[1]=sc.nextInt();
        System.out.print("Enter the number3: ");
        marks[2]=sc.nextInt();

        //update
        marks[2]=marks[2]+2;
         
        System.out.println("phy: "+marks[0]);
        System.out.println("math: "+marks[1]);
        System.out.print("After adding 2: "); 
        System.out.println("chem: "+marks[2]);

        //Average
        float avg=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("Avg: "+avg);

        //Length of array
        System.out.println("Length of array: "+marks.length);

        //Arrays in java follow  pass by reference the  changes in function reflected in main fxn
        int num[]={1,2,3};          //size=3
        update(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();

        //Linear Search
        int numbers[]={2,4,6,8,10,12,14,16};
        int key=4;
        System.out.print("Index of key: "+linearSearch(numbers, key));
        
        System.out.println();
        //Largest no
        int list[]={1,2,6,3,5};
        System.out.println(largest(list));

        //Binary Search
        int listB[]={2,4,6,8,10,12,14};
        int ind=binary(listB, key);
        System.out.println("Index of key:"+ind);

        //Reverse arr
        int arr[]={1,3,5,7,9,11,13}; 

        pair(arr);
        subArray(arr);
        printSubarrays(arr);
        reverseArr(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
