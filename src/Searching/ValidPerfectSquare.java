package Searching;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        boolean ans = isPerfectSquare(num);
        System.out.println(ans);
    }

    public static boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        int low = 1;
        int high = num / 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((long) mid * mid == num) {
                return true;
            } else if ((long) mid * mid > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}
