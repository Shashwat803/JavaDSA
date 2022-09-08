package Functions;

import java.util.Arrays;
import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (true) {
            int num = in.nextInt();
            if (num > max) {
                max = num;
            } else if (num == 0) {
                break;
            }

        }
        System.out.println(max);
    }
}









