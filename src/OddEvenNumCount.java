public class OddEvenNumCount {
    public static void main(String[] args) {
        int num = 2321942;
        int digitCout = 0;
        int oddCount = 0;
        int evenCount = 0;
        while (num>0){
            int rem = num%10;
//            System.out.println("rem : "+rem);
            if (rem%2==0){
                evenCount++;
            }else {
                oddCount++;
            }
            num = num/10;
        }
        System.out.println("Even : "+evenCount);
        System.out.println("Odd : "+oddCount);
    }
}
