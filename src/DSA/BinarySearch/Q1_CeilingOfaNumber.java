package DSA.BinarySearch;
public class Q1_CeilingOfaNumber {
    public static void main(String[] args) {
//        Q.1 In a given array of numbers you have to find the ceiling of a given target.
//        (Ceiling = Smallest element in array which is greater than or equal to target.)
    int [] arr = { 1,2,5,6,12,15,19,34};
    int target = 18;
    int c = ceiling(arr,target);
    if(c!=-1) {
        System.out.println("Ceiling of "+target +" is "+arr[c]);
    }
    else {
        System.out.println("Ceiling not found.");
    }
    }
    // return the index of smallest number >= to target.
    static int ceiling(int[] a, int target){
        int s = 0;
        int e = a.length-1;
        // if the target element is greater than greatest element in the array.
        if(target<a[0]){
            return -1;
        }
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target == a[mid]){
               return mid;
            }
            else if(target<a[mid]){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
//        When the s<=e condition is violated the element at index s is the answer for the element >= target.
        return s;
    }
}