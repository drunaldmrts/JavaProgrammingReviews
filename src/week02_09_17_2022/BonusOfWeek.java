package week02_09_17_2022;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BonusOfWeek {
    public static void main(String[] args) {

        /*
        we will get the current time
            hour:minutes:seconds
        Output: 3:55:23
         */
        LocalDateTime today= LocalDateTime.now();
        System.out.println("today = " + today);

        int hour= today.getHour();
        System.out.println("hour = " + hour);

        int minute= today.getMinute();
        System.out.println("minute = " + minute);

        int second= today.getSecond();
        System.out.println("second = " + second);

        System.out.println(hour + ":" +minute+":"+second);

    }




}
