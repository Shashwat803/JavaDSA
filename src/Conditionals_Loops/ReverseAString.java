package Conditionals_Loops;

public class ReverseAString {
    public static void main(String[] args) {
        String name = "Shashwat";
        String name2 = "";
        char ch;
        for (int i = 0; i <name.length() ; i++) {
            ch = name.charAt(i);
            name2 = ch+name2;
        }
        System.out.println(name2);
    }
}
