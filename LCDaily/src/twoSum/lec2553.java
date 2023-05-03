package twoSum;

import java.util.LinkedList;

public class lec2553 {
    public int[] separateDigits(int[] nums) {
    StringBuffer sb = new StringBuffer("");
    for(int num:nums){
        sb.append(num);
    }
    int [] reesult = new int[sb.length()];
    for(int i=0;i<sb.length();i++){
        reesult[i] = sb.charAt(i)-'0';
    }
    return reesult;
    }
}
