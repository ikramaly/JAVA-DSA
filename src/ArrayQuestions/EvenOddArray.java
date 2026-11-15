package ArrayQuestions;

public class EvenOddArray {
    public static void main(String[] args) {
        System.out.println("We want to print even add odd array..");
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        // first of all we will extract even num from array a.
        for (int i=0;i<a.length-1;i++){
            if (a[i]%2==0){
                System.out.println("Even : "+a[i]);
            }
        }
        System.out.println("---------------------------------");
        for (int i=0;i<a.length-1;i++){
            if (a[i]%2!=0){
                System.out.println("Odd : "+a[i]);
            }
        }
        System.out.println("One Day Inshallah i will be success, in my dreams.");

    }
}
