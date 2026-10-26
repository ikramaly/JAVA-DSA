import java.util.Scanner;

public class PalindromeNumCheck {
    public static void main(String[] args) {
        // approach 1 -
        // palindrome means : 121 <=> 121
        Scanner scanner = new Scanner(System.in);
        System.out.print("Check num : ");
        int num = scanner.nextInt();
        int org_num = num;
        int revNum = 0;
        while (num !=0){
            revNum = revNum*10 + num%10;
            num = num /10 ; // 20 , now current
        }
//        System.out.println(num);
        System.out.println(org_num);
        System.out.println(revNum);
        if (revNum == org_num){
            System.out.println("Yes, "+org_num+" is a palindrome num");
            System.out.println(num+" <=> "+org_num);
        }else {
            System.out.println("No, "+org_num+" is not a palindrome num");
        }

    }

    }
