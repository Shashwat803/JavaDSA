package Functions;

public class SumOfFirstnNaturalNumber {
    public static void main(String[] args) {
        int ans = sum(10);
        System.out.println(ans);
    }

    public static int sum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
