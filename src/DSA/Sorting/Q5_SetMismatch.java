package DSA.Sorting;

import java.util.Arrays;

public class Q5_SetMismatch {
    public static void main(String[] args) {
        int [] arr = {8,7,3,5,3,6,1,4};
        System.out.println(Arrays.toString(mismatch(arr)));
    }
    static int[] mismatch(int[]nums){
        int i =0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=i+1){
                if(nums[i]!=nums[correct]){
                    int temp  =nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                }
                else{
                    return new int[]{nums[i],i+1};
                }
            }
            else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }
}