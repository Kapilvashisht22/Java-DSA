import java.util.*;
public class sort {

    //Bubble Sort move larger at the end by swapping adjacent
    public static void bubble(int arr[]){
        //for(int i=0;i<arr.length;i++){   //give correct answer but at the last iteration it would be get to 0 or negative
        for(int i=0;i<arr.length-1;i++){   //This is more effective as after moving n-1 elements at their place the last one  will automatically in correct place
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }            
        }
        System.out.println(Arrays.toString(arr));
    }

    

    //Sorting Algorithm
    public static void sorting(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minPos]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Insertion Sort pick first elemet and sort elements left side
    public static void insert(int arr2[]){
        for(int i=1;i<arr2.length;i++){
            int curr=arr2[i];
            int prev=i-1;
            while(prev>=0 && arr2[prev]>curr){
                arr2[prev+1]=arr2[prev];
                prev--;
            }
            //Insertion
            arr2[prev+1]=curr;

        }
        System.out.println(Arrays.toString(arr2));
    }

    //Counting Sort
    public static void countSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        //Find largest no.in array
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        //Frequency of no. in array
        int count[]=new int [largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;    //arr[i] tell the value and value will increase that particular  index of count +1
            //arr[1]=4 => count[4] (at index 4) +1
        }

        //Sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;  
                j++;
                count[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Printing arr
    public static void printArr(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"  ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // int arr[]={5,4,1,3,2};
        // System.out.println("Bubble Sort");
        // bubble(arr);
        // System.out.println("Array");
        // int arr1[]={5,4,1,3,2};
        // System.out.println(Arrays.toString(arr1));
        // System.out.println("Selection Sort");
        // sorting(arr1);
        // System.out.println("Insertion Sort");
        // int arr2[]={5,4,1,3,2};
        // insert(arr2);
        // System.out.println("Inbuilt Sort");
        // int arr3[]={9,7,2,5,3};
        // //Inbuilt Sort
        // Arrays.sort(arr3);
        // printArr(arr3);
        // int arr4[]={9,7,2,5,3};
        // Arrays.sort(arr4,1,3);//1&3 are start and end index upto we have to sort
        // printArr(arr4);
        // //Inbuilt reverse sort using collections
        // //int arr5[]={9,7,2,5,3};       //int is of primitive type 
        // Integer arr5[]={9,7,2,5,3};     //Integer is object datatype which  is used by Collections
        // Arrays.sort(arr5,1,3,Collections.reverseOrder());//1&3 are start and end index upto we have to sort
        // System.out.println(Arrays.toString(arr5));
        // //Collections use object arrays as input

        // Integer arr6[]={9,7,2,5,3};
        // Arrays.sort(arr6,Collections.reverseOrder());//1&3 are start and end index upto we have to sort
        // System.out.print(Arrays.toString(arr6));
        // System.out.println("decreasing order");

        //Counting Sort
        int arr7[]={1,4,1,3,2,4,3,7};
        countSort(arr7);
        System.out.println(Arrays.toString(arr7));  //Because arrays pass by reference
    }
    
}