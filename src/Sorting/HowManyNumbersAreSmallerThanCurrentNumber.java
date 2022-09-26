package Sorting;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] output = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(output));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smaller = new int[101];
        for (int i = 0; i < nums.length; i++) {
            smaller[nums[i]]++;
        }
        for (int i = 1; i < 101; i++) {
            smaller[i] += smaller[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            int position = nums[i];
            if (position == 0) nums[i] = 0;
            else {
                nums[i] = smaller[position - 1];
            }
        }
        return nums;
    }
}
