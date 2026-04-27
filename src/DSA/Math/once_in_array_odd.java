package DSA.Math;

public class once_in_array_odd {
    public static void main(String[] args) {
        int [] arr = {2,3,4,4,5,4,5,5,2,2};
        int[] bits_arr = new int[32];
        for (int num: arr){
            for(int i=0;i<32;i++){
                bits_arr[i] += (num>>i) &1;
            }
        }
        int ans = 0;
        for(int i=0;i<32;i++){
            if(bits_arr[i]%3!=0){
                ans |= (1<<i);
            }
        }
        System.out.println(ans);
    }
}
