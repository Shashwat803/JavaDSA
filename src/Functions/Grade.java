package Functions;

public class Grade {
    public static void main(String[] args) {
        Result(67);
    }
    public static void Result(int num){
        if(num>91 && num<100){
            System.out.println("Grade - AA");
        }
        if (num>81 && num<90){
            System.out.println("Grade - AB");
        }
        if (num>71 && num<80){
            System.out.println("Grade - BB");
        }
        if (num>61 && num<70){
            System.out.println("Grade - BC");
        }
        if (num>51 && num<60){
            System.out.println("Grade - CD");
        }
        if (num>41 && num<50){
            System.out.println("Grade - DD");
        }
        if (num<=40){
            System.out.println("Fail");
        }
    }
}
