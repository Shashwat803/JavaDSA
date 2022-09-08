package Functions;

import java.util.Scanner;

public class SumOfNegativePositivePositiveOddNUmber {
    public static void main(String[] args) {
        sumOfnegPosPosODD();
    }

    public static void sumOfnegPosPosODD() {
        Scanner in = new Scanner(System.in);
        int negative = 0, positiveEven = 0, positiveOdd = 0;
        while (true) {
            System.out.println("Enter a number");
            int num = in.nextInt();
            if (num < 0) {
                negative = negative + num;
            }
            if (num > 0 && num % 2 == 0) {
                positiveEven = positiveEven + num;
            }
            if (num % 2 == 1) {
                positiveOdd = positiveOdd + num;
            } else if (num == 0) {
                break;
            }
        }
        System.out.println(negative);
        System.out.println(positiveEven);
        System.out.println(positiveOdd);
    }
}
