package DSA.LinearSearch;
public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {1,2,12,43,6,23,9,0};
        int target = 1;
        int start = 3;
        int end = 7;
        System.out.println(search(arr,target,start,end));
    }
    static boolean search(int[] a,int target ,int start,int end){
        if (a.length==0){
            return false;
        }
        for(int i=start;i<=end;i++){
            if(target==a[i]){
                return true;
            }
        }
        return false ;
    }
}