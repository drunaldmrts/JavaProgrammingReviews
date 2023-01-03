package week06_10_15_2022;

public class WhileDoWhileIntro {
    public static void main(String[] args) {

        boolean flag=true;

        int i=0;

        while (flag){ //if flag is false exit the loop
            System.out.println(i++);

            if(i==100){ //exit condition
                flag=false;
            }
        }

        do {
            //statement
        }while (flag);

    }
}
