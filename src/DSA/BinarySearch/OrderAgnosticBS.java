package DSA.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arr1 = {98,87,78,65,43,29,20,12,9,5,1};
        int [] arr2 = {1,23,34,49,51,78,80,91,95};
        int target = 78;
        System.out.println(OrderAgnostic(arr2,target));
    }
    static int OrderAgnostic(int [] a, int target){
        int start = 0;
        int end = a.length-1;
        // find if the array is in ascending or descending order.
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
