package CoreJava.Conditionals_and_loops;
import java.util.Scanner;
public class   Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(n+"th fibonacci number is ");
        if(n == 1){
            System.out.println(a);
        }
        else{
            for(int i = 2;i<=n;i++){
                int temp = b;
                b = a+b;
                a = temp;
            }
            System.out.println(b);
        }
    }
}