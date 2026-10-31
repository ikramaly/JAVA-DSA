public class CountSumOfNum {
    public static void main(String[] args) {
        int num = 12364;
        int sum = 0;
        while (num>0){
//            int rem = num%10;
            int digit = num/10;
//            System.out.println("rem : "+r;
//            sum = sum+digit;
            num = num/10;
            System.out.println(digit);
        }
        System.out.println("Total sum : "+sum);
    }
}
