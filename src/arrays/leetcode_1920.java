package arrays;

import java.util.Arrays;

public class leetcode_1920 {
    public static void main(String[] args) {
        //Build array from permutation
        int[] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));

    }
    static int[] buildArray(int[] nums){
        //int n = nums.length;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++ ){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
