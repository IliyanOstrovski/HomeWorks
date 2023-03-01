package com.company.Homework8;

public class Task1 {
    public static void main(String[] args) {
        String date1 = "11-06-2021";
        String date2 = "12-06-2021";
        System.out.println(getDaysBetween(date1, date2));

        String date3 = "1-01-2021";
        String date4 = "1-02-2021";
        System.out.println(getDaysBetween(date3, date4));
    }

    public static int getDaysBetween(String dateStr1, String dateStr2) {
        String[] parts1 = dateStr1.split("-");
        String[] parts2 = dateStr2.split("-");

        int day1 = Integer.parseInt(parts1[0]);
        int month1 = Integer.parseInt(parts1[1]);
        int year1 = Integer.parseInt(parts1[2]);

        int day2 = Integer.parseInt(parts2[0]);
        int month2 = Integer.parseInt(parts2[1]);
        int year2 = Integer.parseInt(parts2[2]);

        int days1 = day1 + getDaysBeforeMonth(month1, year1) + (year1 - 1) * 365 + countLeapYears(year1);
        int days2 = day2 + getDaysBeforeMonth(month2, year2) + (year2 - 1) * 365 + countLeapYears(year2);

        return days2 - days1;
    }

    private static int getDaysInMonth(int month, int year) {
        return switch (month) {
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }

    private static int getDaysBeforeMonth(int month, int year) {
        int days = 0;
        for (int i = 1; i < month; i++) {
            days += getDaysInMonth(i, year);
        }
        return days;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private static int countLeapYears(int year) {
        return year / 4 - year / 100 + year / 400;
    }

}
