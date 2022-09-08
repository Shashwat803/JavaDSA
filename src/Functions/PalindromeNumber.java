package Functions;

public class PalindromeNumber {
    public static void main(String[] args) {
        isPalindrome(1441);
    }

    public static void isPalindrome(int num) {
        int temp = num;
        int rev = 0;
        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        if (rev == num) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }
    }
}
