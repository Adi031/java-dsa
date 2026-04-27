package CoreJava.Methods;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        sum();
        int x = sum2();
        System.out.println("sum2 is "+x);
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 :");
        int a = in.nextInt();
        System.out.print("Enter number 2 :");
        int b = in.nextInt();
        int sum = a+b;
        System.out.println("Sum is "+sum);
    }
    // return a value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 :");
        int a = in.nextInt();
        System.out.print("Enter number 2 :");
        int b = in.nextInt();
        int sum = a+b;
        return sum;
    }
    /*
    Syntax:
        access_modifier return_type name(arguments){
                // body
                return Statement ( if return type is not void )
         }
     */
}