package CoreJava.Conditionals_and_loops;
import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number and the digit:");
        long a = in.nextLong();
        int b = in.nextInt();
        int count =0;
        int rem = 0;
        while(a>0){
            rem = (int)a % 10;
            if(rem == b){
                count++;
            }
            a = a/10;
        }
        System.out.println("Occurence of "+b+" is "+count);
    }
}