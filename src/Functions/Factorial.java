package Functions;

public class Factorial {
    public static void main(String[] args) {
        int ans = factorial(5);
        System.out.println(ans);
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
