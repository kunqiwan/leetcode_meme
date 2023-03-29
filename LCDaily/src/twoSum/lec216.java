package twoSum;

import java.util.LinkedList;
import java.util.List;

public class lec216 {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new LinkedList<>();
        LinkedList<Integer> path = new LinkedList<>();
        int []nums = new int []{1,2,3,4,5,6,7,8,9};
        backtracking(result,path,k,n,0,nums);
        return result;
    }

    public void backtracking(List<List<Integer>> result, LinkedList<Integer> path,int k,int n,int startindex,int [] nums){
        if(path.size() == k){
            if (n==0) {
                result.add(new LinkedList<>(path));
            }
            return;
        }
        if (n<0){
            return;

        }        for (int i=startindex;i<nums.length;i++){
            if(nums[i] > n){
                break;
            }
            path.add(nums[i]);
            backtracking(result,path,k,n-nums[i],i+1,nums);
            path.removeLast();
        }
    }

}
