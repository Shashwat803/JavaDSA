package Conditionals_Loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();
        int previousTerm = 0;
        int currentTerm = 1;
        int count = 2;

        while (count<=num){
            int temp = currentTerm;
            currentTerm = currentTerm+previousTerm;
             previousTerm = temp;
            count++;
        }
        System.out.println(currentTerm);
    }
}
