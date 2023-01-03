package week06_10_15_2022;

public class CountSpesificWord {
    public static void main(String[] args) {

        String str= "Java is java in everywhere is Java";

        String word="Java";

        int counter=0;

        for (int i = 0; i <= str.length()-word.length(); i++) {

            String each=str.substring(i,i+4);

            if (each.equalsIgnoreCase(word))
                counter++; // if we have only one statement after if, we don't need to use {}, curly braces

        }

        System.out.println(counter);




    }
}
