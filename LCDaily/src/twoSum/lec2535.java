package twoSum;

public class lec2535 {

    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int sum1 =0;
        int sum2 =0;
        for(int i=0;i<n;i++){
            int curr = nums[i];
            sum1 = sum1+curr;
            while(curr >0){
                int m = curr%10;
                sum2 =sum2+m;
                curr = curr/10;
            }
        }
        int result = Math.abs(sum1-sum2);
        return result;
    }
}
