package Conditionals_Loops;

import java.util.Scanner;

public class SumOfNegativePositivePositiveOddNUmber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negativeNumber = 0, positiveNumber = 0, positiveOddNumber = 0;

        while (true){
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if (num<0){
                negativeNumber += num;
            }
            if (num>0){
                positiveNumber += num;
            }
            if (num % 2 == 1){
                positiveOddNumber += num;
            }
            else if (num==0){
                break;
            }
        }
        System.out.println("Sum of Negative Number is "+negativeNumber);
        System.out.println("Sum of Positive Number is "+positiveNumber);
        System.out.println("Sum of Positive Odd Number is "+positiveOddNumber);
    }
}
