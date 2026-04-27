package DSA.LinearSearch;
public class MaxWealth {
    public static void main(String[] args) {
        int [][] accounts = {
                {1,2,3},
                {4,9,},
                {3,4,2,2}
        };
        System.out.println(maxWealth(accounts));
    }
    static int maxWealth(int[][] a){
        int maxWealth = Integer.MIN_VALUE;
        for(int []r: a){
            int sum = 0;
            for(int c: r ){
                sum += c;
            }
            if (maxWealth < sum){
                maxWealth = sum;
            }
        }
        return maxWealth;
    }

}