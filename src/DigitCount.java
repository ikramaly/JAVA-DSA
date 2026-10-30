public class DigitCount {
    public static void main(String[] args) {
        int num = 2324242;
        int digitCout = 0;
        while (num!=0){
            num = num/10;
            digitCout ++;
        }
        System.out.println(digitCout);
        System.out.println(num);
    }
}
