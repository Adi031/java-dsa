package CoreJava.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] a = new int[5];
        // taking input normally
        a[0] = 12;
        a[1] = 15;
        // taking input using loops
        for(int i =0;i<a.length;i++){
            a[i] = in.nextInt();
        }
        // displaying array
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        // displaying array using enhanced for loop
        for (int j : a)     // for every element in array , print the element.
        {
            System.out.print(j+" " +
                    "");  // j represents element of array.
        }
        // displaying array
        System.out.println(Arrays.toString(a));

    }
}