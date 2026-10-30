public class LargestNumOutOfThree {
    public static void main(String[] args) {
        int a = 10;
        int b =20;
        int c = 30;
        System.out.println("--------------------------");
        int largest = a>b?a:b;
        int largest1 = c>largest? c:largest;
        System.out.println(largest);
        System.out.println(largest1);

    }
}
