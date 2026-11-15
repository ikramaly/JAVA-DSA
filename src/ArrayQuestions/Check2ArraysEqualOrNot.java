package ArrayQuestions;

public class Check2ArraysEqualOrNot {
    public static void main(String[] args) {
        System.out.println("Check Two Arrays Are Equal Or Not.");
        int[] a ={1,2,3,4,5,6,7,8,9};
        int[] b ={1,2,3,4,5,6,7,8};

        boolean status = false;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i]==b[i]){
                status = true;
            }else {
//                System.out.println("Both arrays are not equals.");
                status = false;
                break;
            }
        }
        if (status == false){
            System.out.println("Arrays are not equals");
        }else{
            System.out.println("Arrays are equals.");
        }
    }
}
