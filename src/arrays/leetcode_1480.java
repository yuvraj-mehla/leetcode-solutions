package arrays;

import java.sql.Array;
import java.util.Arrays;

public class leetcode_1480 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));

    }
    static int[] runningSum(int[] sum){
        int n = sum.length;
        //int[] sum = new int[n];

        for (int i = 1; i < n; i++){
            sum[i] = sum[i] + sum[i-1];
        }
        return sum;

    }
}
