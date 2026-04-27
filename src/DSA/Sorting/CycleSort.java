package DSA.Sorting;

import java.util.Arrays;
public class CycleSort {
    public static void main(String[] args) {
        int []arr = {1,4,3,6,2,5};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclesort(int[]a){
        int i=0;
        while(i<a.length){
            int correct = a[i]-1;
            if(a[i]!=a[correct]){
                swap(a,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[]a,int first,int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}
