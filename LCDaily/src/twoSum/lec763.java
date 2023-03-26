package twoSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lec763 {

    public List<Integer> partitionLabels(String s) {
        int n =s.length();
        // keep the last position of every letter
        int [] last = new int[26];
        for (int i=0;i<n;i++){
        last[s.charAt(i)-'a'] =i;
        }
        int max =0;
        List<Integer> res = new ArrayList<>();
        int save =0;
        for (int m=0;m<n;m++){
            int current = last[s.charAt(m)-'a'];
            //traverse every letter, and update the max last position
            if (current>max){
                max = current ;
            }
            //when the max last position == current position,it represents every letter is under this area
            if (m==max){
                //due to we start from zero, we need to add one
                res.add(m-save+1);
                //and the same,the last save position also need to add one
                save = m+1;
            }
        }
    return res;
    }

}
