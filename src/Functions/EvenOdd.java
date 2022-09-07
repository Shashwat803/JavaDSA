package Functions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = in.nextInt();
         oddEven(num);
    }
    public static void oddEven(int num){
        if (num%2==0){
            System.out.println("Given number is even");
        } else if (num%2==1) {
            System.out.println("Given number is odd");
        }
    }
}
