package twoSum;

public class lec1313 {
    public int[] decompressRLElist(int[] nums) {

    int count =0;
    for(int i=0;i<nums.length;i =i+2){
        count = count+nums[i];
    }
        int [] result = new int [count];
    int index = 0;
    for(int k =0;k<nums.length;k = k+2){
        for(int m =0;m<nums[k];m++){
            result[index] =nums[k+1];
            index++;
        }
    }
    return result;
    }
}
