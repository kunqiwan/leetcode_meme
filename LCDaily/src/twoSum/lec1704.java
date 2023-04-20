package twoSum;

import java.util.*;

public class lec1704 {
    public static boolean halvesAreAlike(String s) {
    int n = s.length();
    int left =0;
    int left_count = 0;
    int right_count =0;
    int right = n-1;
        Set<Character> owel = new HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray()) owel.add(c);
    while(left<=right){
        if (owel.contains(s.charAt(left))) {
            left_count++;
        }
        if(owel.contains(s.charAt(right))){
            right_count++;
        }

        left++;
        right--;
    }
    if(left_count == right_count){
        return true;
    } else {
        return false;

    }
    }
    public static void main(String[] args){
        String s = "Oo";
        System.out.println(halvesAreAlike(s));
    }
}
