package CoreJava.Methods;

import java.util.Scanner;

public class method_parameters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = sum(10,20);
        System.out.println(ans);
    }
    static int sum(int a,int b) {
        int sum = a + b;
        return sum;
    }
}