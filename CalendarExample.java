package com.jsp.inbuiltclassMethods;

import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
    public static void main(String[] args) {
        // getInstance(): Get current date/time
        Calendar cal = Calendar.getInstance();
        System.out.println("Current Date: " + cal.getTime());

        // get(): Get specific field values
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH); // 0-based (0 = January)
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Year: " + year + ", Month: " + (month + 1) + ", Day: " + day);

        // set(): Set a specific field
        cal.set(Calendar.YEAR, 2025);
        cal.set(Calendar.MONTH, Calendar.DECEMBER); // December = 11
        cal.set(Calendar.DAY_OF_MONTH, 25);
        System.out.println("Updated Date: " + cal.getTime());

        // add(): Add days to the calendar
        cal.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("After adding 5 days: " + cal.getTime());

        // roll(): Roll the month without changing the year
        cal.roll(Calendar.MONTH, true); // Rolls forward one month
        System.out.println("After rolling month: " + cal.getTime());

        // getTime(): Get Date object
        Date date = cal.getTime();
        System.out.println("Date object: " + date);

        // setTime(): Set calendar from Date
        Calendar newCal = Calendar.getInstance();
        newCal.setTime(date);
        System.out.println("New Calendar from Date: " + newCal.getTime());

        // clear(): Clear all fields
        newCal.clear();
        System.out.println("After clear(): " + newCal.getTime());

        // getActualMaximum(): Max days in current month
        Calendar maxCal = Calendar.getInstance();
        int maxDays = maxCal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Max days in current month: " + maxDays);
    }
}
