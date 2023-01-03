package week08_10_29_2022;

public class FourthTask {
    public static void main(String[] args) {

        /*
 Task 4 :  For Each - Nested For
    		Longest Palindrome
       		 Given a String array. Find the longest Palindrome String in your array.
			        Ex:
			        Input: ["java", "longer word", "civic" "apple", "racecar", "mom", "anna"] Output: racecar
			        Ex:
			        Input: ["abc", "dna", "kevin", "joe", "lamp"]
			        Output: No palindrome
 */
        String[] words={"java", "longer word", "civic","apple", "racecar", "mom", "anna"};

        String longest="";


        // we need to get word one by one
        for (String word : words) {

            //is palindrome or not
            boolean isPalindrome= true;

            for (int i = 0; i < word.length()/2; i++) {
                char ch1=word.charAt(i);
                char ch2=word.charAt(word.length()-i-1);

                if(ch1!=ch2){
                    isPalindrome=false;
                    break;
                }
                if(isPalindrome&&word.length()>longest.length()){
                    longest=word;
                    System.out.println(longest);
                }

            }


        }






    }
}
