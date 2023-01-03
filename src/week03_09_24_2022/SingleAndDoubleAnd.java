package week03_09_24_2022;

public class SingleAndDoubleAnd {

    public static void main(String[] args) {

        boolean result= false;
        int a=10;
          // false it will look at the statement and increment the value
        if(result & a++<12){ //compiler will look at the second part after &
            // compiler will not look at the second part after &&
        }
        System.out.println(a);

        int b=10;
        // false it will NOT look at the statement and NOT increment the value
        if(result && b++<12){
        }

        System.out.println(b);

        // if the first part is TRUE there is no different & - &&

        double n1=10;
        double n2=20;
        char multiOperator= '*';

        if(multiOperator=='+'){
            System.out.println(n1+n2);
        } else if (multiOperator=='-') {
            System.out.println(n1-n2);
        }else{
            System.out.println(n1*n2);}

    }
}
