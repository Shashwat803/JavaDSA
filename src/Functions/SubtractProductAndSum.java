package Functions;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        int ans = subPro(234);
        System.out.println(ans);
    }

    public static int subPro(int num) {
        int temp = num;
        int product = 1;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            product = product * rem;
            sum = sum + rem;
            temp = temp / 10;
        }
        return product - sum;
    }
}
