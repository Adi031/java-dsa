package DSA.Sorting;

//https://leetcode.com/problems/missing-number/description/
public class Q1_MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,4,2,1};
        int missing = searchforMissing(arr);
        System.out.println("Missing number is " + missing);
    }
    static int searchforMissing(int[]a){
        cyclesort(a);
        for(int i=0;i<a.length;i++){
            if(i!=a[i]){
                return i;
            }
        }
        return a.length;
    }
    static void cyclesort(int[] a){
        int i=0;
        while(i<a.length){
            int correct = a[i];
            if(a[i]<a.length && a[i]!=a[correct]){
                swap(a,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[]a,int first, int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}