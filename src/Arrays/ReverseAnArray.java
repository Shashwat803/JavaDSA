package Arrays;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5, 8, 2};
        revese(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void revese(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }

    }

    public static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;

    }
}

