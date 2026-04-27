package CoreJava.Conditionals_and_loops;
import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        // for loops:
        /*
            Syntax of for loops:
            for(initialization ; condition ; increment/decrement){
                //body
            }
        */

        // Q - Print numbers from 1 to 5
        for(int i =1;i<=5;i++) {
            System.out.print(i+" ");
        }
        // Q - Print numbers from 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number:");
        int n  = sc.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print(i+" ");
        }

        // While loops :
        /*
            Syntax for while lopps:
            while(condition){
                //body
            }
         */
        System.out.println("\n");
        int num = 1;
        while(num<=5){
            System.out.print(num+" ");
            num++;
        }

        // Do while loop:
        /*
            Syntax:
            do{
                // body
               }while(condition);
         */
        int x =1;
        do{
            System.out.println("\n"+x+" ");
        }while(x!=1);
    }
}