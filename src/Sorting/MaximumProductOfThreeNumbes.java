package Sorting;

import java.util.Arrays;

public class MaximumProductOfThreeNumbes {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int output = maximumProduct(nums);
        System.out.println(output);
    }

    public static int maximumProduct(int[] nums) {
        if (nums.length == 3) return nums[0] * nums[1] * nums[2];
        Arrays.sort(nums);
        int l = nums.length;
        return Math.max(nums[0] * nums[1] * nums[l - 1], nums[l - 1] * nums[l - 2] * nums[l - 3]);

    }
}
