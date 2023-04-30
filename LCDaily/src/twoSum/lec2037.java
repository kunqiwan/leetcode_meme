package twoSum;

import java.util.Arrays;

public class lec2037 {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int count =0;
        for(int n=0;n<seats.length;n++){
           int step = Math.abs(seats[n]-students[n]);
           count = count+step;
        }
        return count;
    }
}
