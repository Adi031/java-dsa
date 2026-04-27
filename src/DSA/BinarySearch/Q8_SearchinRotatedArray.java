package DSA.BinarySearch;
public class Q8_SearchinRotatedArray {
    public static void main(String[] args) {
//      https://leetcode.com/problems/search-in-rotated-sorted-array/
        int [] arr = {1,2,3,4,5,6,7,9};
        int target = 5;
        System.out.println(search(arr,target));
    }
    static int search(int []nums,int target){
        int pivot = findpivot(nums);
        int ans;
        if(pivot!=-1) {
            ans = binarysearch(nums, target, 0, pivot);
            if (ans == -1) {
                ans = binarysearch(nums, target, pivot + 1, nums.length - 1);
            }
        }
        else{
            ans = binarysearch(nums,target,0,nums.length-1);
        }
        return ans;
    }
//    this will not work for duplicate values.
    static int findpivot(int []a){
        int start =0;
        int end =a.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            // 4 cases here
//          1. if element at [mid+1] is less than element at [mid] then mid is pivot element index.
            if(mid<end && a[mid]>a[mid+1]){
                return mid;
            }
//          2. if element at [mid-1] is greater than element at [mid] then mid-1 is pivot element index.
            if(mid>start && a[mid]<a[mid-1]){
                return mid-1;
            }
//          if start element is greater than element at mid position then the the pivot will lie in (start,mid-1) and we can ignore
//           all the elements right to mid position (including mid).
            if(a[start]>a[mid]){
                end = mid-1;
            }
//          if start element is less than element at mid position then the pivot will lie in (mid+1,end) and we can ignore all
//          the elements left to the mid position (including mid becaues if mid could be the pivot it would have been returned in case 1).
            else {
                start = mid+1;
            }
        }
        return -1;
    }
    static int binarysearch(int []a,int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target == a[mid]){
                return mid;
            }
            else if(target<a[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}