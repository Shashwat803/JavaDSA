package Bitwise;

public class XOROperationinanArray {
    public static void main(String[] args) {
        int n = 4;
        int start = 3;
        int temp = 0;
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = start + 2 * i;
        }
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }
        System.out.println(result);
    }
}

