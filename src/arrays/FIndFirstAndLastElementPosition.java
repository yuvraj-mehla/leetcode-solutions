package arrays;

import java.util.Arrays;

public class FIndFirstAndLastElementPosition {
    static int[] searchRange(int[] nums, int target){
        int[] result = new int[2];
        result[0] = findFirst(nums , target);
        result[1] = findLast(nums , target);
        return result ;

    }
    static int findFirst(int[] nums ,int  target){
        int start = 0 ;
        int end = nums.length-1;
        int first = -1;

        while (start <= end ){
            int mid = start + (end - start) / 2;

            if (nums[mid] == target ){
                first = mid ;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return first;
    }
    static int findLast(int[] nums , int target ){
        int start =0;
        int end = nums.length-1;
        int last =-1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (nums[mid] == target ){
                last = mid ;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1 ;
            }
            else {
                end = mid - 1;
            }
        }
        return last;

    }
    public static void main(String[] args) {
        int[] nums ={5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums , target)));

    }
}
