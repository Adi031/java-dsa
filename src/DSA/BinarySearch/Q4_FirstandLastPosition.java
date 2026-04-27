package DSA.BinarySearch;

import java.util.Arrays;

public class Q4_FirstandLastPosition {
    public static void main(String[] args) {
//   Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//   If target is not found in the array, return [-1, -1].
//   You must write an algorithm with O(log n) runtime complexity.
        int [] arr = {5,7,7,8,8,8};
        int target = 8;
        int[] position = position(arr,target) ;
        System.out.println(Arrays.toString(position));
    }
    static int [] position(int []nums ,int target){
    int [] ans = {-1,-1};
    ans[0] = search(nums,target,true);
    if(ans[0]!=-1) {
        ans[1] = search(nums, target, false);
    }
        return ans;
    }
    static int search(int[] nums ,int target, boolean findstartindex){
        int s=0;
        int e = nums.length-1;
        int ans =-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target<nums[mid]){
                e = mid-1;
            }
            else if(target>nums[mid]){
                s = mid+1;
            }
            else{
                ans = mid;  // potential ans.
                if(findstartindex){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
        }
       return ans;
    }

}