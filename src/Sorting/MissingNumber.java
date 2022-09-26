package Sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int output = missingNumber(nums);
        System.out.println(output);
    }

    public static int missingNumber(int[] nums) {
        int sum = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            sum = sum + i;
            sum = sum - nums[i];
        }

        return sum + length;
    }
}
