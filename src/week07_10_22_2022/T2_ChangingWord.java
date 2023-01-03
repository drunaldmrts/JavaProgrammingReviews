package week07_10_22_2022;

public class T2_ChangingWord {
    public static void main(String[] args) {
/*
input= "I love cats! I have a cat named Coco. My cat's very smart!"
output= "I love dogs! I have a dog named Coco. My dog's very smart!"
 */

    String message= "I love cats! I have a cat named Coco. My cat's very smart!";
    String searched= "cat";
    String changed= "dog";
    String result="";

    String result1= message.replace(searched, changed);
        System.out.println("result1 = " + result1);

    // we need to check the message contains cat or not

    int indexOfFirstCat= message.indexOf(searched);
    int endOfWord=indexOfFirstCat+searched.length();

    message=message.substring(0,indexOfFirstCat)+changed+message.substring(endOfWord);

    while (message.contains(searched)){

        indexOfFirstCat= message.indexOf(searched);
        endOfWord=indexOfFirstCat+searched.length();

        message=message.substring(0,indexOfFirstCat)+changed+message.substring(endOfWord);
    }
        System.out.println("message = " + message);

    /*
    we can skip or delete String by using substring

    String word="AdamMBerry";
    int indexOfM=word.indexOf("M");
    word=word.substring(0,indexOfM)+word.substring(indexOfM+1);
        System.out.println("word = " + word);

     */




    }
}
