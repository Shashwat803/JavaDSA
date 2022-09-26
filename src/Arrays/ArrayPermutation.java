package Arrays;

import java.util.Arrays;

public class ArrayPermutation {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = permutation(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] permutation(int[] nums) {
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
