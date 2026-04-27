package DSA.BinarySearch;
public class Q11_SplitArrayLargestSum {
    public static void main(String[] args) {
//        https://leetcode.com/problems/split-array-largest-sum/submissions/1623062587/
//        Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest
//        sum of any subarray is minimized.
//        Return the minimized largest sum of the split.A subarray is a contiguous part of the array.
        int[] arr = {1,2,4,5,6,9};
        int k = 2;
        System.out.println("Minimized largest sum is "+sum(arr,k));
    }
    static int sum(int [] nums,int k){
        int start =0;
        int end =0;
        for(int num: nums){
            if(num>start){
                start = num;
            }
            end += num;
        }
        while(start<end){
            int mid = start+(end-start)/2;
            int sum =0;
            int pieces = 1;
            for(int num:nums){
                if(sum+num>mid){
                    sum =num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            if(pieces<=k){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
}