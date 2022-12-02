import java.util.stream.IntStream;
public class twoSum {


    class Solution {
        public int pivotIndex(int[] nums) {
            int left = 0;
            int right = IntStream.of(nums).sum();
            for(int i=0;i<nums.length;i++){
                if(left == right -nums[i]){
                    return i;
                }
                left = left+nums[i];
                right = right - nums[i];

            }
            return -1;
        }
    }
}
