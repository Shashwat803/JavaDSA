package Conditionals_Loops;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
            int num = input.nextInt() ;
            int sum = 0;
        for (int i = 1; i <num ; i++) {
            if (num % i == 0){
                sum = sum + i;
            }
        }
        if (sum == num){
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not perfect number");
        }
        }
    }

