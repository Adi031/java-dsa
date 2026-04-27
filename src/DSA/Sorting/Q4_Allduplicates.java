package DSA.Sorting;

import java.util.ArrayList;
import java.util.List;
public class Q4_Allduplicates {
    public static void main(String[] args) {
        int []arr = {4,3,2,7,8,2,3,1};
        System.out.println(allduplicates(arr));
    }
    static List<Integer> allduplicates(int []nums){
        int i=0;
        while(i<nums.length){
            int corrrect = nums[i]-1;
            if(nums[i]!=nums[corrrect]){
                int temp = nums[i];
                nums[i] = nums[corrrect];
                nums[corrrect] = temp;
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index =0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }
}