import java.nio.channels.AcceptPendingException;
import java.util.Scanner;

public class PalindromeStringCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = scanner.next();
        String revName = "";
        char[] arr = name.toCharArray();
        System.out.println(arr);
        for ( int i = arr.length-1; i>=0; i-- ){
//            System.out.println(arr[i]);
            revName = revName + arr[i];
//            System.out.println("revName : "+revName);
        }
        if (name.equalsIgnoreCase(revName)){
            System.out.println("Yes, "+name+" is Palindrome");
        }else {
            System.out.println("No, "+name+" is not palindrome");
        }

    }
}
