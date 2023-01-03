package week09_11_05_2022;

public class MethodsIntro {

    public static void main(String[] args) {

        // we want to add two numbers
        int result=sum(5,6);

        System.out.println(sum(35, 45));
        // multiply the result with 2 and show in console

        multiplywith2AndPrint(result);



    }

    private static void multiplywith2AndPrint(int result) {
        System.out.println(result*2);
    }

    public static int sum(int number1, int number2) {
        return number2+number1;
    }


}
