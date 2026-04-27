package DSA.Math;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if((n & 1) == 1){
            System.out.println("ODD");
        }
        else{
            System.out.println("EVEN");
        }
    }

    public static class GCD_LCM {
        public static void main(String[] args) {
            System.out.println(gcd(2,5));
            System.out.println(lcm(2,7));
        }
        static int gcd(int a,int b){
            if(a==0){
                return b;
            }
            return gcd(b%a,a);
        }
        static int lcm(int a, int b){
            return a * b / gcd(a,b);
        }
    }
}
