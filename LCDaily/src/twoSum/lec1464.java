package twoSum;

public class lec1464 {
    public int maxProduct(int[] nums) {
        int max = 0;
        int second =0;
    for(int i=0;i< nums.length;i++){
        int current = nums[i];
        if(current>=second && current<max){
            second =current;
        }
        if (current>=max){
            second = max;
            max  = current;
        }
    }
    return (second-1)*(max-1);
    }
}
