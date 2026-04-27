package CoreJava.Conditionals_and_loops;

import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = in.nextInt();
        int ori = a;
        int rev = 0;
        while(a>0){
            rev = rev*10 +(a%10);
            a /= 10;
        }
        System.out.println("Reverse of "+ori+" is "+rev);
    }
}