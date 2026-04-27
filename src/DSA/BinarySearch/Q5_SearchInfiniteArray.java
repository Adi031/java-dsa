package DSA.BinarySearch;
public class Q5_SearchInfiniteArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,10,12,13,14,15,17,19,21,23,25,27,};
        int target = 15;
        System.out.println(position(arr,target));
    }
    static int position(int[] a,int target){
        int start =0;
        int end = 1;
        while(target>a[end]){
            int temp = end+1;
//             end = previous end + (size of block)*2
            end = end+(end-start+1)*2;
            start = temp;
        }
        return binarysearch(a,target,start,end);
    }
    static int binarysearch(int[]a,int target , int start ,int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == a[mid]){
                return mid;
            }
            else if (target < a[mid]){
                end = end-1;
            }
            else{
                start = start+1;
            }
        }
        return -1;
    }
}