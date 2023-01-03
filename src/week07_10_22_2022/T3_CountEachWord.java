package week07_10_22_2022;

public class T3_CountEachWord {
    public static void main(String[] args) {

        /*
        input:
        String names= "Adam Adam Berry Aysun Aysun"
        output:
        Adam-2 Berry-1 Aysun-2
         */

        String names= "Adam Adam Berry Aysun Aysun";

        String result="";

        String temp="";

        for (int i = 0; i < names.length(); i++) {

            char ch=names.charAt(i);
            if(ch!=' '){
                temp+=ch;
                continue; //we need to find word in order to continue to next statement
            }
            String search=temp;

            int counter=0;

            String dumy=names;

            while (dumy.contains(search)) {
                counter++;
                dumy = dumy.replaceFirst(search, "");
            }
            if(!result.contains(search))
            result+= search+"-"+counter+" ";

            temp="";

            System.out.println("result = " + result);
        }
    }
}
