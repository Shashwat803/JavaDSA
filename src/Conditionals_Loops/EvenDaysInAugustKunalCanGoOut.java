package Conditionals_Loops;



public class EvenDaysInAugustKunalCanGoOut {
    public static void main(String[] args) {
        int august = 31;
        int count=0;
        for (int i = 1; i <august ; i++) {
            if (i%2==0){
                count++;
            }
        }
        System.out.println("Number of Days Kunal can go out in the month of august is "+count+" days");
    }
}
