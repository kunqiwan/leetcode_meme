package twoSum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class lec557 {

    public static void main(String[] args){
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));



    }

   public static String reverseWords(String s) {
    String []strArray;
    ArrayList<String> res = new ArrayList<>();
    strArray = s.split(" ");
    for (int i=0;i<strArray.length;i++){
        String reverse ="";
        for (int m=strArray[i].length()-1;m>=0;m--){
            reverse = reverse+strArray[i].charAt(m);
        }

    res.add(reverse);
    }
    //convert list to string
       String str = String.join(" ", res);// convert array to string
    return str;
    }
}
