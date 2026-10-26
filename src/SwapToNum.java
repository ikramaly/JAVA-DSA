// Approach 1 ;
public class SwapToNum {
    public static void main(String[] args) {
        int a =10;
        int b=20;
        System.out.println("a = "+a+" b = "+b);

        a = a+b-(b=a);

        System.out.println("a = "+a+ " b = "+b);
    }
}
