import java.util.*;
public class Advpattern {


    public static void hollowRect(int toRow,int toCol){
        //Assume rectangle as a matrix having row &col
        for(int i=1;i<=toRow;i++){          //outerloop
            for(int j=1;j<=toCol;j++){              //innercol loop
                if(i==1 || i==toRow ||j==1||j==toCol ){         //boundary one
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }



    //Inverted androtated half-pyramid
    public static void invert_half_pyra(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }



    //Inverted half-pyramid with no
    public static void inver_halfP_no(int n){
        for(int i=1;i<=n;i++){     // outerloop
            for(int j=1;j<=n-i+1;j++){      //innerloop (n-i+1)
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }



    //Floyd's Triangle
    public static void floyd(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num+=1;
            }
            System.out.println();
        }
    }

    //0-1 Triangle
    public static void zero_1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }





    //butterfly pattern
    public static void butterfly(int n){
        //first half

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        //Second half

        for(int i=1;i<=n;i++){              //for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i+1;j++){          //j=1;j<=i
                System.out.print(" * ");        
            }
            for(int j=1;j<=2*(i-1);j++){        //j=1;j<=2*(n-i)
                System.out.print("   ");
            }
            for(int j=1;j<=n-i+1;j++){          //j=1;j<=i
                System.out.print(" * ");
            }
            System.out.println();
        }
        
    }


public static void rhombus(int n){
        for(int i=1;i<=n;i++){              //outerloop

            for(int j=1;j<=n-i;j++){                //space
                System.out.print("   ");
            }
            for(int j=1;j<=n;j++){   
                    //star
                System.out.print(" * ");
            }
            System.out.println();

        }
        
    }


    public static void hollowRhombus(int n){
        for(int i=1;i<=n;i++){              //outerloop

            for(int j=1;j<=n-i;j++){                //space
                System.out.print("   ");
            }
            for(int j=1;j<=n;j++){   
                if(i==1||i==n||j==1||j==n)      {       //star
                System.out.print(" * ");}else{
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
        
    }

    //Diamond 
    public static void diam(int n){
        //first half
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            //stars
            for(int j=1;j<=2*(i-1)+1;j++){      //(2*i)-1
                System.out.print(" * ");
            }
            System.out.println();
        }


        //lowerhalf
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            //stars
            for(int j=1;j<=2*(i-1)+1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }


    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.print("Enter the number: ");
        int m=sc.nextInt();
        System.out.println();
        System.out.println("Hollow Rectangle");
        hollowRect(m,n);
        System.out.println();
        System.out.println("Inverted  Rotated half pyramid");
        invert_half_pyra(n);
        System.out.println();
        System.out.println("Inverted half pyramid in no");
        inver_halfP_no(m);
        System.out.println();
        System.out.println("Floyd's Triangle");
        floyd(n);
        System.out.println();
        System.out.println("0-1 Triangle");
        zero_1(n);
        System.out.println();
        System.out.println("Butterfly ");
        butterfly(n);
        System.out.println();
        System.out.println("Rhombus ");
        rhombus(m);
        System.out.println();
        System.out.println("Hollow Rhombus");
        hollowRhombus(m);
        System.out.println();
        System.out.println("Diamond");
        diam(m);
    }
}
