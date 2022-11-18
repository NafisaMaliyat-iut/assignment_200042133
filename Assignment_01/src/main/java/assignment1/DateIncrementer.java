package assignment1;

import java.util.*;

public class DateIncrementer {
    public static String incrementDate(int day, int month, int year) {
        if(isEndOfYear(day, month, year)){
            day = 1;
            month = 1;
            year++;
        } else if(isEndOfMonth(day, month, year)){
            day = 1;
            month++;
        }else {
            day++;
        }

        String incrementedDate = String.format("%02d", day) + "-" + String.format("%02d", month) + "-"
                                        + String.format("%04d", year);
        return incrementedDate;
    }



    //helper functions
    private static boolean isLeapYear(int year){
        if(year%4 == 0)
            return true;
        else
            return false;
    }

    private static boolean is31DayMonth(int month){
        if(month == 1 || month == 3 || month == 5||
                month == 7|| month == 8 || month == 10 || month == 12){
            return true;
        }
        else
            return false;
    }

    private static boolean isEndOfMonth(int day, int month, int year){
        if(isLeapYear(year) && month == 2 && day == 29)
            return true;
        else if(!isLeapYear(year) && month ==2 && day == 28)
            return true;
        else if(is31DayMonth(month) && day == 31)
            return true;
        else if(day == 30)
            return true;
        else
            return false;
    }

    private static boolean isEndOfYear(int day, int month, int year){
        if(isEndOfMonth(day, month, year) && month == 12){
            return true;
        }
        else
            return false;
    }
}
