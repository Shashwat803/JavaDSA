package Arrays;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] nums = {1, 42, 53, 6, 3, 5};
        swap(nums, 3, 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}