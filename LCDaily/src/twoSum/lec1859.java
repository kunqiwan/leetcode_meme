package twoSum;

import java.util.ArrayList;

public class lec1859 {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        int n =arr.length;
       String [] result =new String[n];
       for(int i=0;i<n;i++){
           int digit = arr[i].length();
           char number =arr[i].charAt(digit-1);
           int current = Character.getNumericValue(number)-1;
           result[current] =arr[i].replaceAll("\\d", "");
       }

       String res = String.join(",", result);
       return res;
    }
}
