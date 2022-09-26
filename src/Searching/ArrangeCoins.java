package Searching;

public class ArrangeCoins {
    public static void main(String[] args) {
        int n = 5;
        int output = arrangeCoins(5);
        System.out.println(output);
    }

    public static int arrangeCoins(int n) {
        int index = 1;
        while (index <= n) {
            n = n - index;
            index++;
        }
        return index - 1;
    }
}
