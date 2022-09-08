package Functions;

public class PerfectNumber {
    public static void main(String[] args) {
        perfectNum(7);
    }

    public static void perfectNum(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }

    }
}
