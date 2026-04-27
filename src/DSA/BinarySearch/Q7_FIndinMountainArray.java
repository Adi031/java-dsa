package DSA.BinarySearch;
public class Q7_FIndinMountainArray {
    public static void main(String[] args) {
//      Q- You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//      Return the index of target element if it exists in the array otherwise return -1.
//      Your task is to solve it in O(log(n)) time complexity.
        int [] arr = {2,4,5,6,7,0,1,3};
        int target = 7;
        System.out.println(search(arr,target));
    }
    static int search(int[] a, int target){
       int ans ;
        int peak = findpeak(a);
        ans = binarysearch(a,target,0,peak);
        if(ans==-1){
            ans = binarysearch(a,target,peak,a.length-1);
        }
        return ans;
    }
    static int findpeak(int [] a){
        int start = 0;
        int end = a.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(a[mid]<a[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
    static int binarysearch(int[]a,int target,int start,int end){
        boolean isAsc = a[start] < a[end] ;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == a[mid]){
                return mid;
            }
            if(isAsc){
                if(target > a[mid]){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
            else{
                if(target > a[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}