import java.util.Scanner;

public class ReverseString1 {
    public static void main(String[] args) {
        String str = "ABCD";
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            revStr = revStr + str.charAt(i);
            System.out.println("revStr = " + c);
        }
        System.out.println("Finally Reversed = " + revStr);

    }

}
