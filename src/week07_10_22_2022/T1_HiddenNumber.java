package week07_10_22_2022;

import java.util.Random;
import java.util.Scanner;

public class T1_HiddenNumber {
    public static void main(String[] args) {

        Random random= new Random();
                        // create a number from 0 (inclusive) to 10 (exclusive)
        int hiddenNumber= random.nextInt(10)+1;  // we have one number that variable from 1 to 10

        Scanner scan= new Scanner(System.in);
        boolean flag=true;
        //int hiddenNumber=6;
        do {
            System.out.println("Enter a number");
            int searchedNumber=scan.nextInt();
            if(searchedNumber==hiddenNumber) {
                System.out.println("you find the number Congrats");
                flag = false;
            }else {
                System.out.println("try again");
            }

        }while (flag);






    }
}
