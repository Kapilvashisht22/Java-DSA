// S of System should capitalized.
import java.util.*;
public class intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");


        //code to add two numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum: " + sum);


        a=sum+1;
        System.out.println("New value of a: " + a); 
        
        
        //Data types in Java
        byte c =5;
        System.out.println("Value of byte c: " + c);
        char d = 'A';
        System.out.println("Value of char d: " + d);
        //short, int, long, float, double, boolean
        


        //Taking input from user
        String name = sc.next();
        System.out.println("Hello, " + name);

        //Product of two numbers
        int x = sc.nextInt();
        int y = sc.nextInt();
        int product = x * y;
        System.out.println("Product: " + product);

        //Area of a circle
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println("Area of circle: " + area);

        //Type conversion  (destination{long}>source{int})
        int num = 5;
        long convertedNum = num; // Implicit conversion
        System.out.println("Converted number: " + convertedNum);
        
        //Type casting (destination{int}<source{long})
        float largeNum = 10.0f;
        //int castedNum =  largeNum; this will give error because long is larger than int and same in taking input from user
        int castedNum = (int) largeNum; // Explicit/type casting
        System.out.println("Casted number: " + castedNum);

        //Type promotion in expressions(a+b...)
        char b1 = 'A';
        short b2 = 20;
        int b3 = b1 + b2; // b1 and b2 are promoted to int before addition
        System.out.println((int)b1); 
        System.out.println((int)b2);
        System.out.println("Promoted sum: " + b3);

        byte n= 10;
        //byte m=n*2;  This will give error because n*2 is promoted to int before assignment
        byte m1 = (byte)(n*2); // Explicit type casting to byte
        System.out.println("Value of m1: " + m1);
    
        int $=24;
        System.out.println($);
    }
}
