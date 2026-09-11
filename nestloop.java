import java.util.*;
public class nestloop {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        //Nested Loops i) Star pattern

        int n=sc.nextInt();
        for(int line=1;line<=n;line++){    //No.of lines
            for(int star=1;star<=line;star++){    //work in single line
                System.out.print("  *  ");
            } 
            System.out.println();
        }

        System.out.println("Inverse Star half pyramid");
        for(int l=0;l<n;l++){          //if l=1 & l<=a
            for(int s=1;s<=n-l;s++){   // then s<=a-l+1
                System.out.print("  *  ");
            }
            System.out.println();
        }

        System.out.println("number Half-pyramid");

        for(int i=1;i<=n;i++){                     //outer loop
            for(int number=1;number<=i;number++){  //inner loop
                System.out.print(number);
            }
            System.out.println();
        }

        System.out.println("character pattern");
        int val=65;
        //char ch='A';
        for(int ln=1;ln<=n;ln++){
            for(int chars=1;chars<=ln;chars++){
                //System.out.print(ch); ch++;
                System.out.print((char)val+" ");
                val++;
            }
            System.out.println();
        }

    }
}
