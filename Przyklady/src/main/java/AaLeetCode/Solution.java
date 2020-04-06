package AaLeetCode;

import java.util.Arrays;

class Solution {

    static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int result = nums[0];
        int singleIndicator = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[0] != nums[1]) {
                result = nums[0];
            } else if (nums[nums.length - 1] != nums[nums.length - 2]) {
                result = nums[nums.length - 1];
            } else if (nums[i] - nums[i + 1] != 0) {
                singleIndicator++;
            } else {
                singleIndicator = 0;
            }
            if (singleIndicator == 2) {
                result = nums[i];
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[]nums = new int[]{1};
        System.out.println(singleNumber(nums));
    }
}
