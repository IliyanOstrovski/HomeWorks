package com.company.Homework7;

public class Task1 {
    public static void main(String[] args) {
        String firstStudent = "ППОЗЗП";
        String secondStudent = "PPОЗЗЗ";

        System.out.println(checkAttendance(firstStudent));
        System.out.println(checkAttendance(secondStudent));
    }

    public static boolean checkAttendance(String attendanceStr) {
        int absences = 0;
        int consecutiveLateness = 0;
        for (int i = 0; i < attendanceStr.length(); i++) {
            char c = attendanceStr.charAt(i);
            if (c == 'О') {
                absences++;
                if (absences > 2) {
                    return false;
                }
                consecutiveLateness = 0;
            } else if (c == 'З') {
                consecutiveLateness++;
                if (consecutiveLateness >= 3) {
                    return false;
                }
                absences = 0;
            } else if (c == 'П') {
                absences = 0;
                consecutiveLateness = 0;
            }
        }
        return true;
    }
}
