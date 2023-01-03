package week02_09_17_2022;

public class SumTwoNumber {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        int sum = num1 + num2;

        // print the result

        System.out.println(sum);
        System.out.println("sum = " + sum);

        //num1 + num2 = sum

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " + " + num2 + " = " + num1 + num2);

        //System.out.println(num1 + " + " + num2+ " = "+ num1  +   num2)
        //                  int+    String+ int+   String+ int+    int
        //                      String+     int+   String +int+    int
        //                              String     String +int+    int

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        int i = 30;
        String s = "30";

        System.out.println(s + i);
        // String+ int concetenation
        String s1 = s + i;


    }
}
