package Searching;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum2inputArrayIsSorted {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] output = twoSum(nums, target);
        System.out.println(Arrays.toString(output));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]) + 1, i + 1};
            else
                map.put(nums[i], i);
        }

        return new int[2];
    }
}
