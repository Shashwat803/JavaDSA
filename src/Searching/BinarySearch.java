package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int output = search(nums, target);
        System.out.println(output);
    }

    public static int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int res = binary(nums, i, j, target);
        return res;
    }

    public static int binary(int[] nums, int i, int j, int target) {
        int mid = (i + j) / 2;
        if (i <= j) {
            if (nums[mid] == target) {
                return mid;
            }
        } else {
            return -1;
        }
        if (nums[mid] < target) {
            return binary(nums, mid + 1, j, target);
        } else {
            return binary(nums, i, mid - 1, target);
        }
    }
}
