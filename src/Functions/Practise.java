package Functions;

import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int money = 0;
        for (int i = 0; i < arr.length; i++) {
            money += arr[i];
        }
        System.out.println(money);
    }
}
