import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ABCD";
        String revStr = "";
        for (int i=str.length()-1; i>=0; i--){
            char c = str.charAt(i);
            revStr = revStr + str.charAt(i);
            System.out.println("revStr = "+ c);
        }
        System.out.println("Finally Reversed = "+revStr);

        // approach 2 -
        String name = "Ikram";
        char[] arr = name.toCharArray();
        String revName = "";
        for (int i=name.length()-1; i>=0; i-- ){
            revName = revName + arr[i];
        }
        System.out.println("Reversed str : "+revName);

        // approach 3 - by using buffer class;

        String animals = "Dog";
        StringBuffer stringBuffer = new StringBuffer(animals);
        System.out.println(stringBuffer.length());
        StringBuffer revAnimals =  stringBuffer.reverse();
        System.out.println(revAnimals);
    }

}
