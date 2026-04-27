package CoreJava.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Multidimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    /*
        1 2 3
        4 5 6
        7 8 9
     */
        int [][] a = new int [3][];
        // OR
//        int [][] arr ={
//                {1,2,3},
//                {4,5,},
//                {6,7,8,9}
//                };
//        System.out.println(Arrays.toString(arr[0 ]));
//        System.out.println(arr[0][2]);
        int [][] arr = new int[3][3];
        // Input
        for(int row = 0;row<arr.length;row++){
            for (int col = 0; col<arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }
        // Output
        // Method 1:
//        for(int row = 0;row<arr.length;row++){
//            for (int col = 0; col<arr[row].length;col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }
        // Method 2:
//        for(int row = 0;row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
        // Method 3:
        // Enhanced for loop
        for(int[] x : arr){
            System.out.println(Arrays.toString(x));
        }

    }
}