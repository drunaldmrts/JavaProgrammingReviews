package week03_09_24_2022;

public class IntroPreIncrementDecrement {

    public static void main(String[] args) {
/*
int a=5;
          print a;
          print the ++a;
          print the --a;
 */


        int a= 5;
        System.out.println(a);
        System.out.println("a = " + a);
        System.out.println(++a); // first we will change the value IMMEDIATELY then print it.
        System.out.println(a++); // line 18 a will be 6
        // but line 19 a will be 7


        int x=10;

        int number= x++ + 100; // number=110
        System.out.println("number = " + number);// x=11
        //x=11, at the backend or memory we have that value
        int number2=++x +100; //12+100= 112
        System.out.println("number2 = " + number2);

    }
}

