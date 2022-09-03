package Conditionals_Loops;

import java.util.Scanner;

public class AverageOfN_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the N Number");
        int size = input.nextInt();
        int count = 1;
        int num=0;
        float sum = 0;

        System.out.println("Enter "+size+" numbers");
        while (count<=size){
             num = input.nextInt();
             sum = sum + num;
            count++;
        }
        float average = sum / num;

        System.out.println("Average of "+sum+": "+average);
    }
}
