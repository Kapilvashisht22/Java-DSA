import java.util.*;

public class operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Arithmetic operators
        //Binary operators: +, -, *, /, %
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        //Unary operators: ++, --
        int x = 10;
        int y=++x; // Pre-increment x=11,y=11
        int z=x++; // Post-incrementz=11=x, x=12
        System.out.println("Post-increment: x = " + x + ", z = " + z);//at last z,y=11  ; x=12
        System.out.println("Pre-increment: x = " + x + ", y = " + y);

        int p = 10;
        int q = --p; // Pre-decrement p=9,q=9
    System.out.println("Pre-decrement: p = " + p + ", q = " + q);

        int m = 10;
        int n = m--; // Post-decrement n=10, m=9
        System.out.println("Post-decrement: m = " + m + ", n = " + n);

        //Relational operators: ==, !=, >, <, >=, <=
        int num1 = 5;
        int num2 = 10;
        System.out.println("Equal to: " + (num1 == num2));
        System.out.println("Not equal to: " + (num1 != num2));
        System.out.println("Greater than: " + (num1 > num2));
        System.out.println("Less than: " + (num1 < num2));
        System.out.println("Greater than or equal to: " + (num1 >= num2));
        System.out.println("Less than or equal to: " + (num1 <= num2));

        //Logical operators: &&, ||, !
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("AND: " + (bool1 && bool2));
        System.out.println("OR: " + (bool1 || bool2));
        System.out.println("NOT: " + (!bool1));
        System.out.println(93<5 && 5>3);
        System.out.println(93<5 || 5>3);

        //Assignment operators: =, +=, -=, *=, /=, %=
        int a1 = 10;
        a1 += 5; // a1 = a1 + 5
        System.out.println("Addition assignment: " + a1);
        a1 -= 3; // a1 = a1 - 3
        System.out.println("Subtraction assignment: " + a1);
        a1 *= 2; // a1 = a1 * 2
        System.out.println("Multiplication assignment: " + a1);
        a1 /= 4; // a1 = a1 / 4
        System.out.println("Division assignment: " + a1);
        a1 %= 3; // a1 = a1 % 3
        System.out.println("Modulus assignment: " + a1);
      // Try this one int x = 9, y = 12;int a = 2, b = 4, c = 6;int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);System.out.println(exp);

    }

}
