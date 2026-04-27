package DSA.LinearSearch;
import java.util.Arrays;
public class SearchIn2Darray {
    public static void main(String[] args) {
        int [][] arr = {
                {1,4,7},
                {9,12,5,8},
                {7,6,}
        };
        int target = 9;
        int[] ans = search2d(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(Max2d(arr));
        System.out.println(Min2d(arr));
    }
    static int[] search2d(int[][] a,int target){
        for(int row=0;row<a.length;row++){
            for(int col =0; col<a[row].length;col++){
                if(a[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int Max2d(int[][] a){
        int max = a[0][0];
        for (int[] ints : a) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
    static int Min2d(int[][] a){
        int min = Integer.MAX_VALUE;
        for(int []r :a){
            for(int c : r){
                if (min > c){
                    min = c;
                }
            }
        }
        return min;
    }
}