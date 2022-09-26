package Searching;

import java.util.Arrays;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 7, 11};
        int k = 5;
        int output = findKthPositive(nums, k);
        System.out.println(output);
    }

    public static int findKthPositive(int[] arr, int k) {
        int[] insertarr = new int[3001];
        for (int i = 0; i < arr.length; i++) {
            insertarr[arr[i]]++;
        }

        int count = 0;
        // System.out.println(Arrays.toString(insertarr));
        for (int i = 1; i < insertarr.length; i++) {
            if (insertarr[i] == 0) {
                count++;
                if (count == k) {
                    return i;
                }
            }
        }
        return -1;
    }
}
