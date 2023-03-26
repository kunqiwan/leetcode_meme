package twoSum;

import java.util.ArrayList;

public class lec171 {
    public static void main(String[] args){
        String s = "AB";
        System.out.println(titleToNumber(s));

    }

    public static int titleToNumber(String columnTitle) {
    int n = columnTitle.length();
    int res =0;
    int i = 0;
    int m = n;
    while (i<n){
       int current =  columnTitle.charAt(i)-'A'+1;
        System.out.println("current :"+current);
       double power = current*Math.pow(26,m-1);
        System.out.println("Power:"+power);
       res = (int)power+res;
       i++;
       m--;
    }
    return (int)res;
    }
}
