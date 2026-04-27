package DSA.BinarySearch;
public class Q10_RotationCount {
    public static void main(String[] args) {
//        Find the rotation count
        int [] arr = {2,3,0,1,2};
        System.out.println("Rotation count is "+rotation_count(arr));
    }
    static int rotation_count(int[]arr) {
        int pivot = findpivot(arr);
        return pivot+1;
    }
    static int findpivot(int [] a){
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
    }
