package DSA.BinarySearch;
public class Q9_RotatedArrayWithDuplicates {
    public static void main(String[] args) {
//      Searching element in Rotated array with duplicates,
        int [] arr = {0,1,2};
        int target = 0;
        System.out.println(search(arr,target));
    }
    static int search(int [] nums ,int target){
        int pivot = findpivotwithduplicates(nums);
        int ans;
        if(pivot!=-1){
            ans = binarysearch(nums,target,0,pivot);
            if(ans==-1){
                ans = binarysearch(nums,target,pivot+1,nums.length-1);
            }
        }
        else{
            ans = binarysearch(nums,target,0,nums.length-1);
        }
        return ans;
    }
    static int findpivotwithduplicates(int [] a){
        int start = 0;
        int end = a.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && a[mid]>a[mid+1]){
                return mid;
            }
            if(mid>start && a[mid-1]>a[mid]){
                return mid-1;
            }
            if(a[mid]==a[start] && a[mid]==a[end]){
//                check if start is pivot
                if(start<end && a[start]>a[start+1]){
                    return start;
                }
                start++;
//                check if end is pivot
                if(end>start && a[end-1]>a[end]){
                    return end;
                }
                end--;
            }
//            left side is sorted than pivot should lie on right side.
            else if(a[start]<a[mid] || (a[start]==a[mid]&&a[mid]>a[end])){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
    static int binarysearch(int []a,int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==a[mid]){
                return mid;
            }
            else if(target<a[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
}