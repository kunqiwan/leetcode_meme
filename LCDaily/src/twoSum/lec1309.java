package twoSum;

import java.util.LinkedList;

public class lec1309 {

    public String freqAlphabets(String s) {
        LinkedList<Character> result = new LinkedList<>();
    int n = s.length();
    for(int m =n-1;m>=0;m--){
    if(s.charAt(m)=='#'){
    int second = Character.getNumericValue(s.charAt(m-1));
    int first  = Character.getNumericValue(s.charAt(m-2));
    int real_number = first*10+second+96;
    char letter = (char)real_number;
    result.add(0,letter);
    m = m-2;
    } else{
        int first  = Character.getNumericValue(s.charAt(m));
        int real_number = first+96;
        char letter = (char)real_number;
        result.add(0,letter);
    }

    }
        StringBuilder sb = new StringBuilder();
        for (char c : result) {
            sb.append(c);
        }

        String res = sb.toString();
    return  res;
    }
}
