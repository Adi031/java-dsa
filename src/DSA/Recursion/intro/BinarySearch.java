package DSA.Recursion.intro;
public class BinarySearch {
    public static void main(String[] args) {
    int []arr = {1,3,2,6,4,7,8,0,12};
        System.out.println(search(arr,3,0,arr.length-1));
    }
    static int search(int [] a, int target , int s ,int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(a[mid]==target){
            return mid;
        }
        if(target<a[mid]){
            return search(a ,target , s, mid-1);
        }
        return search(a,target,mid+1,e);
    }
}