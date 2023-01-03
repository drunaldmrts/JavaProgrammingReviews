package week03_09_24_2022;

public class IntroPostIncrementDecrement {

    public static void main(String[] args) {

        int a=5;

        System.out.println(a);
        System.out.println("a = " + a);// variable name and value at the same time
        System.out.println(a++); // first I print my value and then second step will add 1
        System.out.println(a); // a will be six

        System.out.println(a--); //six, first print the value, then
        System.out.println(a); // five,

        int b=10;
        System.out.println(b--);// first do action (print) we will print 10, then second action
        System.out.println(b--); // ı will print 9 and decrement
        System.out.println(b);

        b=b-1; // b-- // b-=1


    }
}
/*
int a=5;
          print a;
          print the a++;
          print the a--;
 */