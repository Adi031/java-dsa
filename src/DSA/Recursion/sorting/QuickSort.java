package DSA.Recursion.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,2,5,7,4,9,1,8};
//        quickSort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void quickSort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        int mid  = s+(e-s)/2;
        int pivot = arr[mid];

        while(s<=e){

            // also a reason if its already sorted it will not sort
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index, sort two halves
        quickSort(arr,low,e);
        quickSort(arr,s,high);


    }
}
