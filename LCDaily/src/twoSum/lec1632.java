package twoSum;

import java.util.Arrays;

public class lec1632 {
    public int maximumWealth(int[][] accounts) {
        int max =0;
    for(int i=0;i<accounts.length;i++){
    int current_amount = Arrays.stream(accounts[i]).sum();
    max =Math.max(current_amount,max);
    }
    return max;
    }
}
