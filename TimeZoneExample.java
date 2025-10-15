package com.jsp.inbuiltclassMethods;

import java.util.Date;
import java.util.TimeZone;

public class TimeZoneExample {
    public static void main(String[] args) {
        // Get default time zone
        TimeZone tz = TimeZone.getDefault();
        System.out.println("Default TimeZone ID: " + tz.getID());
        System.out.println("Display Name: " + tz.getDisplayName());

        // Get specific time zone
        TimeZone kolkata = TimeZone.getTimeZone("Asia/Kolkata");
        System.out.println("Kolkata Offset (ms): " + kolkata.getRawOffset());

        // Check daylight saving
        System.out.println("Uses DST: " + kolkata.useDaylightTime());
        System.out.println("Is in DST now: " + kolkata.inDaylightTime(new Date()));

        // List all available IDs
        String[] ids = TimeZone.getAvailableIDs();
        System.out.println("Total TimeZone IDs: " + ids.length);
        System.out.println("First 5 IDs:");
        for (int i = 0; i < 5; i++) {
            System.out.println(" - " + ids[i]);
        }
    }
}
