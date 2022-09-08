package Functions;

public class ArmStrongNumber {
    public static void main(String[] args) {
        boolean ans = isArmStrong(153);
        System.out.println(ans);
    }

    public static boolean isArmStrong(int num) {
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + rem * rem * rem;
            temp = temp / 10;
        }
        return sum == num;
    }
}
