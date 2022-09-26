package Searching;

public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int output = searchIterative(arr, 0);
        System.out.println(output);
    }

    public static int searchIterative(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target)
                return mid;

            // Check ont the left Side
            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target <= nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            // Check ont the Right Side
            else if (nums[mid] <= nums[end]) {
                if (target >= nums[mid] && target <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }

        }
        return -1;
    }
}
