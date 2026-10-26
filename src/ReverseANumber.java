import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String : ");
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
//        sb.append(num);
        StringBuilder rev = sb.reverse();
        System.out.println("Rev str : "+sb);

    }
}
