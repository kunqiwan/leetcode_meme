package twoSum;

import java.util.Arrays;

public class lec455 {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n = g.length;
        int m = s.length-1;
        int res =0;
        for (int i =n-1;i>=0;i--){
            if (m<0){
                return res;
            }
            if (s[m] >= g[i]) {
                m--;
                res++;
            }
        }
        return res;
    }

}
