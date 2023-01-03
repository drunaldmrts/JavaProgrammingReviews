package week02_09_17_2022;

public class ConvertMinutesToYearandDay {

    public static void main(String[] args) {

        /*

     Input the number of minutes: 3456789
     Expected Output :
     3456789 minutes is approximately 6 years and 210 days
         */

        int givenMinutes=3456789;
        int howManyMinutesInYear= (24*60*365);
        int year= givenMinutes/howManyMinutesInYear;
        System.out.println("year = " + year);

        int remainderMinutes=givenMinutes % howManyMinutesInYear;
        System.out.println("remainderMinutes = " + remainderMinutes);

        int days= remainderMinutes/ (24*60);
        System.out.println("days = " + days);

        System.out.println(givenMinutes+ " minutes is approximately "+year+ " years and " +days+ " days");




    }
}
