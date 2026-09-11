import java.util.*;
public class loops {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        //while loop (print hello world n times)

        
        int n=sc.nextInt();
        int i=1;
        while (i<=n){      //while(true)  infinite loop
            System.out.println("Hello World!: "+i);
            i++;
        }

        //Sum of n natural numbers using while loop
        int sum=0;
        int j=1;
        while(j<=n){
            sum+=j;
            j++;
        }
        System.out.println("Sum of first "+n+" natural numbers is: "+sum);

        //for loop
        for(int k=1;k<=n;k++){
            System.out.println("Hello World!: "+k);
        }

        int o=4;
        for(int k=1;k<=o;k++){
            for(int l=1;l<=o;l++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        //Reverse of a number
        int m=10899;
        System.out.println(m/10 );
        System.out.println(m%10 );
        int rev=0;

        while(m>0){
            int lastdigit=m%10;
            rev=(rev*10)+lastdigit;
            m/=10;
        }
        System.out.println("Reverse of the number is: "+rev);

        //do-while loop
        do{
            System.out.print("Enter a number: ");
            int num=sc.nextInt();
            if(num%10==0){
                break;
            }
            System.out.println(num);
        } while(true);

        //continue statement
        for(int k=1;k<=5;k++){
            if(k==3){
                continue;
            }
            System.out.println(k);
        }

        //Display all numbers entered by user except multiples of 10
        System.out.print("Enter numbers (enter 0 to stop): ");
        while(true){
            int num=sc.nextInt();
            if(num==0){
                break;
            }
            if(num%10==0){
                continue;
            }
            System.out.println(num);
        }

        //Sum of even and odd digits of a number
        int num1=sc.nextInt();
        int even=0;
        int odd=0;
        for(int k=1;k>0;k++){
            int lastDigit=num1%10;

            if(lastDigit%2==0){
                even += lastDigit;
            } else {
                odd += lastDigit;
            }
            num1/=10;
        }
        System.out.println("Sum of even digits: " + even);
        System.out.println("Sum of odd digits: " + odd);


        //Multiplication table of a number
        System.out.print("Enter a number: ");
        int d=sc.nextInt();
        for(int k=1;k<=10;k++){
            System.out.println(d+" x "+k+" = "+(d*k));
        }

        //Factorial of a number

        System.out.print("Enter a number to get : ");
        int e=sc.nextInt();
        int fact=1;
        for(int h=1;h<=e;h++){
            
            
            fact*=(h);
            System.out.println(h+"! = "+fact);

        }
        System.out.println("factorial: "+fact);

        //Check if a number is prime or composite
        //1.) My solution
        int f=sc.nextInt();
        if(f<=1){
                System.out.println("Not prime");
                return;
            }
        for(int l=2;l<=(f/2);l++){
            
            if(f%l==0){
                System.out.println("Composite");
                return;
            }
        }
        System.out.println("Prime");

        //2.) Sir's solution. Concept of square roots
        int x=sc.nextInt();

        if(x==2){
            System.out.println("x is prime number");
        }else{
            boolean isPrime=true;
            for(int g=2;g<=Math.sqrt(x);g++){    //Square root reduce the time complexity of program otherwise g<=x
                if(x%g==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println("x is Prime");

            }else{
                System.out.println("x is not prime");
            }
        }

    }
}


