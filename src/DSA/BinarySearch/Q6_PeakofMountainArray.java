package DSA.BinarySearch;
public class Q6_PeakofMountainArray {
    public static void main(String[] args) {
//      Q- You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//      Return the index of the peak element.
//      Your task is to solve it in O(log(n)) time complexity.
        int[] arr = {1,2,3,4,5,7,5,4,2};
        System.out.println(arr[peak(arr)]);
    }
    static int peak(int[] a){
        int start = 0;
        int end = a.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(a[mid]<a[mid+1]){
//              if the a[mid+1} is greater than element at mid position then we are in asc part of array.
//              Hence , the peak will be somewhere in right part of mid.
                start = mid+1;
            }
            else {
//              if a[mid+1] is less than element at mid position then we are in desc part of array.
//              Hence ,the mid may be the peak or the peak may lie in the left part of mid.
                end = mid;
            }
        }
//        at the end start and end will point to the same element which is also the peak of the array.
//        Since , start and end both are pointing to the same element (peak) , we can return any of them
        return start;
    }
}