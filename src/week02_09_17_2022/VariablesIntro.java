package week02_09_17_2022;

public class VariablesIntro {

    public static void main(String[] args) {
        /*
        Variable types
        1- Primitive
            Numerical primitives:
            double>float>long>int>short>byte
            boolean
            char define char 'A'

        2- Non-primitive
            String define String "Adam"


       Variable Naming Rules:
       1. MUST be unique (inside the same block-method)
       2. letter camelCase
       3. We CAN NOT start with numbers
       4. We CAN NOT java reserved words
       5. For special character we will use underscore "_" and dollar sign "$"
       6. Make it readable and understandable
         */

       // we need to use byte but it depends on you
      int age = 42;
      // byte myByte=129; we only use byte from -128 to 127
        long myLong = 1234566789034455L; // if you want to make integer to long we need to put L or l)

      double myDouble=25.5;
      double myDouble1=25; // what is my output

        float myFloat=25.5F; // we use F or f for at the end of the number
         /*
         Implicit casting and explicit casting is about data type
         */

        // implicit casting is assigning small data type to bigger one
        long L= 20;
        double d= L; // implicit casting done by compiler


        // explicit casting is assigning bigger data type to smaller one
        long l=20;
        int i=(int)l; // we have to say to compiler make l is int

        // addition
        /*
        int+int=int
        double+int=double
        int+short=int
         */

        //Concetination
        /*
        String+ anything= String
        123+Adam=123Adam
         */

        /*

        12+23+"Adam"=?
        35+Adam
        35Adam
         */
        int a=12;
        int b=23;
        String c="Adam";
        String e= "12" + "23" + "Adam";
        System.out.println("e = " + e);



    }




}
