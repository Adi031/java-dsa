package CoreJava.Conditionals_and_loops;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            in.nextLine();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers : ");
                double a = in.nextDouble();
                double b = in.nextDouble();
                double ans = 0;
                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    } else {
                        System.out.println("Division by zero not possible");
                    }
                }
                if (op == '%') {
                    ans = a % b;
                }
                System.out.println(ans);
            }
            else if (op == 'X' || op == 'x') {
                break;
            }
            else {
                System.out.println("Invalid operator!!");
            }
        }
    }
}