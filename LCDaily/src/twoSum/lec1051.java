package twoSum;

import java.util.Arrays;

public class lec1051 {
    public int heightChecker(int[] heights) {
        int[] old = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int count =0;
        for(int i=0;i<heights.length;i++){
            if(old[i]!=heights[i]){
                count++;
            }
        }
        return  count;
    }

    public static void main(String[] args){
        int [] s = {1,2,7,6,3,4};
        int [] old = s;
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(old));

    }
}
