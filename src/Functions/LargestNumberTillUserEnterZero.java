package Functions;

import java.util.Scanner;

public class LargestNumberTillUserEnterZero {
    public static void main(String[] args) {
        int ans = maxNumber();
        System.out.println(ans);
    }

    public static int maxNumber() {
        int max = Integer.MIN_VALUE;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a Number: ");
            int num = in.nextInt();
            if (num > max) {
                max = num;
            }
            if (num == 0) {
                break;
            }
        }
        return max;
    }
}
