package CoreJava.Methods;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = in.nextInt();
        System.out.println(isprime(a));
        System.out.println(isarmstrong(a));
        // print all three digit armstrong numbers..
        for(int i =100;i<1000;i++){
            if(isarmstrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isprime(int a){
        if(a<=1){
            return false;
        }
        else{
            int c = 2;
            while(c*c<=a){
                if(a%c==0){
                    return false;
                }
                c++;
            }
        }
        return true;
    }
    static boolean isarmstrong(int a){
        int original = a;
        int sum =0;
        while(a>0){
            int rem = a%10;
            sum = sum+ rem*rem*rem;
            a = a/10;
        }
        return sum == original;
    }
}