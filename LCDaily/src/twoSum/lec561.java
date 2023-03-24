package twoSum;

import java.lang.reflect.Array;
import java.util.Arrays;

public class lec561 {

    public int arrayPairSum(int[] nums) {
        //sort, then every biggest two pair,we choose the smaller one,then add them together
        Arrays.sort(nums);
        int n = nums.length;
        int res =0;
        for (int i=n-2;i>=0;i =i-2){
            res =res +nums[i];
        }
        return res;
    }
}
