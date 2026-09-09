import java.util.*;
public class condnst {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        //conditional statements

        //number is even or odd

        System.out.print("Enter a number:");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println(num +" is even");
        }
        else {
            System.out.println(num +" is odd");
        }

        //elsr if statements

        int age=sc.nextInt();

        if (age>=18){
            System.out.println("You are eligible to vote");
        }
        else if (age>12 && age <20){
            System.out.println("You are a teenager");
        }
        else{
            System.out.println("You are a child");
        }

        // Income tax calculator

        System.out.print("Enter your income:");
        double income=sc.nextDouble();  
        double tax;

        if (income<500000){
            tax=0;        }
        else if (income>=500000 && income<1000000){
            tax=0.2*income;
        }
        else if (income>=1000000 && income<2000000){
           tax=0.3*income;
        }
        else{
             tax=0.3*income;
        }
        System.out.println("You are required to pay " + tax + " income tax");

        //Largest of three numbers

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if (a>b && a>c){
            System.out.println(a + " is the largest number");
        }
        else if (b>c){
            System.out.println(b + " is the largest number");
        }
        else{
            System.out.println(c + " is the largest number");
        }

        //Ternary operator

        int x=sc.nextInt();
        int y=sc.nextInt();

        int max=(x>y)?x:y;

        System.out.println(max + " is the largest number");

        // dataType variable=(condition)?value1(if condition is true):value2(if condition is false);

        boolean isEven=(num%2==0)?true:false;
        System.out.println(num + " is even: " + isEven);
        
        //Check a student is pass or fail using ternary operator
        int marks=sc.nextInt();
        String result=(marks>=33)?"Pass":"Fail";
        System.out.println("Result: " + result);

        //Switch statement

        int button=sc.nextInt();

        switch(button){
            //after case keyword whatever value is given, will be compared with the variabe in the switch statement
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("Mangoshake");
                break;
            default:
                System.out.println("Invalid button");
            
        }

        //Calculator using switch statement

        System.out.print("Enter num1: ");
        int num1=sc.nextInt();
        System.out.print("Enter num2: ");
        int num2=sc.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator=sc.next().charAt(0);

        switch(operator){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid operator");
        }


        //Leap year or not
        //either year is divisible by 400 or year is divisible by 4 and not divisible by 100

        int year=sc.nextInt();
        
        if((year%4==0 && year%100!=0 )|| year%400==0){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }

    
}