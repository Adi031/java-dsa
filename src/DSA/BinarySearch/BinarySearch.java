package DSA.BinarySearch;
public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,4,7,12,21,34,36,45,78,80};
        int target = 12;
        System.out.println(binarysearch(arr,target));
    }
    static int binarysearch(int [] a,int target){
        int start =0;
        int end = a.length-1;
        while(start<=end){
//            int mid = (start+end)/2;
//            sometimes if start and end are very high values start+end --> may exceed the range of integers.
//            better way to find mid is :
            int mid = start + (end-start)/2;
            if(target > a[mid]){
                start = mid+1;
            }
            else if(target < a[mid]){
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}