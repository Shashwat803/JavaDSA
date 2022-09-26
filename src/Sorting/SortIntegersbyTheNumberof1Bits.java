package Sorting;

import java.util.Arrays;

public class SortIntegersbyTheNumberof1Bits {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] output = sortByBits(nums);
        System.out.println(Arrays.toString(output));
    }

    public static int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 10001;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10001;
        }
        return arr;
    }

}
