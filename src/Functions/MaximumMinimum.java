package Functions;

public class MaximumMinimum {
    public static void main(String[] args) {
        int maximum = largest(100,40,30);
        System.out.println("Maximum number among three no. is: "+maximum);

        int minimum = smallest(10,30,7);
        System.out.println("Minimum number among three no. is: "+minimum);
    }
    public static int largest(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static int smallest(int a, int b, int c){
        int min = a;

        if(b < min){
            min = b;
        }
        if (c < min){
            min = c;
        }
        return min;
    }
}
