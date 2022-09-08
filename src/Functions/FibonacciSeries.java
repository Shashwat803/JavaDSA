package Functions;

public class FibonacciSeries {
    public static void main(String[] args) {
        int ans = fibo(7);
        System.out.println(ans);
    }

    public static int fibo(int num) {
        int pt = 0;
        int ct = 1;
        int count = 2;
        while (count <= num) {
            int temp = ct;
            ct = ct + pt;
            pt = temp;
            count++;
        }
        return ct;
    }
}
