package week03_09_24_2022;

public class NumberPositiveOrNegative {

    public static void main(String[] args) {
    /*
    Create a class which is "NumberPositiveOrNegative" and create a variable if
    the variable is positive print "positive" if not "negative"
     */
        // create a variable
        int a=10;
        // compare variable with zero
        boolean aIsPositive= a > 0;
        // if condition is true print to Positive

        if(a>0){
        //if(aIsPositive){
            System.out.println("Positive");
        }else{
        // ELSE print Negative
            System.out.println("Negative");}
/*
if the condition is true
print 45
print 50
 */

        if(true){
            System.out.println("45");
            System.out.println("50"); // we have to use {}
        }

        /*
        if the condition is true
        print 80
         */
        boolean result=true;
        if(true)
            System.out.println("80"); // we do not need to use {}, affect ONLY one statement



    }
}
