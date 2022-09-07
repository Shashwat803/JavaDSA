package Functions;

public class EligibleToVote {
    public static void main(String[] args) {
        isEligible(19);
    }
    public static void isEligible(int num ){
        if (num>=18){
            System.out.println("Person is eligible to vote");
        } else {
            System.out.println("Person is not eligible to vote");
        }
    }
}
