package CoreJava.Conditionals_and_loops;

import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an alphabet:");
        char c = in.next().trim().charAt(0);
        if(c>='a' && c<='z'){
            System.out.println("lowercase");
        }
        else {
            System.out.println("Uppercase");
        }
    }
}