package Sorting;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        int output = thirdMax(nums);
        System.out.println(output);
    }

    public static int thirdMax(int[] nums) {
        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;
        for (Integer num : nums) {
            if (num.equals(max) || num.equals(secondMax) || num.equals(thirdMax)) {
                continue;
            }
            if (max == null || num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }
        if (thirdMax == null)
            return max;
        return thirdMax;
    }
}
