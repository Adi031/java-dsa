package DSA.Sorting;
public class Q6_FirstMissingPositive {
    public static void main(String[] args) {
        int[]arr = {0,1,2};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[]nums){
        int i=0;
        while(i<nums.length){
                int correct = nums[i] - 1;
                if (nums[i]>0 && nums[i]<nums.length && nums[i] != nums[correct]) {
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                } else {
                    i++;
                }
        }
//        search for first missing positive.
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
//        case 2: if all elements upto N are present.
        return nums.length+1;
    }
}