package twoSum;

public class lec1470 {
    public int[] shuffle(int[] nums, int n) {
    int  [] result = new int [2*n];
    int m =0;
    for (int i =0;i<n;i = i+1){
        result [m] = nums[i];
        result[m+1] = nums[i+n];
        m = m+2;
    }
    return result;

    }
}
