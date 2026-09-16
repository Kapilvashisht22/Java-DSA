import java.util.*;
public class fxn {
    //functions and methods


    // To print Hello World

    public static void printHW(){
        System.out.println("hello world!");
    }

    //Function Overloading same function name different parameter number or type 

    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    // Sum function
    public static int sum(int num1, int num2){
        int Sum=num1+num2;
        return Sum;
    }



    public static int multiply(int a, int b){
        int product= a*b;
        return product;
    }


    //factorial
    public static int factorial(int n){
        int fact=1;
        if (n==0){
            System.out.println("factorial of 0 = 1");
        }else{
            for(int i=1;i<=n;i++){
                fact*=i;
                System.out.print(i+"*");
            }
            System.out.println();
        }
        return fact;
    }


    //Swap fxn
    public static void swap(int val1,int val2){
        int temp=val1;
        val1=val2;  //call by value 
        val2=temp;
        System.out.println("fxn val1= "+val1);
        System.out.println("fxn val2= "+val2);
    }

    //Binomial coefficient
    public static int binomial(int a, int b){
        int nfact=factorial(a);
        int rfact=factorial(b);
        int n_rfact=factorial(a-b);
        int bino=nfact/(rfact*n_rfact);
        return bino;
    }

    //Prime or not
    public static boolean isPrime(int n){
        //corner case. Don't check numbers in simple way that isprime or not
        //  we need to write special condition
        if(n==2){      //corner case
            return true;
        }
        for (int i=2;i<=n-1;i++){   
             //for(int i=2;i<=Math.sqrt(n);i++){    //optimized way
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    //Prime range 
    public static void primeRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)==true){
                System.out.print(i+" ");
            }

        }
    }

    //Bimary to decimal conversion
    public static void binToDec(int binNo){
        int pow=0;   
        int dec=0;
        while(binNo>0){
            int lastDigit=binNo%10;
            dec=dec  + (lastDigit*(int)Math.pow(2,pow));  //Math.pow always take double value
                pow++;
                binNo=binNo/10;
        }
        System.out.println("Decimal of "+binNo+" = "+dec);
    }

    //Decimal to Binary
    public static void decToBin(int n){
        int pow=0;
        int binNo=0;

        while(n>0){
            int rem =n%2;
            binNo=binNo+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary form of "+n+" = "+binNo);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a= sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        System.out.print("Enter c: ");
        int c=sc.nextInt();
        int sum=sum(a,b,c);
        System.out.println("Sum: "+sum);
        sum=sum(a,b);
        System.out.println("Sum: "+sum);
        printHW();

        //Swap -value exchange
        int val1=5;
        int val2 =7;

        //Swap-call
        swap(val1,val2); 
        System.out.println("val1= "+val1);
        System.out.println("val2= "+val2);

        //Product function
        int product=multiply(a,b);
        System.out.println("product: "+product);

        //factorial 
        int n=sc.nextInt();
        int fact=factorial(n);
        System.out.println("Factorial: "+fact);

        //binomial coefficient
        int x=sc.nextInt();
        int y=sc.nextInt();
        int bino=binomial(x,y);
        System.out.println("Binomial coeficient (x,y): "+bino);

        //Prime or not
        System.out.print("Enter no: ");
        int no=sc.nextInt();
        boolean Prime=isPrime(no);
        System.out.println("It is "+Prime+ " that no "+" is prime");

        //prime in range no
        primeRange(no);

        //Binary to decimal    
        int binary=sc.nextInt();    // multiply by 2 raise to the power    &  divided by 10
        binToDec(binary);

        //decimal to Binary
        decToBin(no);               // multiply by 10 raise to the power  & divided by 2

    }
}
