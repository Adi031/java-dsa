package DSA.Recursion.arrays;

public class Sorted {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6,7,9};
        System.out.println(isSorted(arr,0));
    }
    static boolean isSorted(int [] arr,int i){
        if(i== arr.length-1){
            return true;
        }
//        if(arr[i]<arr[i+1]){
//            return isSorted(arr,i+1);
//        }
//        return false;
        return arr[i]<arr[i+1] && isSorted(arr,i+1);
    }
}
