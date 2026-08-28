package arrays;

public class RemoveDuplicateFromSortedArray {
    static int removeDuplicates(int[] nums){

        if(nums.length == 0) return 0;

        int result = 0;

        // increase result on each unique entry

        for (int i=1 ; i< nums.length ; i++){
            if (nums[i] != nums[result]) {
                result++;
                nums[result] = nums[i];
            }
        }
        return result+1;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,5,5,6,6,54};
        System.out.println(removeDuplicates(nums));

    }
}
