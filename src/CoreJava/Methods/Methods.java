package CoreJava.Methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 :");
        int a = in.nextInt();
        System.out.print("Enter number 2 :");
        int b = in.nextInt();
        int sum = a+b;
        System.out.println("Sum is "+sum);
    }
}