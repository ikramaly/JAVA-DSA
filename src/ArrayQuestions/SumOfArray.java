package ArrayQuestions;

public class SumOfArray {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int sum = 0;
        int sum1 = 0;
        System.out.println(a.length);
        //for calculate the sum of the array
        for (int i=0; i<=a.length-1; i++){
            System.out.println("a + ["+i+"] = "+a[i]);
            sum = sum + a[i];
        }
        System.out.println("sum = "+sum);
        for (int val : a){
            sum1 = sum1+val;
        }
        System.out.println("sum1 = "+sum1);

    }
}
