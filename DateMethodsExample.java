package com.jsp.inbuiltclassMethods;

import java.util.Date;

public class DateMethodsExample {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Current Date: " + now);

        long millis = now.getTime();
        System.out.println("Milliseconds since epoch: " + millis);

        Date customDate = new Date(1609459200000L); // Jan 1, 2021
        System.out.println("Custom Date: " + customDate);

        System.out.println("Is now after customDate? " + now.after(customDate));
        System.out.println("Is now before customDate? " + now.before(customDate));
        System.out.println("CompareTo result: " + now.compareTo(customDate));

        Date cloneDate = (Date) now.clone();
        System.out.println("Cloned Date: " + cloneDate);

        System.out.println("HashCode: " + now.hashCode());
    }
}
