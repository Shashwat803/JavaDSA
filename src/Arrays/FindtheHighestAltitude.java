package Arrays;

public class FindtheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        int output = highestAltitude(gain);
        System.out.println(output);
    }

    public static int highestAltitude(int[] gain) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < gain.length; i++) {
            current += gain[i];
            max = Math.max(current, max);
        }
        return max;
    }
}
