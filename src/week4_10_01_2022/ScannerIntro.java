package week4_10_01_2022;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
/*
( Scanner Class can be used )



                            Create a program that accepts age and weight(kg) as int.

                            If age greater than or equal 18 and weight greater than 50 kg give a message
                                EXPECTED  :  "You are eligible to donate blood"

                            If age greater than or equal 18 and weight smaller or equal than 50 kg give a message
                                EXPECTED  :  "You are not eligible to donate blood"

                            If age is smaller than 18 "Age must be greater than 18"
                                EXPECTED  :  "Age must be greater than 18"

 */
        Scanner input= new Scanner(System.in);

        System.out.println("Please enter your age ");
        int age= input.nextInt();


        String result="";

        if(age>=18) { // age is grater than or equal to 18

            System.out.println("Please enter your weight");
            int weight= input.nextInt();

            if (weight > 50) {
                result = "You are eligible to donate blood";
            } else {
                result = "You are not eligible to donate blood";

            }

        }else{ // age is smaller tah 18
            result= "Age must be greater than 18";
        }

        System.out.println(result);

        input.close();


    }
}
