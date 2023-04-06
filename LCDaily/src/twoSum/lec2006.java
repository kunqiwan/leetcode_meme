package twoSum;

public class lec2006 {

    public int countKDifference(int[] nums, int k) {
        int result=0;
    int [] occ=new int [101];
    for (int i=0;i<nums.length;i++){
    occ[nums[i]]++;
    }
    for (int m=0;m<occ.length;m++){
        if (occ[m] >0){
            int target = m+k;
            if (target<=100 && occ[target]>0){
                result = result+ occ[m]*occ[target];
            }
        }

    }
return result;

    }
}
