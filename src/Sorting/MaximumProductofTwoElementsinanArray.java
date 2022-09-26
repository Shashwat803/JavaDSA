package Sorting;

import java.util.Arrays;

public class MaximumProductofTwoElementsinanArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};
        int output = maxProduct(nums);
        System.out.println(output);
    }

    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return (nums[len - 2] - 1) * (nums[len - 1] - 1);
    }
}
