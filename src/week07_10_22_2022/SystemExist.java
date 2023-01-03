package week07_10_22_2022;

public class SystemExist {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if(i==3){
                break;  // after break loop is existed but not terminated

              //  System.exit(0);  if we use exist the system is terminated

            }
            System.out.println(i);
        }
        System.out.println("after break");

        System.out.println("-------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j==3)
                    break; // this is for only inner loop
                System.out.println(i+"_"+j);

            }

        }



    }
}
