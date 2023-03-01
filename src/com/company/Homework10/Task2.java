package com.company.Homework10;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        int[][] intervals = {{1, 5}, {2, 4}, {8, 12}, {10, 13}};
        int[][] mergedIntervals = mergeRanges(intervals);
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public static int[][] mergeRanges(int[][] intervals) {
        // Check for null or empty input array
        if (intervals == null || intervals.length == 0) {
            return new int[0][2];
        }

        // Sort intervals array by start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        // Create a list to hold merged intervals
        List<int[]> merged = new ArrayList<>();

        // Initialize the first interval
        int[] currInterval = intervals[0];

        // Loop through the remaining intervals
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];

            // If the current interval overlaps with the next interval
            if (currInterval[1] >= interval[0]) {
                // Merge the intervals
                currInterval[1] = Math.max(currInterval[1], interval[1]);
            } else {
                // Add the current interval to the list of merged intervals
                merged.add(currInterval);
                // Set the current interval to the next interval
                currInterval = interval;
            }
        }

        // Add the last interval to the list of merged intervals
        merged.add(currInterval);

        // Convert the list of merged intervals to an array and return it
        return merged.toArray(new int[merged.size()][2]);
    }

}

