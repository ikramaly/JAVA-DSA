import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n1 = 0;
        int n2 = 1;

        for (int i=1; i<10; i++){
//            int n1 = 0;
//            int n2 = 1;
            int sum = n1+n2;
            System.out.println(n1+" "+n2+" = "+sum);
            n1 = n2; // 1
            n2 = sum; // 1

        }

    }
}
