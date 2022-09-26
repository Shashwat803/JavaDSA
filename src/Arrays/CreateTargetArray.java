package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] output = targetArray(nums, index);
        System.out.println(Arrays.toString(output));
    }

    public static int[] targetArray(int[] nums1, int[] index) {
        int[] target = new int[nums1.length];
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            temp.add(index[i], nums1[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            target[i] = temp.get(i);
        }
        return target;
    }
}
