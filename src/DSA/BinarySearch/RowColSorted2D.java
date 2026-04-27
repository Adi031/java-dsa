package DSA.BinarySearch;

import java.util.Arrays;

public class RowColSorted2D {
    public static void main(String[] args) {
//        Matrix is sorted row-wise and col-wise.
        int [][]arr = {
                {1,3,5,7},
                {2,4,6,8},
                {3,7,9,10},
                {5,8,11,13}
        };
        int target = 3;
        System.out.println(Arrays.toString(binarysearch2D(arr,target)));
    }
    static int[]  binarysearch2D(int[][]a,int target){
        int row = 0;
        int col = a.length-1;
        while(row<a.length && col>0){
            if(a[row][col]==target){
                return new int[]{row,col};
            }
            if(target>a[row][col]){
                row++;
            }
           else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}