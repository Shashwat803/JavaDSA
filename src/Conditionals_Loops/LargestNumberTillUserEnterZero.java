package Conditionals_Loops;

import java.util.Scanner;

public class LargestNumberTillUserEnterZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter a Number");
            int num = input.nextInt();

            if (num != 0) {
                if (num > max) {
                    max = num;
                }
            } else {
                break;

            }
        }
        System.out.println("Maximum no. is: "+max);
    }
}

