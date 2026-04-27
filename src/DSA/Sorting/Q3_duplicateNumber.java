package DSA.Sorting;
public class Q3_duplicateNumber {
    public static void main(String[] args) {
        int []arr = {1,5,4,6,3,2,2};
        System.out.println(duplicate(arr));
    }
    static int duplicate(int[]nums){
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]) {
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        return nums[nums.length-1];
    }
//    Doesn't sort the entire list just returns the value whenever duplicate found
    static int duplicate2(int[]nums){
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=i+1) {
                if (nums[i] != nums[correct]) {
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
}