package Conditionals_Loops;

import java.util.Scanner;

public class SumOfNumbersTillUserEnterZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int sum = 0;
        while (true){
            System.out.println("Enter a Number");
            int num = input.nextInt();
            if (num!=0){
                sum = sum+num;
            }
            else {
                break;
            }

        }
        System.out.println("Sum of numbers is: "+sum);
    }
}
