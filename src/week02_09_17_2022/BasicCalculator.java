package week02_09_17_2022;

public class BasicCalculator {

    public static void main(String[] args) {
        int firstNumber = 20;
        int secondNumber = 5;

        int sum= firstNumber + secondNumber;
        int multiply= firstNumber * secondNumber;
        int substract= firstNumber - secondNumber;
        int divide= firstNumber / secondNumber;
        int reminder= firstNumber % secondNumber;

        System.out.println("sum = " + sum);
        System.out.println("substract = " + substract);
        System.out.println("multiply = " + multiply);
        System.out.println("divide = " + divide);
        System.out.println("reminder = " + reminder); // reminder shows that iki sayı birbirine kalansız bölünüyor.



    }
}
/*
Create a class named BasicCalculator. write a Java program to print the sum (addition),
multiply, subtract, divide and remainder of two numbers.
 */