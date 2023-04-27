package twoSum;

public class lec2574 {

    public int[] leftRigthDifference(int[] nums) {
        int n = nums.length;
    int[]left_sum = new int[n];
    left_sum[0] =0;
    int[]right_sum = new int[n];
    right_sum [n-1] =0;
    int count =0;
    for(int i=1;i<n;i++){
    count = count+nums[i-1];
    left_sum[i] = count;
    }
    count =0;
    for(int i=n-2;i>=0;i--){
            count = count+nums[i+1];
        right_sum[i] = count;
    }
    int [] result = new int[n];
    for(int m=0;m<left_sum.length;m++){
        result[m] = Math.abs(left_sum[m]-right_sum[m]);
    }
    return result;
    }
}
