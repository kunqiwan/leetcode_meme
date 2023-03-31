package twoSum;

public class lec1512 {

    public int numIdenticalPairs(int[] nums) {
    int [] occ =new int[101];
    for(int i=0;i<nums.length;i++){
    occ[nums[i]]++;
    }
    int result = 0;
    for (int m=0;m<occ.length;m++){
        int curr = occ[m];
        result = result+curr*(curr-1)/2;
    }
    return result;
    }
}
