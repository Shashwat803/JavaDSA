package Arrays;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] account = {
                {1, 2, 3},
                {1, 2, 3}
        };
        int ans = rich(account);
        System.out.println(ans);
    }

    public static int rich(int[][] account) {
        int temp = 0;
        for (int row = 0; row < account.length; row++) {
            int sum = 0;
            for (int j = 0; j < account[row].length; j++) {
                sum += account[row][j];
            }
            if (sum > temp) {
                temp = sum;
            }
        }
        return temp;
    }
}
