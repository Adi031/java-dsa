package DSA.BinarySearch;

import java.util.Arrays;

public class Sorted2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target = 6;
        System.out.println(Arrays.toString(binarysearch2D(arr,target)));
    }
    static int[] binarysearch2D(int[][]a ,int target){
        int rows = a.length;
        int cols = a[0].length;
        if(cols==0){
            return new int[]{-1,-1};
        }
        if(rows==1){
            return binarysearch(a,target,0,0,a[0].length-1);
        }
//        run the loop till only 2 rows are remaining.
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = (cols-1)/2;
        while(rStart<(rEnd-1)){  // While this is true it will have more than two rows
            int mid = rStart+(rEnd-rStart)/2;
            if(target == a[mid][cMid]){
                return new int[]{mid,cMid};
            }
            else if(target>a[mid][cMid]){
                rStart = mid;
            }
            else{
                rEnd= mid;
            }
        }
//            now the target is in two rows.
//            If the target is in middle column
        if(target==a[rStart][cMid]){
            return new int[]{rStart,cMid};
        }
        if(target==a[rStart+1][cMid]){
            return new int[]{rStart+1,cMid};
        }
//        check in 1st half.
        if(target<=a[rStart][cMid-1]){
            return binarysearch(a,target,rStart,0,cMid-1);
        }
//        check in 2nd half.
        if(target>=a[rStart][cMid+1]&& target <= a[rStart][cols - 1]){
            return binarysearch(a,target,rStart,cMid+1,cols-1);
        }
//        check in 3rd half.
        if(target<=a[rStart+1][cMid-1]){
            return binarysearch(a,target,rStart+1,0,cMid-1);
        }
//        check in 4th half.
        else{
            return binarysearch(a,target,rStart+1,cMid+1,cols-1);
        }
    }
    static int[] binarysearch(int[][]a,int target,int row,int Cstart, int Cend){
        while(Cstart<=Cend){
            int mid = Cstart+(Cend-Cstart)/2;
            if(target==a[row][mid]){
                return new int[]{row,mid};
            }
            else if(target<a[row][mid]){
                Cend = mid-1;
            }
            else{
                Cstart = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}