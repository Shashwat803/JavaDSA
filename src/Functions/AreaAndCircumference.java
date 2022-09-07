package Functions;

public class AreaAndCircumference {
    public static void main(String[] args) {
        areaAndCircumference(2);
    }
    public static void areaAndCircumference(int r){
        double area = 3.14*r*r;
        double circumference = 2*3.14*r;
        System.out.println("The area of circle is: "+area);
        System.out.println("The Circumference of circle is: "+circumference);
    }
}
