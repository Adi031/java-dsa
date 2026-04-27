package DSA.Sorting;

import java.util.*;
//
public class Q2_Allmissing {
    public static void main(String[] args) {
        int []arr = {4,3,2,7,8,2,3,1};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static List<Integer> missingarray(int[]nums){
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }
    static void cyclicsort(int []a){
        int i=0;
        while(i<a.length){
            int correct = a[i]-1;
            if(a[i]!=a[correct]){
                int temp = a[i];
                a[i] = a[correct];
                a[correct] = temp;
            }
            else{
                i++;
            }
        }
    }
}