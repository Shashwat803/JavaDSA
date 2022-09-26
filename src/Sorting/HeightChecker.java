package Sorting;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] height = {1, 1, 4, 2, 1, 3};
        int output = heightChecker(height);
        System.out.println(output);
    }

    public static int heightChecker(int[] h) {
        int count = 0;
        int[] newH = new int[h.length];
        System.arraycopy(h, 0, newH, 0, h.length);
        Arrays.sort(newH);
        for (int i = 0; i < h.length; i++) {
            if (newH[i] != h[i]) {
                count++;
            }
        }
        return count;
    }
}
