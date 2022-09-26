package Arrays;

public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int output = evenNum(nums);
        System.out.println(output);
    }

    public static int evenNum(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (String.valueOf(i).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
