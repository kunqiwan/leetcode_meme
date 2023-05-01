package twoSum;

import java.util.Arrays;

public class lec1913 {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

//        int smallest = nums[0];
//        int largest = nums[nums.length-1];
        int n = nums.length-1;
//        int large_mu = 0;
//        int small_mu = 0;
//        for(int i=1;i<nums.length;i++){
//            if(nums[i] == smallest){
//            } else{
//                 small_mu = nums[i]* smallest;
//                 break;
//            }
//        }
//        for(int m=nums.length-2;m>=0;m--){
//            if(nums[m] == largest){
//            } else{
//                large_mu = nums[m]* largest;
//                break;
//            }
//        }
        return nums[n]*nums[n-1]-nums[0]*nums[1];
    }
}
