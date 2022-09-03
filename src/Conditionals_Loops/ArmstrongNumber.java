package Conditionals_Loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int temp = num;
        int sum = 0;
        while(temp>0){
            int rem = temp%10;
            sum = sum+rem*rem*rem;
            temp = temp/10;
        }
        if (sum==num){
            System.out.println("Number is Armstrong Number");
        }
        else{
            System.out.println("Number is not Armstrong Number");
        }
    }
}
