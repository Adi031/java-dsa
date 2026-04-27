package DSA.BinarySearch;
public class Q2_FloorOfaNumber {
    public static void main(String[] args) {
//          Q.1 In a given array of numbers you have to find the ceiling of a given target.
//        (Ceiling = Smallest element in array which is greater than or equal to target.)
        int [] arr = { 1,2,5,6,12,15,19,34};
        int target = 18;
        int c = floor(arr,18);
        if(c!=-1) {
            System.out.println("Floor of "+target+" is "+arr[c]);
        }
        else {
            System.out.println("Floor not found.");
        }
    }
    // return the index of greatest number <= equal to target.
    static int floor(int[] a, int target){
        int s = 0;
        int e = a.length-1;
//        if the target element is smaller than the smallest number in the array.
//        if(target<a[s]){
//            return -1;
//        }
//        not used here as if the greatest number smaller than target doesn't exist end becomes -1 already so the answer is correct.
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target==a[mid]){
                return mid;
            } else if (target<a[mid]) {
                e= mid-1;
            }
            else {
                s = mid+1;
            }
        }
        return e;
    }
}