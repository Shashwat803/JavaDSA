package Conditionals_Loops;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        int num = 234, sum = 0, product = 1,ans = 0;

        while (num>0){
            int rem = num % 10;
                product = product * rem;
               sum = sum + rem;
             num = num/10;
        }
        ans = product-sum;

        System.out.println(ans);

    }
}
